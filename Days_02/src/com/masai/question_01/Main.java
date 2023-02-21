package com.masai.question_01;

/*
 Write a static method that will take a city as a parameter: and implement this
  method as follows:
	if city.equals("Mumbai") then print
		"Financial city"
	if city.equals("Kolkata") then print
		"City of Joy"
	if city.equals("Delhi") then print
		"Capital of the country"
	if city.equals("Bangalore") then print
		"Cyber City"
	otherwise
		"May be Other Indian City"
This method should be implemented using switch-case
Call the above method from the main method by supplying a proper city name.
 */

public class Main {
	
	static void allcity(String city) {
		
		if (city.equals("Mumbai")){
			System.out.println("Financial city");
		}
		else if(city.equals("Kolkata"))
		System.out.println("City of Joy");
		
		else if(city.equals("Delhi"))
			System.out.println("Capital of the country");
		else if(city.equals("Bangalore")) 
			System.out.println("Cyber City");
		else {
			System.out.println("May be Other Indian City");
		}
		
	}
	
	public static void main(String[] args) {
		Main c1=new Main();
		c1.allcity("Mumbai");
		
	}
	

}
