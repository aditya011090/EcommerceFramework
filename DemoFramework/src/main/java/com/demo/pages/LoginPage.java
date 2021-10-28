package com.demo.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.pages.HomePage;
import com.demo.util.TestUtil;
import com.demo.base.TestBase;

public class LoginPage extends TestBase {
	
	
	@FindBy(xpath = "//a[@class='login']")
	WebElement signInLink;
	
	@FindBy(xpath = "//input[@id='email']")
	WebElement emailid;
	
	@FindBy(xpath = "//input[@id='passwd']")
	WebElement password;
	
	@FindBy(xpath = "//span[normalize-space()='Sign in']")
	WebElement signinbutton;
	
	
	//Initializing Page Objects
		public LoginPage() {
			PageFactory.initElements(driver, this);
		}
		
		//Actions:
		public String validateLoginPageTitle() {
			return driver.getTitle();
		}
		
		public HomePage login(String eid, String pwd) throws InterruptedException {
			signInLink.click();
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			emailid.sendKeys(eid);
			password.sendKeys(pwd);
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			
			Thread.sleep(300);
			
			signinbutton.click();
			return new HomePage();
		}
	

}
