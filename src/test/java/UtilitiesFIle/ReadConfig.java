package UtilitiesFIle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	Properties pro;
	String path="C:\\Users\\user\\eclipse-workspace\\MyFirstProject\\ConfigurationsFile\\Config.properties";
	public ReadConfig()
	{	FileInputStream f1=null;
		pro=new Properties();
		try {
			f1=new FileInputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pro.load(f1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String geturl()
	{
		String s1=pro.getProperty("baseurl");
		if(s1!=null)
		{
			return s1;
		}
		else
		{
			throw new RuntimeException("url not found"); 
		}
	}
	public String getbrowser()
	{
		String s1=pro.getProperty("browser");
		if(s1!=null)
		{
			return s1;
		}
		else
		{
			throw new RuntimeException("browser not found"); 
		}
	}

}
