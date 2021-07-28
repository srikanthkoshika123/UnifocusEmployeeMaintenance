package com.pack.testCases;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pack.loginPages.LoginPage;
import com.pack.loginPages.MainPages;
import com.pack.loginPages.OpenShiftCreation;

public class TC_TestCase_01 extends TC_BaseClass {
	  @Test
			public void loginTest() throws  IOException, InterruptedException {
		  	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    	
		    
		    	LoginPage lp=new LoginPage(driver);
		    	
		       //  lp.setPartnerCode(partnerCode);
		    	//lp.clickNext();
		    	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			    	
			    logger.info("enter user name");
		     	lp.setUserName(loginas);
				

		        lp.setPassWord(Password);
		     
		        	
		        logger.info("password entered");
		    	
		    		
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
