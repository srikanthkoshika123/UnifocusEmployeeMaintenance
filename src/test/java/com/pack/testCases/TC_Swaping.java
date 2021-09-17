package com.pack.testCases;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.pack.loginPages.LoginPage;
import com.pack.loginPages.MainPages;
import com.pack.loginPages.Swaping;

public class TC_Swaping extends TC_BaseClass{
	@Test
	public void Swaping() throws InterruptedException, AWTException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		LoginPage lp=new LoginPage(driver);
    	
	      
    	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    	
	    logger.info("enter user name");
     	lp.setUserName(loginas);
		

        lp.setPassWord(Password);
     
        	
        logger.info("password entered");
    	
    		
       Thread.sleep(2000);
    	lp.clickSignIn();
    	
    	Thread.sleep(20000);	
		MainPages mp = new MainPages(driver);
		
    	mp.clickUnifocus();
       Thread.sleep(2000);
        mp.getselect_List();
        
	    Thread.sleep(80000);
    	Swaping swap=new Swaping(driver);
    	swap.iframe();
    	swap.swap();
    	
	}
}
