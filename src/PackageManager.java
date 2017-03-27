package src;
import java.util.Date;

public class PackageManager {
	
	private TravelPackage packageInMaking = new TravelPackage();
	
	/* Default constructor */
	
	
	public TravelPackage getPackage() {
		return packageInMaking;
	}	
	
	public void bookPackage() {
		FlightReservationMock flres = new FlightReservationMock();
		HotelReservationMock htlres = new HotelReservationMock();
		DayTourReservationMock dtrres = new DayTourReservationMock();
		flres.book(packageInMaking.getInbound());
		flres.book(packageInMaking.getOutbound());
		htlres.book(packageInMaking.getHotel());
		for(DayTour tour : packageInMaking.getDayTours()) {
			dtrres.book(tour);
		}
	}
	
	public Flight[] searchOutboundFlights(Date departing, String origin) {
		FlightSearch flsearch = new FlightSearch();
		flsearch.search(departing, origin, "KEF");
		if(origin == "") throw new IllegalArgumentException("Origin is empty string");
		else if(!origin.isValid()) throw new IllegalArgumentException("Origin is an invalid airport");
		return null;
	}
	
	public Flight[] searchInboundFlights(Date departing, String destination) {
		FlightSearchMock flsearch = new FlightSearchMock();
		flsearch.search(departing, "KEF", destination);
		return null;
	}
	
	public Hotel[] searchHotels(Date departing, Date returning) {
		HotelSearchMock htlsearch = new HotelSearchMock();
		// htl.search(departing, returning);
		return null;
	}
	
	public DayTour[] searchDayTours(Date departing, Date returning) {
		
		/* missing implementation */
		return null;		
	}

}
