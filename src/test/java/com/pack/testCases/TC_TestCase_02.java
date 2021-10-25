package com.pack.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pack.loginPages.LoginPage;
import com.pack.loginPages.MainPages;

import recordingTests.ScreenRecorderUtil;



public class TC_TestCase_02 extends TC_BaseClass{
    
	@Test
	public void mainTest() throws Exception {
		ScreenRecorderUtil.startRecord("maintest");
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

        captureScreen(driver,"mainTest");
 	
 	
 	
 	

	
	}
}



