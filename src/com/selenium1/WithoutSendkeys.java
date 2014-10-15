package com.selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.JavascriptExecutor;

public class WithoutSendkeys 
{
	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		((JavascriptExecutor)driver).executeScript("document.getElementById('Email').value='krevathi234@gmail.com'");
		((JavascriptExecutor)driver).executeScript("document.getElementById('Passwd').value='chalapathi'");
		((JavascriptExecutor)driver).executeScript("document.getElementById('signIn').click()");
		
	}
}
