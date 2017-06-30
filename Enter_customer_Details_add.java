package com.varaprasad;

public class Enter_customer_Details_add implements Enter_customer_details,Enter_customer_details_two {

	public String age;
	public String Email;
	public String s;
	public String address;
	public String phone;

	@Override
	public void set(String s) {
		this.s=s;
		
	}

	@Override
	public void get() {

	System.out.println(address);
	System.out.println(phone);
	
	
		
	}
	@Override
	public void add(String age, String Email) {
	this.age = age;
	this.Email = Email;
	
	
		
	}
	@Override
	public void set(String address, String phone) {
		this.address = address;
		this.phone = phone;
		if(!(this.address.isEmpty()))
		{
			System.out.println("address and email id are same");
		}
		if(this.phone.endsWith("1191")){
			System.out.println("this is not valid phoennmber");
			
		}
		if(this.age.matches("26")){
			System.out.println("yuou are thood old");
		}
		
	}


	@Override
	public void display() {
		System.out.println("the age of customer is" +"   " +   age);
	
		System.out.println(s);
		System.out.println(Email);
	
	}

	

	
	
	

}
