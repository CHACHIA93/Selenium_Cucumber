package com.e2eTests.automation.utils;

import org.openqa.selenium.WebDriver;

public class SeleniumUtils extends BasePage {
	
	/**driver */
	private static WebDriver driver;


	public SeleniumUtils() {
		super(driver);
		SeleniumUtils.driver = Setup.getDriver();
	}
	
	public void get(String url) {
		driver.get(url);
	}
	
	//public void sendkeys 
	
	///public void get(String email) {
		//driver.get(email);
	//}
	

}
