package com.varaprasad;
public class Addition {
	
	
	public String c;
	public String w;

	public int add(int a, int b){
		return a+b;
		
	}
	private int sub(int c, int d){
		return c-d;
	}
	
	public int mul(int a, int b)
	{
		return a*b;
	}
	public int division(int a, int b){
		return a/b;
	}
	public void chupinchu(String s)
	{
		System.out.println(s);
	}
	public void set(String c){
		this.c = c;
		
	}

	public void get()
	{
		System.out.println(c);
	}
	public static void main(String [] args){
		Addition dd = new Addition();
		System.out.println("we are callng this" +" "  + dd.sub(10,5));
	}
	
}
