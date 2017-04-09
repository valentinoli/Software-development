package src;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DayTour {
	
	/* Reminder: Make sure the following 
	 * corresponds to the Day-tour-team's implementation
	 */	
	
	private String name;
	private int duration;
	private String location;
	private int length;
	private Date time;
	private int availableSeats;
	private int price;
	
	/* Constructor */
	public DayTour(String name, int duration, String location, int length, int time, int availableSeats, 
			int price) throws ParseException {
		this.name = name;
		this.duration = duration;
		this.location = location;
		this.length = length;
		this.availableSeats = availableSeats;
		this.price = price;
		SimpleDateFormat format = new SimpleDateFormat("ddMMyyyy");
		this.time = format.parse(Integer.toString(time));
		
		
	}
	/* Instance methods */
	public String getName() {
		return name;
	}

	public int getDuration() {
		return duration;
	}

	public String getLocation() {
		return location;
	}

	public int getLength() {
		return length;
	}

	public Date getTime() {
		return time;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}

	public int getPrice() {
		return price;
	}
	

	
	
}
