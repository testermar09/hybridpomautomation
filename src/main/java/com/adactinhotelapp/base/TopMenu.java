package com.adactinhotelapp.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.adactinhotelapp.pages.BookedItineraryPage;
import com.adactinhotelapp.pages.ChangePasswordPage;
import com.adactinhotelapp.pages.LogOutPage;
import com.adactinhotelapp.pages.SearchHotelPage;

public class TopMenu {
	
	WebDriver driver;
	
	@FindBy(xpath="//a[text()='Search Hotel']")
	WebElement searchHotelLink;
	
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	WebElement bookedItineraryLink;
	
	@FindBy(xpath="//a[text()='Change Password']")
	WebElement changePasswordLink;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logoutLink;
	
	
	
	public TopMenu(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public SearchHotelPage goToSearchHotel()
	{
		Page.click(searchHotelLink);
		
		return new SearchHotelPage();
	}
	
	public BookedItineraryPage goToBookedItinerary()
	{
		Page.click(bookedItineraryLink);
		
		return new BookedItineraryPage();
	}
	
	public ChangePasswordPage goToChangePassword()
	{
		Page.click(changePasswordLink);
		
		return new ChangePasswordPage();
	}
	
	public LogOutPage goToLogout()
	{
		Page.click(logoutLink);
		
		return new LogOutPage();
	}
	

}
