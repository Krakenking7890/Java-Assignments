package com.java.day3.q2;

public class Rectangle extends Shape{
	Rectangle(){
		}
	Rectangle (float l, float b){
		super.length = l;
		super.breadth = b;
	}

	@Override
	public float area() {
		return length*breadth;
	}
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.length = 5;
		r.breadth = 10;
		System.out.println("Area of rectangle = " + r.area());
	}

}
