package com.masai.question_01;
/*
Q1) Write the difference between JRE, JDK and JVM?
Ans:- JRE:- it means java runtime envoriment.when we excute the java program JRE work is
provide run time envoriment and commucate between java program and opratating system.

      JDK:- it means java devlopment kit.it is software and they will provide devlopment 
      area and excute java program.
      
      JVM:- it means java vertual mechine they will excute byte code.

Q2) Write the difference between JSE, JEE and JME?
Ans:- JSE–> Java Standard Edition–> You can develop standalone applications/desktop applications or 
            even write scripts using Selenium tool for Automation Testing. 
      JEE–> Java Enterprise Edition–> It's used to develop rich enterprise web applications.
      
      JME–> Java Micro Edition–> Can be used to develop applications running on mobile devices, embedded systems etc.


Q3) How does java achieve platform independency?
Ans:- Java provides Platform Independence by making use of Java Byte Code. Java Byte Code or . class file is generated 
during the compilation of the code. This Byte Code is platform-independent and can run on any system regardless of the 
platform it is built upon.


Q4) What are features of Java and explain them?
Ans:- Java is a fully object-oriented language, unlike C++ which is semi object-oriented. It supports every OOP concept such
 as Abstraction, Encapsulation, Inheritance, Polymorphism. Java programs are developed using classes and objects. Another notable
  feature is that in Java the main() function is defined under a class.
 
Q5) Explain why Java is platform independent ?
Ans:- Java is Platform independent because we write code once andy run any opratating system
JVM.
 
Q6) Differentiate between static and non-static variables?

Ans:- When we creite a program and variables hava static keywords that is called static
and other is called non-static variables.

Q7) Write a Java Application which prints your details?
 */

public class Main {
	
	//Static variables
	static int n=10;
	
	//non-static variable
	int x=10;
	
	public static void main(String[] args) {
		
		//Q7
		String nameString="Nitish Kumar";
		
		String schoolString="Masai School";
		
		String studentCodeString="fw20_003";
		
		System.out.println(nameString+" "+schoolString+" "+studentCodeString);
		
	
		
	}

}










