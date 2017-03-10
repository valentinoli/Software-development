
import java.io.Serializable;
import java.util.Vector;
import java.util.Date;

public class PackageManager implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Vector<TravelPackage> packages;
	
	/* Default constructor */
	
	/* Instance methods */
	public TravelPackage createNewPackage(Customer customer) {
		
		TravelPackage newPackage = new TravelPackage(customer);
		this.packages.add(newPackage);		
		return newPackage;
	}
	
	public void deletePackage(int index) {
		
		if(index < 0 || index >= packages.size()) {
			throw new IndexOutOfBoundsException();
		}
		this.packages.remove(index);
	}
	
	public Flight[] searchFlights(Date departing, Date returning) {
		
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
