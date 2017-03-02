
public class PackageManager {
	
	private TravelPackage[] packages;
	
	/* Default constructor */
	
	public TravelPackage createNewPackage(Customer customer) {
		
		
		TravelPackage newPackage = new TravelPackage(customer, packages.length);
		
		
		
		return newPackage;
	}

}
