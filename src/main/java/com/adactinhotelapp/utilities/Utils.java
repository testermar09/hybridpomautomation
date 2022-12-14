package com.adactinhotelapp.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.adactinhotelapp.base.Page;

public class Utils extends Page {
	
	public static String resourceFolder="src\\test\\resources";
	public static String screenshotPath;
	
	public static String screenshotName;
	
	public static void captureScreenshot()
	{
		
		screenshotPath=System.getProperty("user.dir")+"\\screenshots\\";
		
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Date d=new Date();
		
		screenshotName=d.toString().replace(":", "_").replace(" ", "_")+".png";
		
		try {
			FileUtils.copyFile(srcFile, new File(screenshotPath+screenshotName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static Object[][] getData(String sheetName,String testcase)  
	{
		
		FileInputStream fis1=null;
		try {
			fis1 = new FileInputStream(resourceFolder+"\\excels\\MasterTestData.xlsx");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		XSSFWorkbook wb1=null;
		try {
			wb1 = new XSSFWorkbook(fis1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		XSSFSheet ws1=wb1.getSheet(sheetName);
		
		ArrayList<Row> testCaseRows=new ArrayList<Row>();
		
		testCaseRows=findRows(ws1,testcase);
		
		Object[][] obj=new Object[testCaseRows.size()-1][testCaseRows.get(0).getLastCellNum()-1];
		
		//Object[][] obj=Object[4][3];
		//obj[0][0]="reyaz0310";
		//obj[0][1]
		//obj[0][2]
		
		for(int i=0;i<testCaseRows.size()-1;i++)
		{
			
			for(int j=0;j<testCaseRows.get(0).getLastCellNum()-1;j++)
			{
				obj[i][j]=testCaseRows.get(i+1).getCell(j+1).getStringCellValue();
				
				System.out.print(obj[i][j]+"\t");
			}
			
			System.out.println();
		}
		
				
		return obj;
		
	}
	
	public static ArrayList<Row> findRows(Sheet ws,String testCase)
	{
		
		ArrayList<Row> rows=new ArrayList<Row>();
		
		ArrayList<Row> testCaserows=new ArrayList<Row>();
		
		System.out.println(ws.getLastRowNum());
		
		//To collect all rows having data only
		
		for(int i=0;i<=ws.getLastRowNum();i++)
		{
			
			if(!((ws.getRow(i))==null))
			{
				rows.add(ws.getRow(i));
			}
			
		}
		
		
		System.out.println(rows.size());
		
		
		//To collect rows for Test Case
		
		for(int i=0;i<rows.size();i++)
		{
			
			if(rows.get(i).getCell(0).getStringCellValue().equalsIgnoreCase(testCase))
			{
				testCaserows.add(rows.get(i));
			}
		}
		
		
		
		return testCaserows;
		
		
		
	}

}
