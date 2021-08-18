package com.pack.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.pack.loginPages.AssignShiftDay4Shift1;
import com.pack.loginPages.EditShiftDay4Shift1;
import com.pack.loginPages.LoginPage;
import com.pack.loginPages.MainPages;

public class TC_AssignShiftDay4Shift1 extends TC_BaseClass{
	@Test
	public void assignShift() throws IOException, InterruptedException {
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
   	EditShiftDay4Shift1 editShift=new EditShiftDay4Shift1(driver);
   	editShift.clickEditShift();
   	editShift.clickStartTime();
    editShift.clickEndTime();
    editShift.selectJob();
    editShift.selectJobCategory();
    editShift.clickUpdateShift();
       
     Thread.sleep(4000);	
	AssignShiftDay4Shift1 assign=new AssignShiftDay4Shift1(driver);
	assign.selectFrame();
    assign.clickAssignShift();
    assign.clickAssignEmployee();
}
}
