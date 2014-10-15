package com.selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextboxDisabledButSendingTheValue 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.naukri.com");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Post Resume")).click();
		WebElement user = driver.findElement(By.xpath("//input[@id='txt2']"));
		System.out.println(user.isEnabled());
		//user.sendKeys("hello");
		((JavascriptExecutor)driver).executeScript("document.getElementById('txt2').value='revathi'");
		WebElement pass = driver.findElement(By.xpath("//input[@name='PASSWORD']"));
		System.out.println(pass.isEnabled());
		pass.sendKeys("hello");
	}
}
