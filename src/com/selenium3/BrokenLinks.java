package com.selenium3;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLinks 
{
	 public static void main(String[] args) throws InterruptedException, IOException {
	        
	        WebDriver driver = new FirefoxDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.navigate().to("file:///C:/Program%20Files%20%28x86%29/sank_java/selenium/WebDriver/Selenium_web.html");
	        List<WebElement> elements = driver.findElements(By.tagName("a"));
	        System.out.println(elements.size());
	        
	        for(WebElement linkElement: elements)
	        {
	            String link = linkElement.getAttribute("href");
	            System.out.println(link);
	            if(link!=null){
	                 if(!isLink(link))
	                 {
	                     continue;
	                 }
	        }
	            verifyLinkActive(link);
	        }
	        driver.quit();
	    }
	    public static boolean isLink(String link){
	        
	        return link.contains("http://") ;
	    }
	    public static void verifyLinkActive(String linkUrl) throws IOException{
	        try {
	            URL url = new URL(linkUrl);
	            HttpURLConnection httpURLConnect = (HttpURLConnection)url.openConnection();
	            httpURLConnect.setConnectTimeout(3000);
	            httpURLConnect.connect();
	            if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND){
	                System.out.println(linkUrl+"-"+httpURLConnect.getResponseMessage()+"-"+
	            HttpURLConnection.HTTP_NOT_FOUND);
	            }
	        } catch (MalformedURLException e) {
	            e.printStackTrace();
	        }
	    }
}
