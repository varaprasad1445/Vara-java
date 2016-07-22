package com.pageobjects;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
public class Home_Page  {
	WebDriver driver; 
	public Home_Page(WebDriver driver){
		this.driver = driver;
	}
private  WebElement element =  null;
public  WebElement lnk_myaccount(){
return 	element =   driver.findElement(By.linkText("Log In"));
	  
	}
public  WebElement lnk_loggedin( ){
	return element = driver.findElement(By.linkText("Hi varaprasad!"));
	}
public  WebElement lnk_logout( ){
	
	return element = driver.findElement(By.linkText("Log Out"));
}

}
