import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;
/**
 * Public tests for Worksheet 4, Exercise 1. They test the
 * getMeasure() methods for invoices and patients. Furthermore the
 * mean and standard deviation for ArrayList of type Measurable.
 *
 * @author Dhanish Ashraf
 *
 */
public class MeasurableTests {

	@Test
	public void ex1PublicTest1() {
		Invoice invoice = new Invoice("66483905", "60-03-12", 12345);
		
		double expected = 12345;
		double actual = invoice.getMeasure();
		double tolerance = 1e-8;
		
		assertEquals("The invoice was incorrect", expected, actual, tolerance);
	}

	@Test
	public void ex1PublicTest2() {
		Patient patient = new Patient("Huzaifa Ashraf", 7, 30);
		
		double expected = 30;
		double actual = patient.getMeasure();
		double tolerance = 1e-8;
		
		assertEquals("The patients weight is incorrect", expected, actual, tolerance);
	}
	
	@Test
	public void ex1PublicTest3() {
		
		ArrayList<Measurable> invoices = new ArrayList<>();
		
		for (int i = 1; i <= 10; i++) {
			invoices.add(new Invoice("14525489", "77-95-62", i*10));
		
		}
		
		double expected = 55;
		double actual = Statistics.mean(invoices);
		double tolerance = 1e-8;
		
		assertEquals("The invoice was incorrect", expected, actual, tolerance);
	}
	
	@Test
	public void ex1PublicTest4() {
		
		ArrayList<Measurable> patients = new ArrayList<>();
		
		for (int i = 1; i <= 10; i++){
			patients.add(new Patient("John Doe", 35, i*20));
		}
		
		double expected = 57.445626465380286;
		double actual = Statistics.standardDeviation(patients);
		double tolerance = 1e-8;
		
		assertEquals("The standard deviation was incorrect", expected, actual, tolerance);
	}
}
