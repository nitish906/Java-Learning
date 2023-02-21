package com.masai.question_01;

/*
 Create a Java Bean class Student with the following fields :
	roll: Integer
	name: String
	age: Integer
	marks: Integer
	Make ensure that encapsulation is maintained.
	Make validation checks before setting the age and marks of the Student (i.e. are they in
	the valid range,18<age<60, 0<marks<500).
	Inside a Separate class main method, Create 2 objects of the Student class one by
	using the zero-argument constructor and the second by using the parameterized
	constructor.
	Print the details of both the Student objects.

 */

public class Main {
	private Integer roll;
	
	private String name;
	
	private Integer age;
	
	private Integer marks;
	
	
	
	
	public Integer getRoll() {
		return roll;
	}




	public void setRoll(Integer roll) {
		this.roll = roll;
	}


	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public Integer getAge() {
		return age;
	}




	public void setAge(Integer age) {
		this.age = age;
	}




	public Integer getMarks() {
		return marks;
	}




	public void setMarks(Integer marks) {
		this.marks = marks;
	}




	public Main(Integer roll, String name, Integer age, Integer marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	
	

	

}
