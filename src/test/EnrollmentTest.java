package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Enrollment;
import main.Student;

public class EnrollmentTest {

	Student std = new Student("Giuseppe", "Minardi");
	Enrollment enr1 = new Enrollment(1, std );
	
	
	@Test
	public void testGetEnrollmentNumber() {
		assertEquals(enr1.getSeminarNumber(), 1);
		
	}
	
	@Test
	public void testGetStudent() {
		assertEquals(enr1.getStudent(), std);
		
	}
	
	@Test
	public void testGetInfo() {
		assertEquals(enr1.getInfo(), new String("Enrollment : 1 Student : Giuseppe Minardi"));
		
	}
	

}
