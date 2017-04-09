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
	private Date time;
	private int availableSeats;
	private int price;
	
	/* Constructor */
	public DayTour(String name, int duration, String location, String time, String date, int availableSeats, 
			int price) throws ParseException {
		this.name = name;
		this.duration = duration;
		this.location = location;
		this.availableSeats = availableSeats;
		this.price = price;
		SimpleDateFormat format = new SimpleDateFormat("ddMMyyyyHHmm");
		this.time = format.parse(date + time);
		
		
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
