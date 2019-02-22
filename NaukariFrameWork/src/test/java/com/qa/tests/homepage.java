package com.qa.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class homepage {
	
	//testing Jenkins
	
	public WebDriver driver;
	
	@Test
	public void getBrowser()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
	}

}
