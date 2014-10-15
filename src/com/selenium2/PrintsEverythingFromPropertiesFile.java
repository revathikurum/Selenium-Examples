package com.selenium2;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

public class PrintsEverythingFromPropertiesFile 
{
	public static void main(String[] args) 
	{
		PrintsEverythingFromPropertiesFile file = new PrintsEverythingFromPropertiesFile();
		file.printeverything();
	
	}
	private void printeverything() 
	{
		Properties prop = new Properties();
		InputStream input = null;
	 
		try {
	 
			String filename = "E://Files/config.properties";
			input = getClass().getClassLoader().getResourceAsStream(filename);
			if (input == null) {
				System.out.println("Sorry, unable to find " + filename);
				return;
			}
	 
			prop.load(input);
	 
			Enumeration<?> e = prop.propertyNames();
			while (e.hasMoreElements()) 
			{
				String key = (String) e.nextElement();
				String value = prop.getProperty(key);
				System.out.println("Key : " + key + ", Value : " + value);
			}
	 
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
