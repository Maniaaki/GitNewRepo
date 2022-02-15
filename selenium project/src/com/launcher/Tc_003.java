package com.launcher;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc_003 extends Basetest
{

	public static void main(String[] args) throws Exception 
	{
		init();
	    WebDriverManager.chromedriver().setup();
	    launcher("chromebrowser");
	    navigateurl("amazonurl");
	    
	    driver.manage().window().maximize();
	    
	    String title=driver.getTitle();
	    System.out.println(title);
	    
	    String url=driver.getCurrentUrl();
	    System.out.println(url);
	    
	    driver.manage().deleteAllCookies();
	    Thread.sleep(4000);
	    driver.navigate().back();
	    Thread.sleep(4000);
	    driver.navigate().forward();
	    driver.quit();
	  }

}
