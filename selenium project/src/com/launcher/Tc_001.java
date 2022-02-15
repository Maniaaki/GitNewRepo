package com.launcher;

//import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc_001 extends Basetest
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		launcher ("chromebrowser");
		navigateurl("https://www.amazon.in");
		
		WebDriverManager.firefoxdriver().setup();
		launcher ("firefoxbrowser");
		navigateurl("https://www.amazon.in");
		

	}
	
}