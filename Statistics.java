import java.util.ArrayList;

/**
 * @author Dhanish Ashraf
 * A class Statistics which makes use of the interface Measurable and
 * calculates the mean and standard deviation of ArrayLists.
 */
public class Statistics {
	
	/** A method to work out the mean
	 * @param list The ArrayList of values to work out the mean for
	 * @return the mean as type double
	 */
	public static double mean(ArrayList<Measurable> list){ 
		
		double total = 0;
		for(Measurable d: list){
			total += d.getMeasure();
		}
	
		double mean = total/list.size();
		return mean;
	}
	
	/** A method to work out the standard deviation
	 * @param list list The ArrayList of values to work out the standard deviation for
	 * @return
	 */
	public static double standardDeviation(ArrayList<Measurable> list){ 
		
		double average = mean(list);
		double part1 = 0;
		
		for(Measurable i: list){
			part1 += Math.pow((i.getMeasure() - average), 2);
		}
		 double result = Math.sqrt(part1/list.size());
		 return result;
	}

}