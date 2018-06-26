package test.java.exercisetest;
import main.java.exercise.*;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.exercise.RemoveVowels;

public class RemoveVowelsTest {

	@Test
	public void testRemove() {
		String [] arr = {"Egypt","Germany","India"},expec= {"gypt","Grmny","nd"};
		String [] act = RemoveVowels.removevw(arr);
		assertEquals(expec,act);
		
	}
	@Test
	public void testRemove1() {
		String [] arr = {"Chelsea","Germany","India"},expec= {"Chls","Grmny","nd"};
		String [] act = RemoveVowels.removevw(arr);
		assertEquals(expec,act);
		
	}

}
