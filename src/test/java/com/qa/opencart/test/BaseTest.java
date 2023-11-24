package com.qa.opencart.test;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;


import com.qa.opencart.factory.DriverFactory;
import com.qa.opencart.pages.AccountsPage;
import com.qa.opencart.pages.LoginPage;

public class BaseTest {

	public DriverFactory driverFactory;
	public WebDriver driver;
	public LoginPage loginPage;
	public Properties prop;
	public AccountsPage accountpage; 

	
	@BeforeTest
	
	public void setUp() {
		
		driverFactory = new DriverFactory();
		
		driver = driverFactory.init_driver();
		prop = driverFactory.init_prop();
		loginPage = new LoginPage(driver);
		accountpage = new AccountsPage(driver);
	}
	
	
	
	public void teardown() {
		
		driver.quit();
		
	}
}

