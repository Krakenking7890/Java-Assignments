package com.java.day3.q4;

public class TechnicalEmployee extends Employee {
	double salary, HRA;
	String skill;
	TechnicalEmployee() {}
	TechnicalEmployee(int id, String name, String skil, double bPay, int nLeaves) {
		super.empId = id;
		super.empName = name;
		this.skill = skil;
		super.basicPay = bPay;
		super.numofLeaves = nLeaves;
	}
	public double HRA() {
		HRA = 0.12 * basicPay;
		return HRA;
	}
	@Override
	public double calculateSalary() {
		salary = basicPay + HRA;
		return salary;
	}
	public String toString() {
		return "Technical Employee Details\nID: " + empId + "\nName: " + empName + "\nSkill: " + skill + "\nAddress: " + address + "\nBasic Pay: " + basicPay + "\nHRA: " + HRA() + "\nSalary: " + calculateSalary();
	}
}