package com.selenium4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class GoogleLinksGetCount 
{
	public static void main(String[] args) {
		ProfilesIni pr = new ProfilesIni();
		FirefoxProfile fp = pr.getProfile("FirefoxProfile_Selenium");
		FirefoxDriver driver = new FirefoxDriver(fp);
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement footer = driver.findElement(By.xpath("//div[@id='als']"));
		List <WebElement> links = footer.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i = 0;i<links.size();i++)
		{
		System.out.println(links.get(i).getText() );
		}
	}
}
