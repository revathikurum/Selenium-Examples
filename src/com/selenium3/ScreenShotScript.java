package com.selenium3;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotScript 
{
	static WebDriver driver;
	public static void main(String[] args) 
	{
		driver = new FirefoxDriver();
		driver.get("http://google.co.in");
		try 
		{ 
			File scrnshots = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrnshots, new File("E://Files/google_page.png"));
		} 
		catch (Exception ex) 
		{
		ex.printStackTrace();
		}
	}
}
