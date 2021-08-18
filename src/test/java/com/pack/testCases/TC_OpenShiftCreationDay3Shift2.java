package com.pack.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pack.loginPages.LoginPage;
import com.pack.loginPages.MainPages;
import com.pack.loginPages.OpenShiftCreationDay3Shift2;

public class TC_OpenShiftCreationDay3Shift2 extends TC_BaseClass {
	@Test
	public void openShift() throws IOException, InterruptedException {
		 
			
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
		  
		 
		    OpenShiftCreationDay3Shift2 shift=new OpenShiftCreationDay3Shift2(driver);
			      logger.info("openshift");
			      shift.getFrame();
			      shift.clickStartTime();
			      shift.clickEndTime();
			     
			        shift.selectJob();
			        shift.selectJobCategory();
			       shift.selectShiftCategory();
			        shift.selectNoOfShits();
			        shift.clickAddShift();  
			        	
		    	if(driver.getTitle().equalsIgnoreCase("singularity")) {
		    		Assert.assertTrue(true);
		    	}
		    	else {
		    		captureScreen(driver,"openShifttest");
		    		
		    		Assert.assertTrue(false);
		    	}
		  }    	
	}
