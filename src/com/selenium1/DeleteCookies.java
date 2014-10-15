package com.selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DeleteCookies 
{
	static WebDriver driver = new FirefoxDriver();
	public static void main(String[] args) 
	{
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		System.out.println("cookies before delete:"+driver.manage().getCookies());
		driver.manage().deleteAllCookies();
		System.out.println("cookies after delete:"+driver.manage().getCookies());
	}
}
