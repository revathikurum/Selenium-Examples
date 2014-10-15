package com.selenium1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalenderPopup 
{
	public static void main(String[] args)
	{
			String futrDate = "td_"+2015+"_"+06+"_"+24; 
		    WebDriver driver = new FirefoxDriver();
		    driver.get("http://www.yatra.com/");
		    
		    driver.findElement(By.id("BE_flight_depart_date")).click();
		    String monthYear="";
		    
		    while(!(monthYear.equals("June 2015")))
		    {
		         driver.findElement(By.xpath("//a[@class='js_btnNext sprite nextBtn']")).click(); 
		         monthYear = driver.findElement(By.xpath("//span[@class='js_monthTitle']")).getText(); 
		    }
	    
	     driver.findElement(By.xpath("//td[@id='"+futrDate+"']")).click(); 
	}
}
