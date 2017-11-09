package main.util;

import main.Seminar;
import main.Student;

public class HtmlView extends View {

	StringBuffer strbf = new StringBuffer();
	Seminar _seminar;
	
	public HtmlView(Seminar seminar) {
		
		_seminar = seminar;
	}
		
	@Override
	 String ViewHeader() {	
		
	return	"<html>"
					 +"<head>"
					 +"	     <title>"+ _seminar.getCourse().getName()+"</title>"
					 +"	</head>" 
					 +"	<body>"
					 +"	    <div>"+_seminar.getCourse().getName()+"</div>"
					 +"	    <ul>"
					 +"	          <li>"+_seminar.getCourse().getDescription() +"</li>"
					 +"	          <li>"+_seminar.getCourse().getLocation() +"</li>"
					 +"	          <li>"+_seminar.getCourse().getDataStart() +"</li>"					 
					 +"	          <li>"+_seminar.getSeatsLeft() +"</li>"
					 +"	    </ul>"
					 +"	    <div>partecipanti:</div>"
					 +"	    <ul>";
	}

	@Override
	String ViewBody() {
					
			String result="";
			for (Student std : _seminar.getStudentList()) {
				result +="<li>"+std.getFullName()+"</li>";
			}
			
			return result;
	}

	@Override
	String ViewFooter() {
		return "</ul>"
				 +"	</body>"
				 +"	</html>";
	}

	@Override
	public  String display() {
		
		StringBuffer strbf = new StringBuffer();
		strbf.append(ViewHeader());
		strbf.append(ViewBody());
		strbf.append(ViewFooter());
		return strbf.toString();
	}

}
