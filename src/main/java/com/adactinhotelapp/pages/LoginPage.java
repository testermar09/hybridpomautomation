package com.adactinhotelapp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.adactinhotelapp.base.Page;

public class LoginPage extends Page{
	
	
	@FindBy(xpath="//input[@name='username']")
	WebElement usernameTextBox;
	
	@FindBy(xpath="//input[@name='username']")
	WebElement passwordTextBox;
	
	@FindBy(xpath="//input[@name='username']")
	WebElement loginButton;
	
	public void usernameTextBox(String text)
	{
		type(usernameTextBox, text);
	}
	
	public void passwordTextBox(String text)
	{
		type(passwordTextBox, text);
	}
	
	public void loginButton(String text)
	{
		click(loginButton);
	}
	

}
