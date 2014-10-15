package com.selenium1;


import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChangethePositionOfOpenBrowser 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().setPosition(new Point(0, 0));
		Thread.sleep(2000);
		driver.manage().window().setPosition(new Point(500, 400));
	}
}
