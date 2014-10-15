package com.selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectFromDropAndDown
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div//span[2][contains(@class,'flL travelers rght_space room_sec1')]")).click();
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.chord(Keys.DOWN,Keys.DOWN)).perform();
		System.out.println("working");
	}
}
