package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Course {
	
	
	private final String _name;
	private final String _description;
	private final int _number;
	private final String _location;
	private  Date  _dataStart;
	private final SimpleDateFormat myDataFormatter = new SimpleDateFormat("dd.mm.yyyy");
	
	public Course( String name, String description,String location, int number) {
		
		_name = name;
		_description = description;
		_location = location;
		_number = number;
		
	}
	
	public String getName(){
		return _name;
	}
	
	public String getDescription(){
		return _description;
	}
	
	public int getNumber(){
		return _number;
	}

	public String getLocation() {
		return _location;
	}

	public String getDataStart() {
		return myDataFormatter.format(_dataStart);
	}

	public void setDataStart(String dataStart) throws ParseException {
		_dataStart = myDataFormatter.parse(dataStart);
	}

	

}
