package src;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HotelSearchMock implements HotelSearch {

	@Override
	public List<Hotel> search(Date departing, Date returning, int num) {
		Hotel hotel1 = new Hotel();
		Hotel hotel2 = new Hotel();
		List<Hotel> list = new ArrayList<>();
		list.add(hotel1);
		list.add(hotel2);
		return list;
	}
}
