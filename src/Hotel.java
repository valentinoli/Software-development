package src;
import java.util.Date;
import edu.princeton.cs.algs4.ST;

public class Hotel {
	
	private String name;
	private String location;
	private ST<Date, Integer> roomsPerDate;
	private int price;
	
	public Hotel(String name, String location, int price) {
		this.name = name;
		this.location = location;
		this.price = price;
		roomsPerDate = new ST<>();
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return location;
	}

	// Er Hotel-hópurinn ekki alveg örugglega með svona aðferð?
	public ST<Date, Integer> getRoomsPerDate() {
		return roomsPerDate;
	}

	// Hotel-hópurinn ekki með svona aðferð...
	public int getPrice() {
		return price;
	}
	
	
}
