
public class TravelPackage {
	
	private int id;
	private int price;
	private int travellers;
	private Flight outbound;
	private Flight inbound;
	private Hotel hotel;
	private DayTour[] daytour;
	private Customer customer;
	private Review review;
	
	public TravelPackage(Customer customer, int id) {
		this.customer = customer;
		this.id = id;
	}
	
	public void bookPackage() {
		/* Unfinished */
		return;
	}
	
	public int getId() {
		return id;
	}

	public int getPrice() {
		return price;
	}

	public int getTravellers() {
		return travellers;
	}

	public Flight getOutbound() {
		return outbound;
	}

	public Flight getInbound() {
		return inbound;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public DayTour[] getDaytour() {
		return daytour;
	}

	public Customer getCustomer() {
		return customer;
	}

	public Review getReview() {
		return review;
	}

	public void setTravellers(int travellers) {
		this.travellers = travellers;
	}

	public void setOutbound(Flight outbound) {
		this.outbound = outbound;
	}

	public void setInbound(Flight inbound) {
		this.inbound = inbound;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public void setDaytour(DayTour[] daytour) {
		this.daytour = daytour;
	}
}
