package com.java.day3.q4;

public class Staff extends Employee {
	double salary, HRA;
	String title;
	Staff() {}
	Staff(int id, String name, String title, double basicPay, int noOfLeaves) {
		super.empId = id;
		super.empName = name;
		this.title = title;
		super.basicPay = basicPay;
		super.numofLeaves = noOfLeaves;
	}
	public double HRA() {
		HRA = 0.18 * basicPay;
		return HRA;
	}
	@Override
	public double calculateSalary() {
		salary = basicPay + HRA;
		return salary;
	}
	public String toString() {
		return "Staff Details\nID: " + empId + "\nName: " + empName + "\nTitle: " + title + "\nAddress: " + address + "\nBasic Pay: " + basicPay + "\nHRA: " + HRA() + "\nSalary: " + calculateSalary();
	}

}