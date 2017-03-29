package test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import src.*;

import org.junit.*;

public class PackageManagerTest {
	
	private PackageManager manager;
	private SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	
	@Before
	public void setUp() {
		manager = new PackageManager(new FlightSearchMock(), new HotelSearchMock(), new DayTourSearchMock(), 
				new FlightReservationMock(), new HotelReservationMock(), new DayTourReservationMock());
	}
	
	@After
	public void tearDown() {
		manager = null;
	}
	
	// Tests for searching flights
	
	@Test
	public void testSearchFlights() throws IllegalArgumentException {
		Date date;
		try {
			date = format.parse("15/04/2017");
			String code = "JFK"; 
			List<Flight> list = manager.searchFlights(date, code, true);
			assertNotNull(list); // Is this ok?
		} catch (ParseException e) {
			System.out.println("Parse exception");
		}
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testSearchFlightsNoDepartingDate() {
		Date date = null;
		this.manager.searchFlights(date, "JFK", true);
	}

	@Test(expected=IllegalArgumentException.class)
	public void testSearchFlightsWithNoCode() {
		Date departing;
		try {
			departing = format.parse("15/04/2017");
			this.manager.searchFlights(departing, "", true);
		} catch (ParseException e) {
			// Can't happen here...
			System.out.println("Parse exception");
		}
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testSearchOutboundFlightsIllegalAirport() {
		Date departing;
		try {
			departing = format.parse("15/04/2017");
			// valid airport codes consist of 3 characters
			this.manager.searchFlights(departing, "LA", true);
		} catch (ParseException e) {
			// Can't happen here ...
			System.out.println("Parse exception");
		}
	}
	
	// Tests for searching hotels
	
	@Test
	public void testSearchHotels() throws IllegalArgumentException {
		Date arrival, returning;
		try {
			arrival = format.parse("15/04/2017");
			returning = format.parse("15/05/2017");
			List<Hotel> list = manager.searchHotels(arrival, returning);
			assertNotNull(list); // Is this ok?
		} catch (ParseException e) {
			System.out.println("Parse exception");
		}
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testSearchHotelsMissingDate() {
		Date arrival, returning;
		try {
			arrival = null;
			returning = format.parse("15/05/2017");
			this.manager.searchHotels(arrival, returning);
		} catch (ParseException e) {
			System.out.println("Parse exception");
		}
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testSearchHotelsWrongOrderOfDates() {
		Date arrival, returning;
		try {
			arrival = format.parse("15/05/2017");
			returning = format.parse("15/04/2017");
			this.manager.searchHotels(arrival, returning);
		} catch (ParseException e) {
			System.out.println("Parse exception");
		}
	}
	
	// Tests for booking a package
	
	@Test
	public void testBookPackage() {
		TravelPackage myPackage = manager.getPackage();
		// ... do something to package
		manager.bookPackage();
	}

}
