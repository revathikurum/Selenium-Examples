package com.selenium1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountNoOfCheckboxex 
{
	static WebDriver driver = new FirefoxDriver();
	public static void main(String[] args)
	{
		driver.get("http://www.gsmarena.com/samsung-phones-9.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='Checkbox']"));
		for(int i=0; i<checkboxes.size(); i=i+2)
		{
			checkboxes.get(i).click();
		}
		int checkedCount = 0, uncheckedCount = 0;
		for(int i=0; i<checkboxes.size(); i++)
		{
			System.out.println(i+"checkbox is selected"+checkboxes.get(i).isSelected());
			if(checkboxes.get(i).isSelected())
			{
				checkedCount++;
			}
			else
			{
				uncheckedCount++;
			}
		}
		System.out.println("number of selected checkcounts:"+checkedCount);
		System.out.println("number of selected checkcounts:"+uncheckedCount);
	}
}
