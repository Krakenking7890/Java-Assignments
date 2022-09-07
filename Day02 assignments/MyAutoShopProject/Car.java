package com.java.car;

public class Car {
	int speed;
	double regularPrice;
	String color;
	public Car(int speed, double regularPrice, String color) {
		this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
	}
	double getSalePrice() {
		return regularPrice;
	}
}
	
	class Truck extends Car {
		private int weight;
		public Truck(int speed, double regularPrice, String color, int weight) {
	        super(speed, regularPrice, color);
	        this.weight = weight;
	    }

	    public double getSalePrice() {
	        return super.getSalePrice() * (weight > 2000 ? 0.10 : 0.20);
	    }
		
	}
	
	class Ford extends Car {
		private int year;
		private int manufacturerDiscount;
		public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
			super(speed, regularPrice, color);
			this.year = year;
			this.manufacturerDiscount = manufacturerDiscount;
		}
		
		public double getSalePrice() {
			Car c1 = new Car(speed, regularPrice, color); 
			return c1.getSalePrice() - manufacturerDiscount;
		}
	}

		
		
	class Sedan extends Car {
		private int length;
		public Sedan(int speed, double regularPrice, String color, int lenght) {
			super(speed, regularPrice, color);
			this.length = lenght;
		}

		double getSalePrice() {
			if(length > 20) {
				return (regularPrice-regularPrice*0.05);
			}
			else {
				return (regularPrice-regularPrice*0.1);
			}
		}
	}
	