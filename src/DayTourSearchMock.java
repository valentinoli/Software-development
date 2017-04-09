package src;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import edu.princeton.cs.algs4.In;

public class DayTourSearchMock implements DayTourSearch {

	@Override
	public List<DayTour> search(Date departing, Date returning, int num) {
		In in = new In("DayTourMockData.txt");
		String[] array = in.readAllLines();
		List<DayTour> tours = new ArrayList<>();
		for(String s : array) {
			String[] info = s.split(";");
			int dur = Integer.parseInt(info[1]);
			int time = Integer.parseInt(info[3]);
			int seats = Integer.parseInt(info[4]);
			int price = Integer.parseInt(info[5]);
			DayTour tour = new DayTour(info[0], dur, info[2], time, seats, price);
		} return null;
	}
	
	public static void main(String[] args) {
		DayTourSearchMock mock = new DayTourSearchMock();
		mock.search(new Date(), new Date(), 1);
	}
	
}
