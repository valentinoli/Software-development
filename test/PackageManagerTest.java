package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import src.*;

import org.junit.*;

public class PackageManagerTest {
	
	private PackageManager manager;
	private SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	
	@Before
	public void setUp() {
		manager = new PackageManager(new FlightSearchMock(), );
	}
	
	@After
	public void tearDown() {
		manager = null;
	}
	
	@Test
	public void testSearchOutboundFlights() throws IllegalArgumentException {
		Date departing;
		try {
			departing = format.parse("15/04/2017");
			String origin = "JFK";
			manager.searchOutboundFlights(departing, origin);
		} catch (ParseException e) {
			System.out.println("Parse exception");
		}
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testSearchOutboundFlightsNoDepartingDate() {
		String origin = "JFK";
		manager.searchOutboundFlights(null, origin);
	}

	@Test(expected=IllegalArgumentException.class)
	public void testSearchOutboundFlightsNoOrigin() {
		Date departing;
		try {
			departing = format.parse("15/04/2017");
			manager.searchOutboundFlights(departing, "");
		} catch (ParseException e) {
			// Can't happen
			System.out.println("Parse exception");
		}
	}
	
	@Test(expected=ParseException.class)
	public void testSearchOutboundFlightsInvalidDateFormat() {
		Date departing = format.parse("1/4/23");
	}

}
