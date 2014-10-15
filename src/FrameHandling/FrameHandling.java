package FrameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameHandling 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		//System.setProperty("webdriver.chrome.driver", "E://Graylocus Company/Selinium Softwares/chromedriver.exe");
		//driver = new ChromeDriver();
		driver = new FirefoxDriver();
		driver.get("http://selenium.googlecode.com/git/docs/api/java/index.html");
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("Actions")).click();
	}
}
