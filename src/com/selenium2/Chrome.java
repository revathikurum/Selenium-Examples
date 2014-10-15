package com.selenium2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome
{
	static WebDriver driver;
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E://Graylocus Company/Selinium Softwares/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	    driver.findElement(By.name("Email")).sendKeys("krevathi234@gmail.com");
	    driver.findElement(By.name("Passwd")).sendKeys("chalapathi");
	    driver.findElement(By.name("signIn")).click();
	}
}
