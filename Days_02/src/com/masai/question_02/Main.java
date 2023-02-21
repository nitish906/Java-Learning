package com.masai.question_02;
/*
 --> The prime factors of a number are all of the integers below that number 
 that are divisible into the number as well as 1. For example, the prime 
 factors of 12 are 1,2,3,4,6, and 12.
--> Write a Java class with a static method that will take a number and print 
all the prime factorial of that number.
--> The Supplied number should be between 2 and 100. otherwise, it should print
 “Invalid number”.
--> Call this method from the main method by suppling any valid argument.
 */

public class Main {
	
	static void primeFactors(int num) {
		
		for(int i=2; i<=num; i++) {
			if(i%2==0) {
				System.out.println("Prime Number "+i);
			}
			else {
				System.out.println("Not Prime "+i);
			}
		}
		System.out.println("Invalid Number");
		
	}
	
	public static void main(String[] args) {
		Main c1=new Main();
		c1.primeFactors(12);
		
	}

}
