package main;

public class Enrollment {
	
	
	 int _seminarNumber;
	 Student _student;
	
	public Enrollment( int seminarNumber, Student student) {
		
		_seminarNumber = seminarNumber;
		_student = student;
	}
	
    public int getSeminarNumber() {
		return _seminarNumber;
	}

	public void setSeminarNumber(int seminarNumber) {
		_seminarNumber = seminarNumber;
	}

	public Student getStudent() {
		return _student;
	}

	public void setStudent(Student student) {
		_student = student;
	}

	public String getInfo(){
    	
    	
    	 return "Enrollment : "+_seminarNumber + " "+ _student.getInfo();   	
    	
    }

}
