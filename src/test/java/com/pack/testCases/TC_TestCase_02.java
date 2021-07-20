package com.pack.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.pack.loginPages.LoginPage;
import com.pack.loginPages.MainPages;

public class TC_TestCase_02 extends TC_BaseClass{
    WebDriver driver;
	@Test
	public void mainTest() throws InterruptedException {
		
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
					captureScreen(driver,"maintest");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		MainPages mp = new MainPages(driver);
		
    	mp.clickUnifocus();

        mp.getselect_List();

 	   try {
				captureScreen(driver,"mainTest");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
 	

 	if(driver.getTitle().equalsIgnoreCase("singularity")) {
 		Assert.assertTrue(true);
 	}
 	else {
 		Assert.assertTrue(false);
 	}
 	
 	


	
	}
	

	
	



}



