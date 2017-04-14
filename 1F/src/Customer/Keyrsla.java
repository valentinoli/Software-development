package Customer;
import testing.*;
import java.util.Scanner;
public class Keyrsla {
	
	public static void main(String [] args){
		Keyrsla a = new Keyrsla();
		a.searchFlight();
	}
	private void searchFlight(){
		FlightSearch s = new FlightSearch();
		System.out.println("Insert Location");
		Scanner a = new Scanner(System.in);
		String location = a.nextLine();
		System.out.println(s.searchByDepartureLocation(location));
	
	}
}
