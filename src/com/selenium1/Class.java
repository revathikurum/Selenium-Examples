package com.selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Class 
{
	public static void main(String[] args) 
	{
		
			HtmlUnitDriver driver = new HtmlUnitDriver(true);
			 
			driver.setJavascriptEnabled(false);
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			driver.get("https://www.google.co.in/");
			 
			System.out.println(driver.getTitle());
	}

}
