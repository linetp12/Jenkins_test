package com.Jenkinstest.newtours.login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class NewTours_Login_Testcase {
	
	@Test
	public void VerifyLogin()
	{
		System.setProperty("webdriver.chrome.driver", "C://apps/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com");
		
		//NewTours_Login login = new NewTours_Login(driver);
		
		NewTours_Login login = PageFactory.initElements(driver, NewTours_Login.class);
				
		login.Loginpage("tutorial", "tutorial");
		
	}

}
