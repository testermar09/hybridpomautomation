package com.adactinhotelapp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.adactinhotelapp.base.Page;

public class NewUserRegistrationPage extends Page {

	@FindBy(xpath = "//input[@name='username']")
	WebElement usernameTextbox;

	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordTextbox;

	@FindBy(xpath = "//input[@name='re_password']")
	WebElement re_passwordTextbox;

	@FindBy(xpath = "//input[@name='full_name']")
	WebElement full_nameTextbox;

	@FindBy(xpath = "//input[@name='email_add']")
	WebElement email_addTextbox;

	@FindBy(xpath = "//input[@name='captcha']")
	WebElement captchaTextbox;

	@FindBy(xpath = "//input[@name='tnc_box']")
	WebElement tnc_boxTextbox;

	@FindBy(xpath = "//input[@name='Submit']")
	WebElement submitButton;

	@FindBy(xpath = "//input[@name='rest']")
	WebElement restButton;

	public void usernameTextbox(String text) {
		type(usernameTextbox, text);
	}

	public void passwordTextbox(String text) {
		type(passwordTextbox, text);
	}

	public void re_passwordTextbox(String text) {
		type(re_passwordTextbox, text);

	}

	public void full_nameTextbox(String text) {
		type(full_nameTextbox, text);

	}

	public void email_addTextbox(String text) {
		type(email_addTextbox, text);

	}

	public void captchaTextbox(String text) {
		type(captchaTextbox, text);

	}

	public void tnc_boxTextbox() {
		click(tnc_boxTextbox);

	}

	public void submitButton(String text) {
		type(submitButton, text);

	}

	public void restButton(String text) {
		type(restButton, text);

	}
}
