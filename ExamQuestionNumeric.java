

/** This class is a subclass of ExamQuestion and checks whether 
 * the numerical answer is correct
 * @author Dhanish Ashraf
 *
 */
public class ExamQuestionNumeric extends ExamQuestion {
	
	private int answer;
	
	/** This constructor sets the exam question with the question, max mark and the answer
	 * @param questionText the exam question
	 * @param maximalMark the max mark of the question
	 * @param answer the answer to the question
	 */
	public ExamQuestionNumeric(String questionText, int maximalMark, int answer) { 
		super(questionText, maximalMark);
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
		return super.toString() + " The correct answer is: " + answer;
	}
}
