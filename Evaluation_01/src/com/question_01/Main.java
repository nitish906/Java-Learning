package com.question_01;


/*
 Q1) Create a class Main which has the method
static printMonths(String month) : void
Implement this method in the following manner-
● If month = JAN then print “This is the 1st Month of the Year January”
● If month = FEB then print “This is the 2nd Month of the Year February”
as it is till Month DEC

Note: Use Switch case
Inside the main method of the Main class, call the above printMonth() method 
by passing the proper argument.
 */

public class Main {
	
	static String month;
	
	static void printMonths (String JAN, String FEB, String DEC) {
		month=JAN;
		month=FEB;
		month=DEC;
	}
	
	public static void main(String[] args) {
		
		//Method-1
		
		if(month=="JAN") {
			System.out.println("This is the 1st Month of the Year January");
		}
		else if(month=="FEB") {
			System.out.println("This is the 2nd Month of the Year February");
		}
		else {
			System.out.println("it is till Month DEC");
		}
		
		//Method-2
		
		switch (month) {
		case "JAN": System.out.println("his is the 1st Month of the Year January");
		case "FEB" :  System.out.println("This is the 2nd Month of the Year February");

		default:
			System.out.println("it is till Month DEC");
		}
		
		printMonths("JAN", "FEB", "DEC");
		
	}

}
