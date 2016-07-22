package com.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// Import package pageObject.*

import com.pageobjects.Home_Page;
import Utilities.*;
import com.pageobjects.Login_page;
import com.thoughtworks.selenium.Wait;
import Utilities.Constants;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;
public class Product_Page {
	private static WebElement element = null;
	public static WebElement Product_search(WebDriver driver){
		element = driver.findElement(By.xpath("//input[@name='q']"));
		return element;
	
	}
		public static WebElement Click(WebDriver driver){
		
			element = driver.findElement(By.xpath("//input[@value='SEARCH']"));
			return element;
			
		}
		public static void GetResultValues(WebDriver driver){
		
			//List<WebElement> allsearchresults = driver.findElements(By.xpath(".//a[contains(title(),Samsung Galaxy J7)]"));
			//List<WebElement> allsearchresults = driver.findElements(By.xpath(".//*[@class='gd-row browse-grid-row']"));
			List<WebElement> allsearchresults = driver.findElements(By.xpath(".//*[@class='gd-row browse-grid-row']"));
				System.out.println("is executed");
				for(WebElement st : allsearchresults){
							if(st.getText().contains("Samsung")){
								System.out.println(st.getText());
								
							}
			
					}
				System.out.println(allsearchresults.size());
			
			
}
}