package com.java.demo;

public class T_shirt {
	String color;
	String material;
	String design;

	T_shirt ( String color , String material , String design ) {
		this.color = color;
		this.material = material;
		this.design = design;
	}
	
	
	public static void main(String[] args) {	
		
		T_shirt[] small = new T_shirt[3];
		small[0] = new T_shirt( "Black" , "Cotton" , "Marvel:Avengers" );
		small[1] = new T_shirt( "White" , "Wool" , "NBA:Lakers" );
		small[2] = new T_shirt( "Blue" , "Silk" , "Dots" );
		System.out.println("\nS size\n");
		for (int i = 0; i < small.length; i++) {
		System.out.println("Color: " + small[i].color + "\nMaterial: " + small[i].material + "\nDesign: " + small[i].design + "\n");		
		}
		
		
		T_shirt[] large = new T_shirt[3];
		large[0] = new T_shirt( "Black" , "Cotton" , "Marvel:Avengers" );
		large[1] = new T_shirt( "White" , "Wool" , "NBA:Lakers" );
		large[2] = new T_shirt( "Blue" , "Silk" , "Dots" );		
		System.out.println("\nL size\n");	
		for (int i = 0; i < large.length; i++) {
		System.out.println("Color: " + large[i].color + "\nMaterial: " + large[i].material + "\nDesign: " + large[i].design + "\n");		
		}
		
		T_shirt[] xLarge = new T_shirt[3];
		xLarge[0] = new T_shirt( "Black" , "Cotton" , "Marvel:Avengers" );
		xLarge[1] = new T_shirt( "White" , "Wool" , "NBA:Lakers" );
		xLarge[2] = new T_shirt( "Blue" , "Silk" , "Dots" );		
		System.out.println("\nXL size\n");	
		for (int i = 0; i < xLarge.length; i++) {
		System.out.println("Color: " + xLarge[i].color + "\nMaterial: " + xLarge[i].material + "\nDesign: " + xLarge[i].design + "\n");		
		}
	}
}
