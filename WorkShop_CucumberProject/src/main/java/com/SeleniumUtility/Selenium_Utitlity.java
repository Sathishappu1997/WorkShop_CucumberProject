package com.SeleniumUtility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Selenium_Utitlity {

	WebDriver driver;

	public Selenium_Utitlity(WebDriver ldriver) {
		driver=ldriver;
		PageFactory.initElements(ldriver, this);
	}
	
	public void Selectdrop(WebElement element, String Value) {
		
		Select dropdown=new Select(element);
		dropdown.selectByVisibleText(Value);
	}
	
	public void Take_Screenshot(String path) throws IOException {
		
		TakesScreenshot snap=(TakesScreenshot)driver;
		File src=snap.getScreenshotAs(OutputType.FILE);
		FileUtils.copyDirectory(src, new File(path));
		
	}
	
	public void gettitle() {
		System.out.println(driver.getTitle());
	}
	
	
	public void verifylogo(boolean logo_Presence) {
		Assert.assertEquals(logo_Presence, true);
		
	}
	

}
