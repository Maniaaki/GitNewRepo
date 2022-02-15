package com.launcher;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script {

	public static void main(String[] args)
{
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","E:\\eclipse\\selenium prerequistions\\scriptmethod\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		
		WebDriverManager.firefoxdriver().setup();
		//System.setProperty("webdriver.gdcko.driver","E:/eclipse/selenium prerequistions/scriptmethod/geckodriver.exe");
		FirefoxDriver driver1 = new FirefoxDriver();
		driver.navigate().to("https://www.facebook.com");
		
		
				
				
		

	}

	private static void navigateurl(String string) {
		// TODO Auto-generated method stub
		
	}

}
