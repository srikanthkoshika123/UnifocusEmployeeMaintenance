package com.pack.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.pack.loginPages.DeleteShift;
import com.pack.loginPages.EditShiftDay1Shift1;
import com.pack.loginPages.LoginPage;
import com.pack.loginPages.MainPages;

public class TC_DeleteShift extends TC_BaseClass{
	@Test
	public void deleteShift() throws InterruptedException {
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

        mp.getselect_List();
       
        Thread.sleep(4000);

    	EditShiftDay1Shift1 editShift=new EditShiftDay1Shift1(driver);
    	editShift.clickEditShift();
    	editShift.clickStartTime();
        editShift.clickEndTime();
        editShift.selectJob();
        editShift.selectJobCategory();
        editShift.clickUpdateShift();

        Thread.sleep(2000);
		
		DeleteShift deleteshift=new DeleteShift(driver);
		
		deleteshift.deleteShift();
}

}
