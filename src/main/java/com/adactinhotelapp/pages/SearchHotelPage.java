package com.adactinhotelapp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.adactinhotelapp.base.Page;

public class SearchHotelPage extends Page {

	@FindBy(xpath = "//select[@name='location']")
	WebElement locationDropdown;

	@FindBy(xpath = "//select[@name='hotels']")
	WebElement hotelsDropdown;

	@FindBy(xpath = "//select[@name='room_type']")
	WebElement roomTypeDropdown;

	@FindBy(xpath = "//select[@name='room_nos']")
	WebElement noOfRoomsDropdown;

	@FindBy(xpath = "//select[@name='adult_room']")
	WebElement noOfAdultsDropdown;

	@FindBy(xpath = "//select[@name='child_room']")
	WebElement noOfChildrenDropdown;

	@FindBy(xpath = "//input[@name='datepick_in']")
	WebElement checkInDateTextbox;

	@FindBy(xpath = "//input[@name='datepick_out']")
	WebElement checkOutDateTextbox;

	public void locationDropdown(String text) {
		select(locationDropdown, text);
	}

	public void hotelsDropdown(String text) {
		select(hotelsDropdown, text);
	}
	
	public void roomTypeDropdown(String text) {
		select(roomTypeDropdown, text);
	}
	
	public void noOfRoomsDropdown(String text) {
		select(noOfRoomsDropdown, text);
	}
	
	public void noOfAdultsDropdown(String text) {
		select(noOfAdultsDropdown, text);
	}
	
	public void noOfChildrenDropdown(String text) {
		select(noOfChildrenDropdown, text);
	}
	
	public void checkInDateTextbox(String text)
	{
		type(checkInDateTextbox,text);
	}
	
	public void checkOutDateTextbox(String text)
	{
		type(checkOutDateTextbox,text);
	}

}