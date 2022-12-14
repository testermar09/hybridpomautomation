package com.adactinhotelapp.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


import io.github.bonigarcia.wdm.WebDriverManager;



public class Page {
	
	public static WebDriver driver;
	
	public static Properties config=new Properties();
	
	public static FileInputStream fis;
	
	//extent reports object creation
	
	public ExtentReports rep;
	
	public static ExtentTest test;
	
	public static TopMenu menu;
	
	
	public Page()
	{
		
		try {
			fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\com\\adactinhotelapp\\properties\\config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		try {
			config.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		if(driver==null)
		{
			if(config.getProperty("browser").equalsIgnoreCase("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				
			}
			else if(config.getProperty("browser").equalsIgnoreCase("firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
				
			}
			else if(config.getProperty("browser").equalsIgnoreCase("edge"))
			{
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
				
			}
			
		}
		
		menu=new TopMenu(driver);
	}
	
	//common keywords /functions
	
	public static void log(String msg)
	{
		test.log(Status.INFO, msg);
	}
	
	public static void click(WebElement element)
	{
		log("Clicking on an Element "+element);
		
		element.click();
		
		test.log(Status.INFO, "Clicked on "+element);
	}
	
	public static void type(WebElement element,String text)
	{
		log("Entering "+text+" in to text box "+element);
		
		element.sendKeys(text);
		
		test.log(Status.INFO, "Entered the text into textbox "+element);
		
	}
	
	
	public static void select(WebElement element,String text)
	{
		log("Selecting the option "+text+" from dropdown  "+element);
		
		new Select(element).selectByVisibleText(text);
		
		test.log(Status.INFO, "Selected the option "+text+ "from dropdown"+element);
		
	}
	
	
	public static void verifyEqual(String expected,String actual)
	{
		try
		{
		
		Assert.assertEquals(actual, expected);
		
		}
		catch(Throwable t)
		{
			//capture screenshot
		}
		
		
	}
	
	

}
