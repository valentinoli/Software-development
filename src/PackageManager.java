package src;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Vector;

public class PackageManager {
	
	private TravelPackage packageInMaking;
	private Vector<String> codes; // all valid airport codes
	private FlightSearch fsearch;
	private HotelSearch hsearch;
	private DayTourSearch dtsearch;
	private FlightReservation fres;
	private HotelReservation hres;
	private DayTourReservation dtres;
		
	public PackageManager(FlightSearch fsearch, HotelSearch hsearch, DayTourSearch dtsearch, 
			FlightReservation fres, HotelReservation hres, DayTourReservation dtres) {
		this.packageInMaking = new TravelPackage();
		this.fsearch = fsearch;
		this.hsearch = hsearch;
		this.dtsearch = dtsearch;
		this.fres = fres;
		this.hres = hres;
		this.dtres = dtres;
		this.codes = generateCodes();
	}	
	
	public TravelPackage getPackage() {
		return packageInMaking;
	}
	
	public void bookPackage() {
		fres.book(packageInMaking.getInbound());
		fres.book(packageInMaking.getOutbound());
		
		Date arrival = packageInMaking.getOutbound().getArrivalTime();
		Date returning = packageInMaking.getInbound().getDepartureTime();
		int travellers = packageInMaking.getTravellers();
		hres.book(packageInMaking.getHotel(), arrival, returning, travellers);
		
		for(DayTour tour : packageInMaking.getDayTours()) {
			dtres.book(tour);
		}
	}
	
	/* 
	 * If @param inbound is true, this method searches for inbound flights from
	 * KEF airport to the destination specified by @param airportCode. 
	 * Otherwise the method searches for outbound flights from the origin specified
	 * by @param airportCode to KEF airport
	 */
	public List<Flight> searchFlights(Date departureDate, String airportCode, boolean inbound) {
		int travellers = packageInMaking.getTravellers();
		if(airportCode == "") {
			throw new IllegalArgumentException("Please select your travel origin");
		} else if(!codes.contains(airportCode)) {
			throw new IllegalArgumentException("The airport code is invalid");
		} else if(departureDate == null) {
			throw new IllegalArgumentException("Please select both the dates of arrival and return");
		}
		if(inbound) {
			return fsearch.search(departureDate, "KEF", airportCode, travellers); // inbound flights
		} else {
			return fsearch.search(departureDate, airportCode, "KEF", travellers); // outbound flights
		}
	}	
	
	public List<Hotel> searchHotels(Date arrivalDate, Date returningDate) {
		if(arrivalDate == null || returningDate == null) {
			throw new IllegalArgumentException("Please select both the dates of arrival and return");
		} else if(returningDate.before(arrivalDate)) {
			throw new IllegalArgumentException("Date of returning must follow date of arrival.");
		}
		return hsearch.search(arrivalDate, returningDate, getPackage().getTravellers());
	}
	
	public List<DayTour> searchDayTours(Date arrivalDate, Date returningDate) {
		if(returningDate.before(arrivalDate)) {
			throw new IllegalArgumentException("Date of returning must follow date of arrival.");
		} else if(arrivalDate == null || returningDate == null) {
			throw new IllegalArgumentException("Please select both the dates of arrival and return");
		}
		return dtsearch.search(arrivalDate, returningDate, getPackage().getTravellers());		
	}
	
	private static Vector<String> generateCodes() {
		Vector<String> codes = new Vector<>();
		try (BufferedReader br = new BufferedReader(new FileReader(new File("airportCodes.txt")))) {
			String line; String[] s;
		    while ((line = br.readLine()) != null) {
		       s = line.split(",");		       
		       if(s[4].length() == 5) {
		    	   codes.add(s[4].substring(1, 4));
		       }
		    }
		} catch (FileNotFoundException e) {
			System.out.println("File containing airport codes was not found");
		} catch (IOException e) {
			System.out.println("Reading airport codes resulted in an IOException");
		}
	    return codes;
	}

}
