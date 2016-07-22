package com.automationframework;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

// Import package pageObject.*

import com.pageobjects.Home_Page;
import com.pageobjects.Home_Page2;

import Utilities.*;
import com.pageobjects.Login_page;
import com.pageobjects.Product_Page;
import com.thoughtworks.selenium.Wait;
public class POM_TC {
	private static WebDriver driver = null;
	public static void main(String[] args) throws Exception {
	
	     driver = new FirefoxDriver();
	 
	     //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.get(Constants.url);
	     Home_Page HP = new Home_Page(driver);
	      HP.lnk_myaccount().click();
	     Login_page LP = new Login_page(driver);
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  //   driver.getCurrentUrl();
	     ExcelUtil.SetExcelFile(Constants.Path_TestData + Constants.File_TestData, "Sheet1");
	     String sUserName = ExcelUtil.getcelldata(1, 1);
	     String spassword = ExcelUtil.getcelldata(1, 2);
	     //Login_page.txtbox_input(driver).sendKeys(Constants.UserName);
	     LP.txtbox_input().sendKeys(sUserName);
	     //Login_page.txtbox_psswrd(driver).sendKeys(Constants.Password);
	     LP.txtbox_psswrd().sendKeys(spassword);
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     LP.button().click();
	     System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
	     Thread.sleep(3000);  
	     Product_Page.Product_search(driver).sendKeys(Constants.Search_Key);
	     System.out.println("you searched for + " +Constants.Search_Key);
	     Thread.sleep(3000);  
	     //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     Product_Page.Click(driver).click();
	  // Home_Page.lnk_loggedin(driver).click();
	    //Home_Page.lnk_logout(driver).click();
	    
	    
	     Product_Page.GetResultValues(driver);
	     //driver.quit();
	     System.out.println("successfully logout ");
	     
}}
