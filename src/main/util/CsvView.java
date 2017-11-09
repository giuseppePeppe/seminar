package main.util;

import main.Seminar;
import main.Student;

public class CsvView extends View {
	
	Seminar _seminar;
	
	public CsvView( Seminar seminar) {
		
		_seminar = seminar;
		
	}
	
	@Override
	String ViewHeader() {
		return "\""+ _seminar.getCourse().getNumber()+"\""+
			   ";"+
			   "\""+ _seminar.getCourse().getName() +"\""+
			   ";"+
			   "\""+ _seminar.getCourse().getDescription() +"\""+
			   ";"+
			   "\""+ _seminar.getCourse().getLocation() +"\""+
			   ";"+
			   "\""+ _seminar.getSeatsLeft() +"\""+
			   ";"+
			   "\""+ _seminar.getCourse().getDataStart() +"\""+
			   "\n";
	}


	@Override
	String ViewFooter() {
		return "";
	}



	@Override
	String ViewBody() {
		
		String result="";
		for (Student std : _seminar.getStudentList()) {
			result +="\""+std.getFirstName()+"\""+";"+"\""+std.getLastName()+"\""+"\n";
		}
		
		return result;
	}
	
	public String getCourseName(){
		
		return _seminar.getCourse().getName();
	}


	@Override
	public String display() {

		return ViewHeader()+ViewBody()+ViewFooter();
	}

}
