package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Course;

public class CourseTest {

	
	Course courseTest = new Course("Economia", "Corso base","Taranto", 1);
	

	@Test
	public void testGetName() {
		assertEquals(courseTest.getName(), "Economia");
    }
	
	@Test
	public void testGetDescription(){
		assertEquals(courseTest.getDescription(), "Corso base");
	}
	
	@Test
	public void testGetNumb(){
		assertEquals(courseTest.getNumber(), 1);
	}
	
	@Test
	public void testGetLocation(){
		assertEquals(courseTest.getLocation(), "Taranto");
	}
	
	

}
