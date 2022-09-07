package com.java.demo;

public class Student {
		int stdID;
		String stdName;
		int stdClass;
		
		Student(int ID, String Name, int Class){
			this.stdID = ID;
			this.stdName = Name;
			this.stdClass = Class;
			
		}
	

	public static void main(String[] args) {
		Student s1 = new Student(456, "Rohit", 5);
		System.out.println("Name: " + s1.stdName + "\nClass: " + s1.stdClass);
		
		
	}

}
