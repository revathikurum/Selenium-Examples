package com.selenium1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDownValuesWhichAreHidden 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[input[@tabindex='4']]//a")).click();
		
		List<WebElement> cities = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
		System.out.println("Number of cities : "+cities.size()); 
        for(int i=0; i<cities.size(); i++)
        {
            System.out.println(i+1+") city name: "+cities.get(i).getText());
        }
		
	}
}
