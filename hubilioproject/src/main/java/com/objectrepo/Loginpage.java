package com.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage
{
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="user_name")
	private WebElement username;
	
	@FindBy(name="user_password")
	private WebElement passcode;
	
	@FindBy(id="submitButton")
	private WebElement click;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPasscode() {
		return passcode;
	}

	public WebElement getClick() {
		return click;
	}

}
