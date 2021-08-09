package com.pack.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.pack.loginPages.DeleteAllShifts;
import com.pack.loginPages.LoginPage;
import com.pack.loginPages.MainPages;

public class TC_DeleteAllShifts extends TC_BaseClass {
	@Test
	public void deleteAllShift() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	
	    
    	LoginPage lp=new LoginPage(driver);
    	
      
    	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    	
	    logger.info("enter user name");
     	lp.setUserName(loginas);
		

        lp.setPassWord(Password);
     
        	
        logger.info("password entered");
    	
    		
			Thread.sleep(2000);
	
    	lp.clickSignIn();
    	

	    Thread.sleep(2000);
		MainPages mp = new MainPages(driver);
		
    	mp.clickUnifocus();
       Thread.sleep(2000);
        mp.getselect_List();
        Thread.sleep(20000);
        DeleteAllShifts deleteAll=new DeleteAllShifts(driver);
        deleteAll.iFrames();
        deleteAll.deleteAllShift();
        
	}    
	

}
