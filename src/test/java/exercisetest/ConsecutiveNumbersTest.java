package test.java.exercisetest;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.exercise.ConsecutiveNumbers;


	public class ConsecutiveNumbersTest {

		@Test
		public void testConsecutiveCheck() {
			String digits =  "23,24,25,26,27,28,29",bad="45,57,90,45,21,34,56";
			assertEquals(true,ConsecutiveNumbers.consecutiveCheck(digits));
			assertEquals(false,ConsecutiveNumbers.consecutiveCheck(bad));
		}

	}


