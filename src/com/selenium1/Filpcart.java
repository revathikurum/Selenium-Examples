package com.selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Filpcart 
{
	static WebDriver driver;
	@BeforeTest
		public void open()
		{
			driver=new FirefoxDriver();
			driver.get("http://www.flipkart.com");
		}
	@Test
		public void checkbox() throws Exception
		{
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@name='q']")).sendKeys("television 32 inches");
			driver.findElement(By.xpath("//input[@value='Search']")).click();
			List<WebElement> allCheckBoxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
			System.out.println(allCheckBoxes.size());
			for (int i=0;i<allCheckBoxes.size();i=i+1){
				allCheckBoxes.get(i).click();
			}
			int count=0;
			for (int i=0;i<allCheckBoxes.size();i++){
			System.out.println(i+"check is selected "+allCheckBoxes.get(i).isSelected());
			if (allCheckBoxes.get(i).isSelected())
			{
			count++;
			}
			}
			System.out.println("no of checked boxes"+count);
		}
}
