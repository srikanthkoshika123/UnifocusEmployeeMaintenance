package com.pack.testCases;

import java.io.IOException;
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
		    	
		      
		    	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			    	
			    logger.info("enter user name");
		     	lp.setUserName(loginas);
		     	logger.info("password entered");

		        lp.setPassWord(Password);
		     
		        	
		        
		        logger.info("signin clicked");
		    		
					Thread.sleep(2000);
			
		    	lp.clickSignIn();

		    	if(driver.getTitle().equalsIgnoreCase("main")) {
		    		Assert.assertTrue(true);
		    		
		    	}
		    	else {
		    		captureScreen(driver,"logintest");
		    		
		    		Assert.assertTrue(false);
		    	}
		    	
		  }
}
