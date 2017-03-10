import java.util.Date;

public class DayTour {
	
	/* Reminder: Make sure the following 
	 * corresponds to the Day-tour-team's implementation
	 */	
	
	private String name;
	private String phone;
	private String email;
	private String location;
	private Date time;
	private int duration;
	private int price;
	private String tags;
	private int ticketsAvailable;
	
	/* Constructor */
	public DayTour(String name, String phone, String email, String location, Date time, int duration, int price,
			String tags, int ticketsAvailable) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.location = location;
		this.time = time;
		this.duration = duration;
		this.price = price;
		this.tags = tags;
		this.ticketsAvailable = ticketsAvailable;
	}
	
	/* Instance methods */
	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public String getLocation() {
		return location;
	}

	public Date getTime() {
		return time;
	}

	public int getDuration() {
		return duration;
	}

	public int getPrice() {
		return price;
	}

	public String getTags() {
		return tags;
	}

	public int getTicketsAvailable() {
		return ticketsAvailable;
	}
	
	
	
}
