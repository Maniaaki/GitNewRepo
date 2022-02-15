package com.launcher;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.util.Properties;

import org.omg.IOP.ProfileIdHelper;

//import javax.management.StringValueExp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Basetest 

{
	public static WebDriver driver;
	public static String projectpath =System.getProperty("user.dir");
	public static FileInputStream fis;
	public static Properties p;
	public static Properties mainprop;
	public static Properties childprop;
	//public static char[] url;
	
	
	public static void init() throws Exception  
	{
	
		fis = new FileInputStream(projectpath+"\\data.properties");
		Properties p = new Properties();
		p.load(fis);
		String value = p.getProperty("amazonurl");
		System.out.println(value);
		
		fis =new FileInputStream(projectpath+"\\environment1.properties");
		mainprop =new Properties();
		mainprop.load(fis);
		String e = mainprop.getProperty("env");
		System.out.println(e);
		
		/*
		 * fis = new FileInputStream(projectpath+"\\Prod.properties"); childprop = new
		 * Properties(); childprop.load(fis); String url =
		 * childprop.getProperty("amazonurl"); System.out.println(url);
		 */
		 fis = new FileInputStream(projectpath+"\\"+e+".properties");
		 childprop=new Properties();
		 childprop.load(fis);
		 
		String url = childprop.getProperty("amazonurl");
		System.out.println(url);
				
	}
	public static void launcher (String browser) 
	{
		if (p.getProperty(browser).equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if (p.getProperty(browser).equals("firefox"))
		{
	     driver = new FirefoxDriver();
		}
	}
	 
	public static void navigateurl (String url)
	{
		driver.get(childprop.getProperty(url));
	}
}
