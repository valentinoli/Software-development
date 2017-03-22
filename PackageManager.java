
import java.util.Date;

public class PackageManager {
	
	private TravelPackage packageInMaking;
	
	/* Default constructor */
	
	/* Instance methods */
	public void createNewPackage(Customer customer) {		
		this.packageInMaking = new TravelPackage(customer);
	}
	
	public void bookPackage() {
		/* missing implementation */
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
