package com.pack.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.pack.loginPages.AssignShiftDay5Shift2;
import com.pack.loginPages.EditShiftDay5Shift2;
import com.pack.loginPages.LoginPage;
import com.pack.loginPages.MainPages;

public class TC_AssignShiftDay5Shift2 extends TC_BaseClass{
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
   	EditShiftDay5Shift2 editShift=new EditShiftDay5Shift2(driver);
   	editShift.clickEditShift();
   	editShift.clickStartTime();
    editShift.clickEndTime();
    editShift.selectJob();
    editShift.selectJobCategory();
    editShift.clickUpdateShift();
       
     Thread.sleep(4000);	
	AssignShiftDay5Shift2 assign=new AssignShiftDay5Shift2(driver);
	assign.selectFrame();
    assign.clickAssignShift();
    assign.clickAssignEmployee();
}
}
