package com.selenium2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class WritePropertiesFileInjava 
{
	public static void main(String[] args) 
	{
		Properties pro = new Properties();
		OutputStream output = null;
		try
		{
			output = new FileOutputStream("E://Files/config.properties");
			pro.setProperty("database", "localhost");
			pro.setProperty("dbuser", "mykong");
			pro.setProperty("dbpassword", "password");	
			System.out.println("hi");
			pro.store(output, null);
		}
		catch(IOException io)
		{
			io.printStackTrace();
		}
		finally
		{
			if(output !=null)
			{
				try
				{
					output.close();
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
}
