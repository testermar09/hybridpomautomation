package com.adactinhotelapp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.adactinhotelapp.base.Page;

public class BookAHotelPage extends Page {
	
	
	@FindBy(xpath="//input[@name='first_name']")
	WebElement first_nameTextBox;
	
	@FindBy(xpath="//input[@name='last_name']")
	WebElement last_nameTextBox;
	
	@FindBy(xpath="//input[@name='address']")
	WebElement addressTextBox;
	
	@FindBy(xpath="//input[@name='cc_num']")
	WebElement cc_numTextBox;
	
	@FindBy(xpath="//select[@name='cc_type']")
	WebElement cardTypeDropdown;
	
	@FindBy(xpath="//select[@name='cc_exp_year']")
	WebElement cc_exp_yearDropdown;
	
	@FindBy(xpath="//select[@name='cc_exp_month']")
	WebElement cc_exp_monthDropdown;
	
	@FindBy(xpath="//input[@name='cc_cvv']")
	WebElement cvvTextBox;
	
	@FindBy(xpath="//input[@name='book_now']")
	WebElement book_nowButton;
	
	@FindBy(xpath="//input[@name='cancel']")
	WebElement cancelButton;
	
	
	public void first_nameTextBox(String text)
	{
		type(first_nameTextBox,text);
	}
	public void last_nameTextBox(String text)
	{
		type(last_nameTextBox,text);
	}
	public void addressTextBox(String text)
	{
		type(addressTextBox,text);
	}
	public void cc_numTextBox(String text)
	{
		type(cc_numTextBox,text);
	}
	public void cardTypeDropdown(String text)
	{
		select(cardTypeDropdown,text);
	}
	public void cc_exp_yearDropdown(String text)
	{
		select(cc_exp_yearDropdown,text);
	}
	public void cc_exp_monthDropdown(String text)
	{
		select(cc_exp_monthDropdown,text);
	}
	public void cvvTextBox(String text)
	{
		type(cvvTextBox,text);
	}
	public void book_nowButton()
	{
		click(book_nowButton);
	}
	public void cancelButton()
	{
		click(cancelButton);
	}
	
	
	

}
