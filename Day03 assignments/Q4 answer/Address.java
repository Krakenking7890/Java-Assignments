package com.java.day3.q4;

public class Address {
	int doorNo;
	String street;
	String city;
	int pinCode;
	
	Address() {
		}
	Address(int drNo, String st, String cty, int pin) {
		this.doorNo = drNo;
		this.street = st;
		this.city = cty;
		this.pinCode = pin;
	}
	
	public String toString() {
		return doorNo+", "+street+", "+city+" - "+pinCode;
	}

}
