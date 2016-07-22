package com.pageobjects;
import org.openqa.selenium.*;

import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.WebElement;
public class Login_page  {
	WebDriver driver;
	public Login_page(WebDriver driver){
		this.driver = driver;
	}

	private  WebElement element =  null;
	public  WebElement txtbox_input(){
		//element  = driver.findElement(By.className("fk-input login-form-input user-email"));
		element = driver.findElement(By.xpath("//input[@class='fk-input login-form-input user-email']"));
		return element;
	}
	public  WebElement txtbox_psswrd(){
		//return element  = driver.findElement(By.className("tmargin10 login-input-wrap"));
		return element = driver.findElement(By.xpath("//input[@class='fk-input login-form-input user-pwd']"));
	}
	public WebElement button(){
		//return element = driver.findElement(By.className("submit-btn login-btn btn"));
		return element = driver.findElement(By.xpath("//input[@class='submit-btn login-btn btn']"));
	}
}

