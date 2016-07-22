package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import com.pageobjects.*;


import Utilities.*;
import com.thoughtworks.selenium.Wait;

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

import cucumber.api.PendingException;
import cucumber.api.java.en.*;


public class Test_Class {
	private WebDriver driver = null;
	
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	   WebDriver driver = null;
		
		
		     driver = new FirefoxDriver();
		 
		     //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		     driver.get(Constants.url);
		     Home_Page HP = new Home_Page(driver);
			HP.lnk_myaccount().click();
			  Login_page LP = new Login_page(driver);
			  ExcelUtil.SetExcelFile(Constants.Path_TestData + Constants.File_TestData, "Sheet1");
			     String sUserName = ExcelUtil.getcelldata(1, 1);
			     String spassword = ExcelUtil.getcelldata(1, 2);
			     //Login_page.txtbox_input(driver).sendKeys(Constants.UserName);
			     
			     //LP.txtbox_input().sendKeys(sUserName);
			     LP.txtbox_input().sendKeys(Constants.UserName);
			     //Login_page.txtbox_psswrd(driver).sendKeys(Constants.Password);
			     LP.txtbox_psswrd().sendKeys(spassword);
			     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			     LP.button().click();
			     
			     System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
			     //Thread.sleep(3000);  
			    
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
			}

	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		  
	}

@Test()

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Given("^user is using as \"(.*?)\"$")
	public void user_is_using_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^User using \"(.*?)\" as username$")
	public void user_using_as_username(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^ser using \"(.*?)\" as username$")
	public void ser_using_as_username(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^message shoudl display duplicate login$")
	public void message_shoudl_display_duplicate_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

}
