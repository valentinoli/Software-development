package src;

import java.util.Date;

public class HotelReservationMock implements HotelReservation {
	
	public void book(Hotel hotel, Date start, Date end, int num) {
		System.out.println("Hotel: " + hotel.getName() + " reserved.");
	}
}
