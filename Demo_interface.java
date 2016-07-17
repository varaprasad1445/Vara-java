package com.varaprasad;

public class Demo_interface implements Demo{
int sum;
	

	@Override
	public int add(int a, int b) {
	 sum = a + b;
		return sum;
	}

	@Override
	public void display() {
	
		System.out.println("saum" + "   "   +  sum);
		
		
	}

}
