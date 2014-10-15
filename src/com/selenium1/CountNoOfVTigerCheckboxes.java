package com.selenium1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountNoOfVTigerCheckboxes 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		
		driver.findElement(By.xpath("(//a[.='Leads'])[1]")).click();
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(int i=0; i<checkboxes.size(); i=i+2)
		{
			checkboxes.get(i).click();
		}
		int checkedCount = 0;
		for(int i=0; i<checkboxes.size(); i++)
		{
			System.out.println(i+"checkbox is selected"+checkboxes.get(i).isSelected());
			if(checkboxes.get(i).isSelected())
			{
				checkedCount++;
			}
		}
		System.out.println("number of selected checkcounts:"+checkedCount);
	}
		
}

