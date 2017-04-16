package Customer;
import testing.*;
import java.util.Scanner;
public class Keyrsla {
	
	public static void main(String [] args){
		System.out.println("Insert 1 to search by location or 2 to search by date");
		
		Keyrsla a = new Keyrsla();
		a.searchFlightLocation();
		//Keyrsla b = new Keyrsla();
		//b.searchFlightDate();
	}
	private void searchFlightLocation(){
		FlightSearch s = new FlightSearch();
		System.out.println("Insert Location");
		Scanner a = new Scanner(System.in);
		String location = a.nextLine();
		System.out.println(s.searchByDepartureLocation(location));
	}
	/*private void searchFlightDate(){
		FlightSearch t = new FlightSearch();
		System.out.println("Insert Date");
		Scanner b = new Scanner(System.in);
		String date = b.nextLine();
		System.out.println(t.searchByDate(date));
	}
	*/
	
}
