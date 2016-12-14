

/** 
 * @author Dhanish Ashraf
 * The class car extends vehicle but also has the fuelConsumption of the vehicle
 */
public class Car extends Vehicle { 
	
	private double fuelConsumption;
	
	/** The constructor of the car with max speed, max number of passengers and fuel consumption
	 * @param maxSpeed is the max speed of the car
	 * @param maxPassenger is the max passenger of the car
	 * @param fuelConsumption is the fuel consumption of the car
	 */
	public Car(double maxSpeed, int maxPassenger, double fuelConsumption) { 
		
		super(maxSpeed, maxPassenger);
		this.fuelConsumption = fuelConsumption;
	}
	
	/** sets the fuel consumption of car
	 * @param fuelConsumption is the fuel consumption of the car
	 */
	public void setFuelConsumption(double fuelConsumption){ 
		this.fuelConsumption = fuelConsumption;
	}
	
	/** this method returns the fuel consumption
	 * @return fuelConsumption 
	 */
	public double getFuelConsumption(){
		return fuelConsumption;
	}
	
	public String toString(){
		return super.toString() + " Its fuel consumption is " + getFuelConsumption() + " l/100km.";
	}

}