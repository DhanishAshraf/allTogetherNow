
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

/**
 * Public tests for Worksheet 4, Exercise 4. 
 * Eight tests to test different exam questions (numeric, simple, and multiple choice).
 * @author Dhanish Ashraf
 *
 */
public class ExamQuestionTest {
	
	private ExamQuestionNumeric numericQuestion;
	private ExamQuestionSimpleChoice simpleChoiceQuestion;
	private ExamQuestionMultipleChoice multipleChoiceQuestion;
	
	@Before
	public void setup(){
		numericQuestion = new ExamQuestionNumeric("What is 7 times 4?", 10, 28);
		
		ArrayList<String> simpleChoiceAnswers = new ArrayList<String>(Arrays.asList("12","27","6","5"));
		simpleChoiceQuestion = new ExamQuestionSimpleChoice("What is 9 minus 3?", 10, simpleChoiceAnswers, 3);
		
		ArrayList<String> possibleAnswers = new ArrayList<>(Arrays.asList("-3","3","5","6"));
		ArrayList<Integer> correctAnswers = new ArrayList<>(Arrays.asList(2, 3)); //positions of the correct answers
		multipleChoiceQuestion = new ExamQuestionMultipleChoice("x * y = 15", 20, possibleAnswers, correctAnswers);
	}

	@Test
	public void ex4PublicTest1() {
		
		int expected = 10;
		int actual = numericQuestion.mark(28);
		
		assertEquals("This is the incorrect answer.", expected, actual);
	}
	
	@Test
	public void ex4PublicTest2() {
		
		int expected = 0;
		int actual = numericQuestion.mark(32);
		
		assertEquals("This is the incorrect answer.", expected, actual);
	}
	
	@Test
	public void ex4PublicTest3() {
		
		int expected = 10;
		int actual = simpleChoiceQuestion.mark(3);
		
		assertEquals("This is the incorrect answer.", expected, actual);
	}
	
	@Test
	public void ex4PublicTest4() {
		
		int expected = 0;
		int actual = simpleChoiceQuestion.mark(1);
		
		assertEquals("This is the incorrect answer.", expected, actual);
	}
	
	@Test
	public void ex4PublicTest5() {
		
		ArrayList<Integer> givenAnswers = new ArrayList<>(Arrays.asList(2, 3));
		
		int expected = 20;
		int actual = multipleChoiceQuestion.mark(givenAnswers);
		
		assertEquals("This is the incorrect answer.", expected, actual);
	}
	
	@Test
	public void ex4PublicTest6() {
		
		ArrayList<Integer> givenAnswers = new ArrayList<>(Arrays.asList(1, 3));
		
		int expected = 0;
		int actual = multipleChoiceQuestion.mark(givenAnswers);
		
		assertEquals("This is the incorrect answer.", expected, actual);
	}
	
	@Test
	public void ex4PublicTest7() {
		
		ArrayList<Integer> givenAnswers = new ArrayList<>(Arrays.asList(2, 3, 4));
		
		int expected = 10;
		int actual = multipleChoiceQuestion.mark(givenAnswers);
		
		assertEquals("This is the incorrect answer.", expected, actual);
	}
	
	@Test
	public void ex4PublicTest8() {
		
		ArrayList<Integer> givenAnswers = new ArrayList<>(Arrays.asList(2));
		
		int expected = 10;
		int actual = multipleChoiceQuestion.mark(givenAnswers);
		
		assertEquals("This is the incorrect answer.", expected, actual);
	}

}
