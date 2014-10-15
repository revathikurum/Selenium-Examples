package com.selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingCaptcha 
{
	public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.indianrail.gov.in/pnr_Enq.html");
        String captchaValue = driver.findElement(By.xpath("//span[@id='txtCaptchaDiv']")).getText();//this will read the captcha
        System.out.println(captchaValue);
        driver.findElement(By.xpath("//input[@id='txtInput']")).sendKeys(captchaValue);
    }
}
