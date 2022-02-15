package com.launcher;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc_002 extends Basetest
{

	public static void main(String[] args) throws Exception 
	
	{
		init();
		WebDriverManager.chromedriver().setup();
		launcher("firefoxbrowser");
		navigateurl("iciciurl");

	}

}
