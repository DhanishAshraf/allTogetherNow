

/**
 * @author Dhanish Ashraf
 * This class sets and gets the max speed and max number of passengers of a vehicle 
 */
public class Vehicle {
	
	private double maxSpeed;
	private int maxPassengers;
	
	/** This constructor creates a vehicle using its max speed and number of passengers
	 * @param maxSpeed is the maximum speed of the vehicle as a double
	 * @param maxPassengers is the maximum number of passengers the vehicle can fit as int
	 */
	public Vehicle(double maxSpeed, int maxPassengers){
		
		this.maxSpeed = maxSpeed;
		this.maxPassengers = maxPassengers;
	}
	
	/** This method sets the maximum speed of the vehicle
	 * @param newMaxSpeed is the maximum speed of the vehicle
	 */
	public void setMaxSpeed(double newMaxSpeed){
		this.maxSpeed = newMaxSpeed;
	}
	
	/** This method sets the max number of passengers
	 * @param newMaxPassengers is the maximum number of passengers
	 */
	public void setMaxPassengers (int newMaxPassengers){ 
		this.maxPassengers = newMaxPassengers;
	}
	
	/** This method returns the maximum speed
	 * @return maxSpeed which is the max speed
	 */
	public double getMaxSpeed(){
		return maxSpeed;
	}
	
	/** The method returns the maximum number of passengers
	 * @return maxPassengers
	 */
	public int getMaxPassengers(){ 
		return maxPassengers;
	}
	
	/** This method decides whether passenger(s) should be plural or singular
	 * @return string of a plural or singular passenger
	 */
	public String getPluralOrSingular(){ 
		if(getMaxPassengers() > 1)
			return "passengers";
			else
				return "passenger";
	}
	
	public String toString(){
		return "The vehicle has a maximal speed of " + getMaxSpeed() + " km/h." + " It carries " + getMaxPassengers() + 
		" " + getPluralOrSingular() + ".";
	}

}
