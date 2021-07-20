package com.pack.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pack.loginPages.LoginPage;
import com.pack.loginPages.MainPages;
import com.pack.loginPages.OpenShiftCreation;

public class TC_TestCase_01 extends TC_BaseClass {
	  @Test
			public void loginTest() {
		   
		      
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
		    	
		
		    	   try {
						captureScreen(driver,"logintest");
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		    	

		    	if(driver.getTitle().equalsIgnoreCase("main")) {
		    		Assert.assertTrue(true);
		    	}
		    	else {
		    		Assert.assertTrue(false);
		    	}
		    	
		    	

  
  	

		    	
		    	
		    	
		    	
		    	
		    	
		    	
			
			
			

		  }
		

}
