package test.java.exercisetest;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.Calendar;

import org.junit.Test;

import main.java.exercise.FirstAndLastDate;


public class FirstAndLastDateTest {

	@Test
	public void FirstDateTest() {
	    Calendar calendar = Calendar.getInstance();
	    FirstAndLastDate obj = new FirstAndLastDate();
	    Date now = (Date) obj.getWeekStartDate();
	}
	
	@Test
	public void LastDateTest() {
	    Calendar calendar = Calendar.getInstance();
	    FirstAndLastDate obj = new FirstAndLastDate();
	    Date now = (Date) obj.getWeekEndDate();
	}

}
