package src;
import java.util.Date;
import java.util.List;

public class PackageManager {
	
	private TravelPackage packageInMaking;
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
	}	
	
	public TravelPackage getPackage() {
		return packageInMaking;
	}
	
	public void bookPackage() {
		fres.book(packageInMaking.getInbound());
		fres.book(packageInMaking.getOutbound());
		// hres.book(packageInMaking.getHotel());
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
		} else if(airportCode.length() != 3) {
			throw new IllegalArgumentException("The airport code is invalid");
		} else if(travellers < 1) {
			System.out.println("Number of travellers must be 1 or higher");
			return null;
		}
		if(inbound) {
			return fsearch.search(departureDate, "KEF", airportCode, travellers); // inbound flights
		} else {
			return fsearch.search(departureDate, airportCode, "KEF", travellers); // outbound flights
		}
	}	
	
	public List<Hotel> searchHotels(Date arrivalDate, Date returningDate) {
		if(returningDate.before(arrivalDate)) {
			throw new IllegalArgumentException("Date of returning must follow date of arrival.");
		} else if(arrivalDate == null || returningDate == null) {
			throw new IllegalArgumentException("Please select both the dates of arrival and return");
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

}
