package test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

import main.Course;
import main.Seminar;
import main.Student;

public class SeminarTest {

	
	Seminar _seminar = new Seminar(new Course("Matematica", "Matematica for dummies","Zurigo", 1), 10);
			
	@Test
	public void testGetSeatsLeft() {
		assertThat(_seminar.getSeatsLeft(), is(10));
	}
	
	@Test
	public void testaddStudent() {
		
		_seminar.addStudent(new Student("Giuseppe", "Minardi"));
		_seminar.addStudent(new Student("Franco", "Minardi"));
		assertThat(_seminar.getStudentList().size(), is(2));
	}
	
	


}
