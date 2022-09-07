package com.java.day3.q2;

public class Square extends Shape{
	Square(){
		}
	Square (float l){
		super.length = l;
	}

	@Override
	public float area() {
		return length*length;
	}
	
	public static void main(String[] args) {
		Square s = new Square();
		s.length = 5;
		System.out.println("Area of Square = " + s.area());
	}

}

