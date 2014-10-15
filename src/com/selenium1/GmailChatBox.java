package com.selenium1;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GmailChatBox {
	WebDriver driver;

	@BeforeTest
	public void openurl()throws InterruptedException
	{
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter the gmail id: ");
	    String emailId = in.next();
	    System.out.println("Enter the pass: ");
	    String pass = in.next();
	    driver = new FirefoxDriver();
	   
	    driver.get("http://www.gmail.com");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	    driver.findElement(By.name("Email")).sendKeys(emailId);
	    driver.findElement(By.name("Passwd")).sendKeys(pass);
	    driver.findElement(By.name("signIn")).click();
	}
	@Test
	public void chatlist() throws InterruptedException
	{
	    List<WebElement> chatboxsize = driver.findElements(By.xpath("//table[@class='vH']/tbody"));
	    System.out.println("number of people in the gmail chat: "+chatboxsize.size());
	    String name="";
	    for (int i=1; i <=chatboxsize.size(); i++)
	    {
	        name = driver.findElement(By.xpath("//table[@class='vH']/tbody["+i+"]/tr[1]//span[1]")).getAttribute("textContent");
	        System.out.println(name);
	    }
	}
	@AfterTest
	public void closeBrowser()
	{
	}
}
