package src;
import java.util.Date;

public class PackageManager {
	
	private TravelPackage packageInMaking = new TravelPackage();
	
	/* Default constructor */
	
	public TravelPackage getPackage() {
		return packageInMaking;
	}	
	
	public void bookPackage() {

		/*FlightReservationMock.book(packageInMaking.getInbound());
		FlightReservationMock.book(packageInMaking.getOutbound());
		HotelReservationMock.book(packageInMaking.getHotel());
		for(DayTour tour : packageInMaking.getDayTours()) {
			DayTourReservationMock.book(tour);
		}	*/	
	}
	
	public Flight[] searchOutboundFlights(Date departing, String origin) {
		
		FlightReservationMock.book(packageInMaking.getInbound());
		FlightReservationMock.book(packageInMaking.getOutbound());
		HotelReservationMock.book(packageInMaking.getHotel());
		for(DayTour tour : packageInMaking.getDayTours()) {
			DayTourReservationMock.book(tour);
		}

		//FlightSearch.search(departing, origin, "KEF");
		return null;
	}
	
	public Flight[] searchInboundFlights(Date departing, String destination) {
		
		/* missing implementation */
		//FlightSearch.search(departing, "KEF", destination);
		return null;
	}
	
	public Hotel[] searchHotels(Date departing, Date returning) {
		
		/* missing implementation */
		return null;
	}
	
	public DayTour[] searchDayTours(Date departing, Date returning) {
		
		/* missing implementation */
		return null;		
	}

}
