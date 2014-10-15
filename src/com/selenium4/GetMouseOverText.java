package com.selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class GetMouseOverText 
{
	public static void main(String[] args) { 
		 
		   WebDriver driver = new FirefoxDriver();
		 
		   driver.manage().window().maximize();
		 
		   driver.navigate().to("http://helloselenium.blogspot.com");
		   
		   WebElement link = driver.findElement(By.xpath("//a[@rel='author']"));
		   
		   new Actions(driver).moveToElement(link).build().perform();
		   
		   String linkTitle = link.getAttribute("title");
		   
		   System.out.println(linkTitle);
	}
}
