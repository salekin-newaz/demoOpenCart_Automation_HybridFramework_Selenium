package com.openCart.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import com.inetBanking.testCases.BaseClass;



public class LoginPage{
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	
	@FindBy(xpath="//span[text()= 'My Account']")
	WebElement lnkMyaccount;
	
	@FindBy(linkText="Register")
	WebElement linkRegister;
	
	@FindBy(linkText="Login")
	WebElement loginLogin;
	
	public void clickMyAccount() {
		lnkMyaccount.click();
	}
	
	public void clickRegister() {
		linkRegister.click();
	}
	
	public void clickLogin() {
		loginLogin.click();
	}
	
	
	

}
