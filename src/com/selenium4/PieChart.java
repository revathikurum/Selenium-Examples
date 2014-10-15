package com.selenium4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PieChart 
{
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

	driver = new FirefoxDriver(); 
	//Thread.sleep(5000); 
	driver.get("http://yuilibrary.com/yui/docs/charts/charts-pie.html");

	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	//FIND DIFFERENT SECTIONS IN PIE CHART 
	WebElement VioletePart = driver.findElement(By.xpath("//*[contains(@class,'yui3-svgSvgPieSlice')][@fill='#66007f']")); 
	WebElement GreenPart = driver.findElement(By.xpath("//*[contains(@class,'yui3-svgSvgPieSlice')][@fill='#295454']")); 
	WebElement GreyPart = driver.findElement(By.xpath("//*[contains(@class,'yui3-svgSvgPieSlice')][@fill='#e8cdb7']")); 
	WebElement LightVioletePart = driver.findElement(By.xpath("//*[contains(@class,'yui3-svgSvgPieSlice')][@fill='#996ab2']")); 
	WebElement BrownPart = driver.findElement(By.xpath("//*[contains(@class,'yui3-svgSvgPieSlice')][@fill='#a86f41']")); 
	//TOOLTIP OVER PIE CHART 
	WebElement ToolTip = driver.findElement(By.xpath("//div[contains(@id,'_tooltip')]"));

	//CLICK EACH SECTION OF PIE CHART AND GET THE TEXT OVER IT 
	VioletePart.click(); 
	System.out.println("Violete Part:"+ToolTip.getText()); 
	GreyPart.click(); 
	System.out.println("Grey Part:"+ToolTip.getText()); 
	LightVioletePart.click(); 
	System.out.println("Light Violete Part:"+ToolTip.getText()); 
	GreenPart.click(); 
	System.out.println("Green Part:"+ToolTip.getText()); 
	BrownPart.click(); 
	System.out.println("Brown Part:"+ToolTip.getText()); 
}
}
