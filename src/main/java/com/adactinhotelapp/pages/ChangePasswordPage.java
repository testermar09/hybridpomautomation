package com.adactinhotelapp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.adactinhotelapp.base.Page;

public class ChangePasswordPage extends Page{
	
	@FindBy(xpath="//input[@name='current_pass']")
	WebElement current_passTextbox;
	
	@FindBy(xpath="//input[@name='new_password']")
	WebElement new_passwordTextbox;
	
	@FindBy(xpath="//input[@name='re_password']")
	WebElement re_passwordTextbox;
	
	@FindBy(xpath="//input[@name='change_password_Submit']")
	WebElement  change_password_SubmitButton;
	
	
	
	public void current_passTextbox(String text)
	{
		type(current_passTextbox,text);
	}
	
	public void new_passwordTextbox(String text)
	{
		type(new_passwordTextbox,text);
	}public void re_passwordTextbox(String text)
	{
		type(re_passwordTextbox,text);
	}public void change_password_SubmitButton()
	{
		click(change_password_SubmitButton);
	}
	


}
