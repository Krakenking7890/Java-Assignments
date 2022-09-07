package com.java.day3.q4;

public abstract class Employee {
	int empId,numofLeaves;
	String empName;
	double basicPay;
	Address address = new Address();
	public abstract double calculateSalary();
}