package main;

public class Student {
       
	private String _firstName;
	private String _lastName;
	
	
	
	public Student(String firstName, String lastName) {
		
		_firstName = firstName;
		_lastName = lastName;
	
		
	}	
	
	
	public String getFirstName() {
		return _firstName;
	}
	public void setFirstName(String firstName) {
		_firstName = firstName;
	}
	public String getLastName() {
		return _lastName;
	}
	public void setLastName(String lastName) {
		_lastName = lastName;
	}
	
	public String getFullName(){
		return getFirstName() + " " +getLastName();
	}
	
	public String getInfo(){
		
		return "Student : " +getFullName();
		
	}
	
	 
}
