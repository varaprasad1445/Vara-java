package com.varaprasad;

public class Circle extends Shape implements Enter_customer_details {

	public String s;
public double area;
	@Override
	void area(double side) {
		
		double area = 3.24*side* side;
System.out.println("the circle area is "+ area);

		
	}

	@Override
	public void set(String s) {
		this.s = s;
		
	}

	@Override
	public void get() {
		System.out.println(s);
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(String age, String Email) {
		// TODO Auto-generated method stub
		
	}

	
}
