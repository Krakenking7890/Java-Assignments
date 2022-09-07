package com.java.day3.q1;

public class Manager extends Employee {
	double yearlySal;
	Manager() {}
	Manager(int id, String name, double salary) {
		super.empID = id;
		super.empName = name;
		super.empSal = salary;
	}
	public void display() {
		System.out.print("Manager Details:\nEmployee ID - " + empID + "\nEmployee Name - " + empName + "\nMonthly Salary - " + empSal + "\nYearly Salary - ");
		salCal();
	}
	public void salCal() {
		yearlySal = 12 * empSal;
		System.out.println(yearlySal + "\n");
	}
	
	public static void main(String[] args) {
		Manager m = new Manager(123,"Amar",35000);
		m.display();
	}
}
