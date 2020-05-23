package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_Login_Page {
	
WebDriver driver;
	
	public OrangeHRM_Login_Page(WebDriver rdriver){
	
	driver=rdriver;
	PageFactory.initElements(rdriver, this);

	}
	
	@FindBy(id="txtUsername")
	WebElement Username;
	
	@FindBy(id="txtPassword")
	WebElement Password;
	
	@FindBy(id="btnLogin")
	WebElement LoginButton;
	
	@FindBy(xpath="//*[@id=\"divLogo\"]/img")
	WebElement Logo;
	
	public void Login_Username(String uname) {
		Username.sendKeys(uname);
	}
	
	public void Login_Password(String pwd) {
		Password.sendKeys(pwd);
	}
	
	public void Login_LoginButton() {
		LoginButton.click();
	}
	
	public boolean Logo_Presence() {
		return Logo.isDisplayed();
	}


}
