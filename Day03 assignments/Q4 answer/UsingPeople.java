package com.java.day3.q4;

public class UsingPeople {

	public static void main(String[] args) {
		
		//Technical Employee Instance
		TechnicalEmployee t1 = new TechnicalEmployee(132, "Raman", "C++", 28000, 3);
		Address tAdd = new Address(10, "MG road", "Bengaluru", 560048);
		t1.address = tAdd;
		
		//Staff
		Staff s1 = new Staff(789, "Raghav", "Housekeeping", 15000, 2);
		Address sAdd = new Address(19, "KR road", "Bengaluru", 560089);
		s1.address = sAdd;
		
		//Display all details
		System.out.println(t1);
		System.out.println("\n\n" + s1);
	}
}