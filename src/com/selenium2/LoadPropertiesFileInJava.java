package com.selenium2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LoadPropertiesFileInJava 
{
	public static void main(String[] args) 
	{
		Properties pro = new Properties();
		InputStream input = null;
		try
		{
			input = new FileInputStream("E://Files/config.properties");
			pro.load(input);
			System.out.println(pro.getProperty("database"));
			System.out.println(pro.getProperty("dbuser"));
			System.out.println(pro.getProperty("dbpassword"));
		}
		catch(IOException io)
		{
			io.printStackTrace();
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
