package com.pack.testCases;

import java.util.concurrent.TimeUnit;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.pack.loginPages.LoginPage;

public class TC_TestCase_01 extends TC_BaseClass {
	  @Test
			public void loginTest() {
		   
				driver.get(url);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    	
		    
		    	LoginPage lp=new LoginPage(driver);
		    	
		       //  lp.setPartnerCode(partnerCode);
		    	//lp.clickNext();
		    	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			    	
			    logger.info("enter user name");
		     	lp.setUserName(loginas);
				

		        lp.setPassWord(Password);
		        
		        logger.info("password entered");
		    	try {
		    		
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    	lp.clickSignIn();
		    	

		    	if(driver.getTitle().equalsIgnoreCase("main")) {
		    		Assert.assertTrue(true);
		    		logger.info("login passed");

		    	}
		    	else {
		    		Assert.assertTrue(false);
		    		logger.info("login failed");

		    	}
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
			
			
			

		  }
		

}
