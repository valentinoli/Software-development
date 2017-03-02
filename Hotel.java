
public class Hotel {
	
	private String name;
	private String address;
	private String phone;
	private int price;
	
	public Hotel(String name, String address, String phone, int price) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

	public int getPrice() {
		return price;
	}
	
}
