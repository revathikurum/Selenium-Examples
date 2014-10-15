package com.selenium3;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Window_Tab_Handling 
{
	static WebDriver webdriver;
	public static void main(String[] args) 
	{
		launchBrowser();
		 //loggin into the application     
		loginPage(); 

        webdriver.findElement(By.xpath("//img[contains(@src, 'info')]")).click();
        webdriver.findElement(By.linkText("Feedback")).click();
        Set<String> handlevaluescoll = webdriver.getWindowHandles();
        int itemcount= handlevaluescoll.size();
        Object[] handl_objarry = handlevaluescoll.toArray();
       
        
	}
	private static void launchBrowser() 
	{
		webdriver = new FirefoxDriver();
		webdriver.get("http://encreo.com/vtiger");
        webdriver.manage().window().maximize();
	}
	private static void loginPage()
	{
		 webdriver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
	     webdriver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
	     webdriver.findElement(By.xpath("//input[@type='submit']")).click();
	}		
	
}
