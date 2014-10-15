package com.selenium2;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LoadPropertiesfileFromClasspath 
{
	public static void main(String[] args) 
	{
		Properties pro = new Properties();
		InputStream input = null;
		try
		{
			String filename = "E://Files/config.properties";
			input = LoadPropertiesfileFromClasspath.class.getClassLoader().getResourceAsStream(filename);
			if(input==null)
			{
				System.out.println("sorry to unable to find element::"+filename);
				return;
			}
			pro.load(input);
			System.out.println(pro.getProperty("database"));
			System.out.println(pro.getProperty("dbuser"));
			System.out.println(pro.getProperty("dbpassword"));
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			if(input !=null)
			{
				try
				{
					input.close();
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
}
