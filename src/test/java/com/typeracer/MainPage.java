package com.typeracer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
	
	public MainPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath="(//a[@class='gwt-Anchor'])[1]")
	WebElement signIn;
	
	@FindBy(xpath="(//input[@class='gwt-TextBox'])[1]")
	WebElement userName;
	
	@FindBy(xpath="(//input[@class='gwt-PasswordTextBox'])[1]")
	WebElement password;
	
	@FindBy(xpath="(//button[@class='gwt-Button'])[1]")
	WebElement signInButton;
	
	@FindBy(xpath="//table[@class='navControls']")
	WebElement joinRace;
	
	@FindBy(xpath="(//td[@class='chrome_m']/table/tbody/tr/td/table)[2]/tbody/tr/td/table/tbody/tr/td/div")
	WebElement text;
	
	@FindBy(xpath="//input[@class='txtInput']")
	WebElement textType;

}
