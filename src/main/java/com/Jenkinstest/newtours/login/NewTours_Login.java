package com.Jenkinstest.newtours.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewTours_Login {
	
	WebDriver driver;
	
	public NewTours_Login(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	
	@FindBy(name = "userName")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(name = "login")
	WebElement submit;
	
	public void Loginpage(String uname, String pass) 
	{
		username.sendKeys(uname);
		password.sendKeys(pass);
		submit.click();
	}
	

}
