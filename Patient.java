/**
 * @author Dhanish Ashraf
 * The class Patient implements Measureable
 */

public class Patient implements Measurable {
	
	private String name;
	private int age;
	private double weight;
	
	/** This constructor creates a patient using their name, age and weight.
	 * @param name The name of the patient as a string
	 * @param age The age of the patient as the the type int
	 * @param weight The weight of the patient as the type double
	 */
	public Patient(String name, int age, double weight){
		
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	/** A setter for the weight of the patient
	 * @param weight sets the weight of the patient
	 */
	public void setWeight(double weight){ 
		this.weight = weight;
	}
	
	/** A getter for the weight
	 * @return the weight of the patient as type double
	 */
	public double getWeight(){ 
		return weight;
	}
	
	/** A getter for the weight
	 * @return the getWeight() getter which returns the weight of the patient
	 */
	public double weight(){ 
		return getWeight();
	}

	/** Refers to the public method signature, getMeasure(), in the interface Measurable 
	 * @return the weight
	 */
	public double getMeasure(){
		return this.weight;
	}
}
