package com.selenium2;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandling 
{
	static WebDriver webdriver;
	public static void main(String[] args) throws InterruptedException
	{
		webdriver = new FirefoxDriver();
		webdriver.get("http://timesofindia.indiatimes.com/");
	
		webdriver.findElement(By.linkText("Mahesh Bhatt upset with Emraan Hashmi")).click();
		switchControlToLatestWindow(webdriver);
		System.out.println("Selenium Parent page is opened!!!!");
		Thread.sleep(5000);
	}
	private static void switchControlToLatestWindow(WebDriver webdriver) 
	{
		 Iterator<String> browsers = webdriver.getWindowHandles().iterator();
	        while(browsers.hasNext())
	        {
	            webdriver.switchTo().window(browsers.next());
	        }
	}
	
}
