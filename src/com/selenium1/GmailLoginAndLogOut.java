package com.selenium1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;
@SuppressWarnings("deprecation")
public class GmailLoginAndLogOut {
public WebDriver driver=new FirefoxDriver(); 
Selenium se = new WebDriverBackedSelenium(driver,"http://gmail.com");
@Test(priority=0)
public void login() {
driver.get("http://gmail.com");
se.waitForPageToLoad("1000");
driver.findElement(By.id("Email")).sendKeys("krevathi234@gmail.com");
se.waitForPageToLoad("3000");
driver.findElement(By.id("Passwd")).sendKeys("chalapathi");
driver.findElement(By.id("signIn")).click();
}
@Test(priority=1)
public void logout(){
se.waitForPageToLoad("3000");
driver.findElement(By.xpath("//span[@class=gb_Z gbii']")).click();
se.waitForPageToLoad("1000");
driver.findElement(By.id("//a[contains(text(),'Sign out')]")).click();
}
}

