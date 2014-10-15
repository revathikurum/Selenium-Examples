package com.selenium1;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDownNotepad extends Thread
{
	static WebDriver driver; 
	
	public static void main(String[] args) throws IOException 
	{	
		driver = new FirefoxDriver();
		driver.get("http://www.etouch.net/home/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement service = driver.findElement(By.xpath("//a[text()='Services']"));
		Actions act = new Actions(driver);
		act.moveToElement(service);
		List<WebElement> dropdown = driver.findElements(By.xpath("//li[@id='services']//ul//ul/li"));
	    System.out.println(dropdown.size());
	    
	    FileWriter fileWriter = new FileWriter("E://Files/SeliniumDropDown.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        
        for(WebElement ele: dropdown)
        {
            System.out.println(ele.getText());
            bufferedWriter.write(ele.getText()+"\n");
        }
        bufferedWriter.close();
       
    }
		
}
