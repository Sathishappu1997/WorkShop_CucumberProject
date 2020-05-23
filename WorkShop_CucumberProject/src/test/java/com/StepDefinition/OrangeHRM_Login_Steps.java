package com.StepDefinition;

import java.io.IOException;

import com.BaseClass.LibraryClass;
import com.Pages.OrangeHRM_Login_Page;
import com.SeleniumUtility.Selenium_Utitlity;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHRM_Login_Steps extends LibraryClass {
	
	OrangeHRM_Login_Page login;
	Selenium_Utitlity sel;
	
	@Given("^Open browser and Go to Url$")
	public void open_browser_and_Go_to_Url() throws IOException{
		
		LaunchApplication();
		System.out.println("launch the browser and navigate to url");
	}

	@When("^verify the title$")
	public void verify_the_title(){
	 
		sel=new Selenium_Utitlity(driver);
		sel.gettitle();
		System.out.println("title verified");
	}

	@Then("^enter the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_the_and(String uname, String pwd){

		login=new OrangeHRM_Login_Page(driver);
		login.Login_Username(uname);
		login.Login_Password(pwd);
		sel.verifylogo(login.Logo_Presence());
		System.out.println("logo verified");
	}

	@Then("^click the submit button$")
	public void click_the_submit_button() throws InterruptedException{
		login.Login_LoginButton();
		Thread.sleep(3000);
	}

	@Then("^Close the Browser$")
	public void close_the_Browser(){
		teardown();
	}

}
