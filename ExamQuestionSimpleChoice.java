

import java.util.ArrayList;
import java.util.Arrays;

/** This class is a subclass ExamQuestion by providing a set of possible answers and checking
 * if the choice is right
 * @author Dhanish Ashraf
 *
 */
public class ExamQuestionSimpleChoice extends ExamQuestion { 
	
	private ArrayList<String> possibleAnswers;
	private int answer;
	
	/** This constructor sets the exam question
	 * @param questionText the exam question
	 * @param maximalMark the max mark of the question
	 * @param possibleAnswers the ArrayList of possible answers
	 * @param answer the answer to the question
	 */
	public ExamQuestionSimpleChoice(String questionText, int maximalMark, 
			ArrayList<String> possibleAnswers, int answer){ 
		super(questionText, maximalMark);
		this.possibleAnswers = possibleAnswers;
		this.answer = answer;	
	}
	
	/** this method returns the appropriate number of marks
	 * @param value is the value the user thinks the answer is
	 * @return the number of marks awarded for the question
	 */
	public int mark(int value){ 
		if(value == answer)
			return getMaximalMark();
		else
			return 0;
	}
	
	public String toString(){
		return super.toString() + " The possible choices are: " + possibleAnswers + 
				" and the correct choice is choice " + answer + ".";
	}

}
