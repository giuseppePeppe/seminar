package main;

import java.util.ArrayList;

import main.util.View;

public class Seminar {
	
	private Integer _seatsLeft;
	private final  ArrayList<Student> _studentList = new ArrayList<>();
	private final Course _course;
	View render;
	
	public Seminar(Course course,int seatsLeft ) {
		
		_course = course;
		_seatsLeft = seatsLeft;	
	
	}
	public Course getCourse() {
		return _course;
	}
	
	public Integer getSeatsLeft() {
		return _seatsLeft;
	}
		
	public ArrayList<Student> getStudentList() {
		return _studentList;
	}
	public void addStudent(Student student){
		
		if(getSeatsLeft() > 0){
			
			_studentList.add(student);
			_seatsLeft--;
			
		}
		else
			throw new RuntimeException("Student do not enrolled! Seats left 0");
			
	}
	
	
	
	

}
