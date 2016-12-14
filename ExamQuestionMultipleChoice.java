

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/** This class is a subclass of Exam question and sets a multiple choice question
 *  where 1 or more answers might be correct.
 * @author Dhanish Ashraf
 *
 */
public class ExamQuestionMultipleChoice extends ExamQuestion { 
	
	ArrayList<String> possibleAnswers; //answers are supposed to be a choice from the list
	ArrayList<Integer> correctAnswers; //represents the positions of the correct answers
	
	/** This constructor sets the multiple choice exam question
	 * @param questionText the exam question
	 * @param maximalMark the max number of marks for the question
	 * @param possibleAnswers the set of possible answers as an ArrayList
	 * @param correctAnswers the set of correct answers as an ArrayList
	 */
	public ExamQuestionMultipleChoice(String questionText, int maximalMark,
			ArrayList<String> possibleAnswers, ArrayList<Integer> correctAnswers) { 
		
		super(questionText, maximalMark);
		this.possibleAnswers = possibleAnswers;
		this.correctAnswers = correctAnswers;
	}
	
	/** This method checks the answers provided and scales the marks by the max 
	 * number of marks, correct answers and incorrect answers.
	 * @param answersProvided is the answers that are checked against the correct answers
	 * @return the number of marks awarded
	 */
	public int mark(ArrayList<Integer> answersProvided) { 
		float tempMark= 0;
		
		if(answersProvided.equals(correctAnswers))
			return getMaximalMark();
		else{
			
			/** Counting the number of correct and incorrect answers by 
			 comparing each value to the elements of the correctAnswers ArrayList */
			
			for(int i = 0; i < answersProvided.size(); i++){
				if(correctAnswers.contains(answersProvided.get(i)))
					tempMark +=1;
				if(!correctAnswers.contains(answersProvided.get(i)))
					tempMark -=1;
		}			
			
		}
		if(tempMark < 0)
			tempMark = 0;
		
		float marksAwarded = (getMaximalMark() * tempMark/(correctAnswers.size()));
		
		return Math.round(marksAwarded);
		}
		
	public String toString(){
		return super.toString() + " The possible choice(s) are: " + possibleAnswers + 
				" and the correct choice(s) are " + correctAnswers + ".";
	}	
				
	}
	

