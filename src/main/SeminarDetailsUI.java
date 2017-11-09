package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;

import main.util.CsvView;
import main.util.HtmlView;

public class SeminarDetailsUI {
	
	
	public static void main(String[] args) throws IOException, ParseException {
		
		Course course = new Course("Informatica", "Informatica base","Lugano", 1);
		course.setDataStart("12.10.2017");
		Seminar seminar1 = new Seminar(course, 4);
		
		System.out.println("Ecco il Seminario creato: " +seminar1.getCourse().getName());
		
		Student student1 = new Student("Giuseppe", "Garibaldi");
		Student student2 = new Student("Giuseppe", "Mazzini");
		Student student3 = new Student("Umberto", "Eco");
		
		seminar1.addStudent(student1);
		seminar1.addStudent(student2);
		seminar1.addStudent(student3);
	
				
		System.out.println(new HtmlView(seminar1).display());
		

		CsvView myCsv = new CsvView(seminar1);
		FileWriter prt = new FileWriter(new File("/home/dev/Desktop/Learning1/seminar/src/main/"+myCsv.getCourseName()+".csv"));
		prt.write(myCsv.display());
		prt.close();
		
		
	}

}
