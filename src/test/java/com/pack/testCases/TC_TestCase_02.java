package com.pack.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.pack.loginPages.LoginPage;
import com.pack.loginPages.MainPages;

public class TC_TestCase_02 extends TC_BaseClass{
    
	@Test
	public void mainTest() throws InterruptedException {
		
		LoginPage lp=new LoginPage(driver);
    	
	      
	    	
	    logger.info("enter user name");
     	lp.setUserName(loginas);
		

        lp.setPassWord(Password);
     
        	
        logger.info("password entered");
    	
    		
			Thread.sleep(2000);
	
    	lp.clickSignIn();

		
	    Thread.sleep(2000);
		MainPages mp = new MainPages(driver);
		
    	mp.clickUnifocus();

        mp.getselect_List();

 	  
 	if(driver.getTitle().equalsIgnoreCase("singularity")) {
 		Assert.assertTrue(true);
 	}
 	else {
 		 try {
				captureScreen(driver,"mainTest");
			} catch (IOException e1) {
				e1.printStackTrace();
			}
 		Assert.assertTrue(false);
 	}
 	
 	


	
	}
	

	
	



}



