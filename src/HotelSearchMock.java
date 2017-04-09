package src;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import edu.princeton.cs.algs4.In;

public class HotelSearchMock implements HotelSearch {

	@Override
	public List<Hotel> search(Date departing, Date returning, int num) {
		In in = new In("hotels.txt");
		String[] lines = in.readAllLines();
		List<Hotel> hotels = new ArrayList<>();
		SimpleDateFormat format = new SimpleDateFormat("ddMMyy");
		
		for(String line : lines) {
			if(line.equals(lines[0])) { continue; }
			String[] info = line.split("; ");
			boolean exists = false;
			Hotel hotel = null;
			for(Hotel h : hotels) {
				if(h.getName().equals(info[0])) {
					hotel = h;
					exists = true;
					break;
				}
				
			}
			if(!exists) {
				hotel = new Hotel(info[0], info[1], Integer.parseInt(info[4]));
				hotels.add(hotel);
			}
			try {
				Date date = format.parse(info[2]);
				hotel.getRoomsPerDate().put(date, Integer.parseInt(info[3]));
				exists = true;
			} catch (ParseException e) { }	
		}
		
		return hotels;
	}
	
	public static void main(String[] args) {
		System.out.println("Execution started");
		System.out.println();
		HotelSearchMock mock = new HotelSearchMock();
		List<Hotel> list = mock.search(new Date(), new Date(), 1);
		for(Hotel t : list) {
			System.out.println(t.getName());
			System.out.println();
			for(Date date : t.getRoomsPerDate().keys()) {
				System.out.println("Date: " + date + " Available rooms: " + t.getRoomsPerDate().get(date));
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Execution terminated");
	}
}
