package com.openCart.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.openCart.pageObjects.AccountRegistrationPage;
import com.openCart.pageObjects.LoginPage;

public class TC_002_AccountRegistration extends BaseClass{

	
	
	
	@Test(groups= {"regression","master"})
	public void test_account_Registration() throws IOException {
		
		logger.info("Starting Account Registration");
			
			driver.get(baseURL);
			logger.info("URL is opened");
			driver.manage().window().maximize();
			
			LoginPage lp= new LoginPage(driver);
			lp.clickMyAccount();
			logger.info("Clicked on My Account");
			
			lp.clickRegister();
			logger.info("Clicked on Register");
			
			AccountRegistrationPage regpage= new AccountRegistrationPage(driver);
			regpage.setFirstName("salekin");
			
			regpage.setlastName("Canedy");
			logger.info("Provided Last Name ");
			
			regpage.setEmail(randomestring()+"@gmail.com");
			logger.info("Provided Email ");
			
			regpage.setTelephone("65656565");
			logger.info("Provided Telephone ");
			
			regpage.setPassword("abcxyz");
			logger.info("Provided Password ");
			
			regpage.setConfirmPassword("abcxyz");
			logger.info("Provided Confrmed Password ");
			
			regpage.setPrivacyPolicy();
			logger.info("Set Privacy Policy ");
			
			regpage.clickContinue();
			logger.info("Clicked on Continue ");
			
			String confmsg=regpage.getConfirmationMsg();
			
			if(confmsg.equals("Your Account Has Been Created!"))
			{
				logger.info("Account Registration Success ");
				Assert.assertTrue(true);
			}
			else
			{
				captureScreen(driver, "test_accout_Registration"); 
				logger.error("Account Registration Failed ");
				Assert.assertTrue(false);
			}
					
			logger.info(" Finished TC_001_AccountRegistration ");
		}
}


