package com.selenium1;

import java.util.Calendar;
import java.util.GregorianCalendar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class CalenderHandler 
{
	public static void main(String[] args) 
	{
			int day, month, year;
			GregorianCalendar date =  new GregorianCalendar();
	        day = date.get(Calendar.DAY_OF_MONTH);
	        month = date.get(Calendar.MONTH)+1;
	        year = date.get(Calendar.YEAR);
	        String today = "a_"+year+"_"+month+"_"+day;
	        System.out.println(today);
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("http://www.yatra.com/");
			driver.findElement(By.id("BE_flight_depart_date")).click();
			driver.findElement(By.xpath("//a[@id='"+today+"']")).click();
  
	}
}
