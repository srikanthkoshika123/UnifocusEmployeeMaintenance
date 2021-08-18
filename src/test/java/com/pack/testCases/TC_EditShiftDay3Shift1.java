package com.pack.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.pack.loginPages.EditShiftDay3Shift1;
import com.pack.loginPages.LoginPage;
import com.pack.loginPages.MainPages;

public class TC_EditShiftDay3Shift1 extends TC_BaseClass {
	@Test
	public void editShift() throws IOException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	
	    
    	LoginPage lp=new LoginPage(driver);
    	
    	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    	
	    logger.info("enter user name");
     	lp.setUserName(loginas);
		

        lp.setPassWord(Password);
     
        	
        logger.info("password entered");
    	
    		
			Thread.sleep(2000);
	
    	lp.clickSignIn();
    	
    	Thread.sleep(6000);
    	MainPages mp = new MainPages(driver);
		
	       mp.clickUnifocus();


       mp.getselect_List();
   
     Thread.sleep(4000);

	EditShiftDay3Shift1 editShift=new EditShiftDay3Shift1(driver);
	editShift.clickEditShift();
	editShift.clickStartTime();
    editShift.clickEndTime();
    editShift.selectJob();
    editShift.selectJobCategory();
    editShift.clickUpdateShift();
}
}