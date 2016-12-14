

/** The class is for an exam question with a set number of maximum marks
 * @author Dhanish Ashraf
 *
 */
public class ExamQuestion { 
	
	private String questionText;
	private int maximalMark;
	
	/** This constructor sets the exam queston with the question and the max mark of the question
	 * @param questionText is the exam question
	 * @param maximalMark is the max mark of the question
	 */
	public ExamQuestion(String questionText, int maximalMark){ 
		this.questionText = questionText;
		this.maximalMark = maximalMark;
	}

	/** gets the exam question
	 * @return questionText which is the exam question
	 */
	public String getQuestionText() { 
		return questionText;
	}

	/** sets the exam question
	 * @param questionText which is the exam question
	 */
	public void setQuestionText(String questionText) { 
		this.questionText = questionText;
	}

	/** gets the max mark of the question
	 * @return maximalMark which is the max mark of the question
	 */
	public int getMaximalMark() { 
		return maximalMark;
	}

	/** sets the max mark of the question
	 * @param maximalMark which is the max mark of the question
	 */
	public void setMaximalMark(int maximalMark) { 
		this.maximalMark = maximalMark;
	}
	
	public String toString(){
		return "Question (maximal mark:		" + maximalMark + "):	" + questionText;
	}

}
