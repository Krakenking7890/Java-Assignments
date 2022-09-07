package com.java.day3.q3;

public class EmpSal {

	public static void main(String[] args) throws EmpException{
		int yearlySalary = 10000;
		if(yearlySalary<100000) {
			throw new EmpException("Salary is less than 100000");
		}
		else {
				System.out.println("Salary is not less than 100000");
			}
	}
}