

import static org.junit.Assert.assertEquals;

import org.junit.Test;
/**
 * Public tests for Worksheet 4, Exercise 2. Four tests to check the toString()
 * method for the Vehicle and Car classes.
 * @author Dhanish Ashraf
 *
 */
public class VehicleTests {
	
	private Vehicle vehicle;

	@Test
	public void ex2PublicTest1() {
		vehicle = new Vehicle(300, 1);
		
		String expected = "The vehicle has a maximal speed of 300.0 km/h. " +
				"It carries 1 passenger.";
		String actual = vehicle.toString();
		
		System.out.println(expected);
		System.out.println(actual);
		
		assertEquals(expected, actual);
	}

	@Test
	public void ex2PublicTest2() {
		vehicle = new Vehicle(127, 3);
		
		String expected = "The vehicle has a maximal speed of 127.0 km/h. " +
				"It carries 3 passengers.";
		String actual = vehicle.toString();
		
		assertEquals(expected, actual);
	}

	@Test
	public void ex2PublicTest3() {
		vehicle = new Car(333.7, 1, 1.3);
		
		String expected = "The vehicle has a maximal speed of 333.7 km/h. " +
				"It carries 1 passenger. " +
				"Its fuel consumption is 1.3 l/100km.";
		String actual = vehicle.toString();
				
		assertEquals(expected, actual);
	}

	@Test
	public void ex2PublicTest4() {
		vehicle = new Car(157.67, 5, 9.87);
		
		String expected = "The vehicle has a maximal speed of 157.67 km/h. " +
				"It carries 5 passengers. " +
				"Its fuel consumption is 9.87 l/100km.";
		String actual = vehicle.toString();
		
		assertEquals(expected, actual);
	}
}

