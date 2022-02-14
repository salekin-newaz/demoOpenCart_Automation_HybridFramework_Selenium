package com.openCart.testCases;

import org.testng.annotations.Test;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.openCart.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass{
	
	
	@Test
	public void loginTest() throws IOException, InterruptedException {
		
		driver.get(baseURL);
		logger.info("URL is opened");
		driver.manage().window().maximize();
		
		LoginPage lp= new LoginPage(driver);
		lp.clickMyAccount();
		Thread.sleep(5000);
		logger.info("Click on My Account");
		lp.clickLogin();;
		logger.info("Click on Login");
		Thread.sleep(5000);
		
		
//		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
//			Assert.assertTrue(true);
//			logger.info("Login test Passed");
//		}
//		else {
//			captureScreen(driver,"loginTest");
//			Assert.assertTrue(false);
//			logger.info("Login test failed");
//		}
		
		
	}
	

}
