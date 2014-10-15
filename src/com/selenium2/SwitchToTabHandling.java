package com.selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchToTabHandling 
{
	static WebDriver webdriver;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigateToIRCTCPage();
		
	}
	
	private static void launchBrowser() 
	{
		webdriver = new FirefoxDriver();
		webdriver.get("https://www.irctc.co.in/");
		
	}
	private static void navigateToIRCTCPage() 
	{
		String oldTab = webdriver.getWindowHandle();
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN); 
		webdriver.findElement(By.linkText("Hotels and Lounge")).sendKeys(selectLinkOpeninNewTab);
		new Actions(webdriver).sendKeys(Keys.chord(Keys.CONTROL, Keys.TAB)).perform();
		webdriver.switchTo().window(oldTab);
		webdriver.findElement(By.xpath("//input[contains(@id, 'textfield')]")).sendKeys("Bangalore");
	}
}
