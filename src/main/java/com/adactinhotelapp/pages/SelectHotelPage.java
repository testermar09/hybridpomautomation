package com.adactinhotelapp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.adactinhotelapp.base.Page;

public class SelectHotelPage extends Page {
	
	@FindBy(xpath="//input[@name='radiobutton_0']")
	WebElement radioButton;
	
	
	@FindBy(xpath="//input[@name='continue']")
	WebElement continueButton;
	
	@FindBy(xpath="//input[@name='cancel']")
	WebElement cancelButton;
	
	
	public void radioButton()
	{
		click(radioButton);
	}
	
	public void continueButton()
	{
		click(continueButton);
	}
	
	public void cancelButton()
	{
		click(cancelButton);
	}
	
	
	

}
