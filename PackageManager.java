
import java.util.Date;

public class PackageManager {
	
	private TravelPackage packageInMaking;
	
	public PackageManager(TravelPackage newPackage) {
		this.packageInMaking = newPackage;
	}
	
	
	public void bookPackage() {
		FlightReservationMock.book(packageInMaking.getInbound());
		FlightReservationMock.book(packageInMaking.getOutbound());
		HotelReservationMock.book(packageInMaking.getHotel());
		for(DayTour tour : packageInMaking.getDayTours()) {
			DayTourReservationMock.book(tour);
		}
		
	}
	
	public Flight[] searchFlights(Date departing, Date returning, String origin) {
		
		/* missing implementation */
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
