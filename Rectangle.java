package com.varaprasad;

public class Rectangle extends Shape {

	

	

	@Override
	void area(double side) {
		
		double area = side * side;
		System.out.println("calling abstract method in rectangle" + area);
		
	}
	
	

	
	
}
