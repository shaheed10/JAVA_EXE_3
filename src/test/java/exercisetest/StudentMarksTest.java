package test.java.exercisetest;
import main.java.exercise.*;

import static org.junit.Assert.*;

import org.junit.Test;
import main.java.exercise.*;




public class StudentMarksTest {

	@Test
	public void testCheck() {
		int[] stuGrades = {11,22,32,42};
		String [] expec= {"True","True","True","True"};
		String [] act = StudentMarks.checkmarks(stuGrades);
				assertEquals(expec,act);
		}
	@Test
	public void testCheck1() {
		int[] stuGrades = {11,-22,32,-42};
		String [] expec= {"True","False","True","False"};
		String [] act = StudentMarks.checkmarks(stuGrades);
				assertEquals(expec,act);
		}
		

	}

