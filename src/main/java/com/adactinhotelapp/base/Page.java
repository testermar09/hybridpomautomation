package com.adactinhotelapp.base;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

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
		
	}
	
	
	

}
