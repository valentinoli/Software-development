package testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DateTest {
	private Flight flug1, flug2;
	
	@Before
	public void setUp() {
		flug1 = new Flight("15.04.2017","RKV","AEY","1600","1645", 166,"Sat",35, true);
		flug2 = new Flight("15.04.2017","AEY","RKV", "2130", "2105", 167,"Sat",23, false);
	}
	
	@After
	public void tearDown(){
		flug1 = null;
		flug2 = null;
	}

	@Test
	public void test() {
		assertEquals(flug1,flug2);
	}

}
