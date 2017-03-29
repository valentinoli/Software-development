package src;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FlightSearchEmptyMock implements FlightSearch {
	@Override
	public List<Flight> search(Date departing, String origin, String destination, int passengers) {
		return new ArrayList<Flight>();
	}
}
