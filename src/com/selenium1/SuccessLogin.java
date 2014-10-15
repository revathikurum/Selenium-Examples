package com.selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SuccessLogin
{
	static WebDriver driver = new FirefoxDriver();
	public static void main(String[] args) 
	{
		driver.get("http://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("login_dropOpenItem")).click();
		driver.findElement(By.id("username")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@class='chf_flL chf_textbox chf_defaultval chf_pwdtxt']")).sendKeys("revs@234");
		
		driver.findElement(By.id("login_btn")).click();
		
	}
}
