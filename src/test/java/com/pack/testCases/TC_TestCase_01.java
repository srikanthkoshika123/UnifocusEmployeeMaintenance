package com.pack.testCases;

import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pack.loginPages.LoginPage;

import recordingTests.ScreenRecorderUtil;


public class TC_TestCase_01 extends TC_BaseClass {
	 @Test
		public void loginTest() throws  Exception {
	    ScreenRecorderUtil.startRecord("loginPage");
	    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    	LoginPage lp=new LoginPage(driver);
	    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    	lp.setPartnerCode(partnerCode);
	    	lp.clickNext();
		    logger.info("enter user name");
		    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	     	lp.setUserName(loginas);
	     	logger.info("password entered");
	        lp.setPassWord(Password);
			Thread.sleep(2000);
	    	lp.clickSignIn();
	    	logger.info("signin clicked");
	    	Thread.sleep(2000);
	    	lp.clickUnifocus();
	        lp.getselect_List();
	        Thread.sleep(2000);
	    	if(driver.getTitle().equalsIgnoreCase("singularity")) {
	    		Assert.assertTrue(true);
	    		
	    	}
	    	else {
	    		
	    		Assert.assertTrue(false);
	    	}	
	  }
}