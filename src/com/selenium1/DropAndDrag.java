package com.selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DropAndDrag 
{
	static WebDriver driver = new FirefoxDriver();
	
	public static void main(String[] args) 
	{
			driver.get("http://yuiblog.com/sandbox/yui/3.2.0pr1/examples/dd/groups-drag_clean.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			Actions act = new Actions(driver);
			WebElement source = driver.findElement(By.id("pt1"));
		    WebElement target = driver.findElement(By.id("t2"));
		    act.dragAndDrop(source, target).perform();
		
	}
}
