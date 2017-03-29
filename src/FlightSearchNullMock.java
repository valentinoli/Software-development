package src;

import java.util.Date;
import java.util.List;

public class FlightSearchNullMock implements FlightSearch {
	@Override
	public List<Flight> search(Date departing, String origin, String destination, int passengers) {
		return null;
	}
}
