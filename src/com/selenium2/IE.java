package com.selenium2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE 
{
	static WebDriver driver;
	public static void main(String[] args)
	{
		System.setProperty("webdriver.ie.driver", "E://Graylocus Company/Selinium Softwares/IEDriverServer_Win32_2.39.0/IEDriverServer.exe");
        driver = new InternetExplorerDriver();
		driver.get("http://encreo.com/vtiger");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
}
}
