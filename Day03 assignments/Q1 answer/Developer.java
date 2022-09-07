package com.java.day3.q1;

public class Developer extends Employee {
	double yearlySal;
	Developer() {}
	Developer(int id, String name, double salary) {
		super.empID = id;
		super.empName = name;
		super.empSal = salary;
	}
	public void display() {
		System.out.print("Developer Details:\nEmployee ID - " + empID + "\nEmployee Name - " + empName + "\nMonthly Salary - " + empSal + "\nYearly Salary - ");
		salCal();
	}
	public void salCal() {
		yearlySal = 12 * empSal;
		System.out.println(yearlySal + "\n");
	}
	
	public static void main(String[] args) {
		Developer m = new Developer(456,"Raman",28000);
		m.display();
	}
}
