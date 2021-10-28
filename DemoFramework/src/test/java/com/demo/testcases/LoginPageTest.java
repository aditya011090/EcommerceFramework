package com.demo.testcases;

import com.demo.pages.HomePage;
import com.demo.pages.LoginPage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demo.base.TestBase;

public class LoginPageTest extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		 loginpage = new LoginPage();
	}
	
	@Test(priority=1)
	public void loginPageTitleTestBeforelogin() {
		String title= loginpage.validateLoginPageTitle();
		Assert.assertEquals(title, "My Store");
	}
	
	@Test(priority=2)
	public void logintest() throws InterruptedException {
		homepage = loginpage.login(prop.getProperty("emailid"), prop.getProperty("password"));
	}
	
	@Test(priority=3)
	public void loginPageTitleTestAfterlogin() throws InterruptedException {
		homepage = loginpage.login(prop.getProperty("emailid"), prop.getProperty("password"));
		String title= loginpage.validateLoginPageTitle();
		Assert.assertEquals(title, "My account - My Store");
		
	}
	
	
	
	 @AfterMethod 
	  public void teardown() 
	  { 
	  driver.quit(); 
	  }

}
