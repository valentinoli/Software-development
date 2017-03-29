package src;
import java.util.Date;
import java.util.List;

public interface HotelSearch {
	
	/* needs clarification */
	public List<Hotel> search(Date departing, Date returning, int travellers);
}
