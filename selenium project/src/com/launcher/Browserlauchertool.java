package com.launcher;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browserlauchertool {

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	
	{
		WebDriver Driver;
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver1 = new FirefoxDriver();
	    driver1.navigate().to("https://www.facebook.com");
		
		
				
	}

}
