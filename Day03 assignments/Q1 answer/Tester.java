package com.java.day3.q1;

public class Tester extends Employee {
	double yearlySal;
	Tester() {}
	Tester(int id, String name, double salary) {
		super.empID = id;
		super.empName = name;
		super.empSal = salary;
	}
	public void display() {
		System.out.print("Tester Details:\nEmployee ID - " + empID + "\nEmployee Name - " + empName + "\nMonthly Salary - " + empSal + "\nYearly Salary - ");
		salCal();
	}
	public void salCal() {
		yearlySal = 12 * empSal;
		System.out.println(yearlySal + "\n");
	}
	
	public static void main(String[] args) {
		Tester m = new Tester(123,"Shwetha",26000);
		m.display();
	}
}
