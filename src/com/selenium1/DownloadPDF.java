package com.selenium1;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;

public class DownloadPDF 
{
	public static void main(String[] args) {
        FirefoxProfile profile = new FirefoxProfile();
        profile.setPreference( "browser.download.folderList", 2 );
        profile.setPreference( "browser.download.dir", "C:\\" ); //this will download pdf inside 'C' driver. You can give your path where u want to save the file.
        profile.setPreference( "plugin.disable_full_page_plugin_for_types", "application/pdf" );
        profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/csv,text/csv,application/pdfss, application/excel" );
        profile.setPreference( "browser.download.manager.showWhenStarting", false );
        profile.setPreference( "pdfjs.disabled", true );
        
        WebDriver driver = new FirefoxDriver(profile);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        //login
        driver.get("http://myaccount.rinfra.com/myaccnt/login.do");
        driver.findElement(By.id("username")).sendKeys("150811386");
        driver.findElement(By.name("password")).sendKeys("150811386");
        driver.findElement(By.xpath("//input[@alt='Enter']")).click();
        driver.findElement(By.xpath("//div[text()='close']")).click(); //close pop-up window
        
        Actions act = new Actions(driver);
        WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'bill & payments')]"));
        act.moveToElement(ele).perform(); //move cursor over bill & payment
        driver.findElement(By.xpath("//a[text()='download / print bill']")).click(); //clicking on 3rd element in the list
        driver.findElement(By.xpath("//a[@class='jqTransformSelectOpen']")).click(); // clicking on select drop down      
        driver.findElement(By.xpath("//a[@index='1']")).click();     //selecting 1st element         
        driver.findElement(By.xpath("//img[@src='images/view.gif']")).click(); // clicking on view
        
        //handle the windows
        Iterator<String> it = driver.getWindowHandles().iterator();
        String mainPage = it.next();
        String child = it.next();
        driver.switchTo().window(child); //switch to child window
        driver.findElement(By.xpath("//button[@id='download']")).click(); //click on download button
}
}
