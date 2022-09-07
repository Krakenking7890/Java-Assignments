package com.java.day3.q2;

public class Triangle extends Shape{
	Triangle(){
		}
	Triangle (float h, float b){
		super.height = h;
		super.base = b;
	}

	@Override
	public float area() {
		return (height*base)/2;
	}
	
	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.height = 10;
		t.base = 10;
		System.out.println("Area of Triangle = " + t.area());
	}

}

