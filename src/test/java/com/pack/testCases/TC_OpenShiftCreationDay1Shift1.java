package com.pack.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pack.loginPages.LoginPage;
import com.pack.loginPages.MainPages;
import com.pack.loginPages.OpenShiftCreationDay1Shift1;

public class TC_OpenShiftCreationDay1Shift1 extends TC_BaseClass {
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
		  
		 
		    OpenShiftCreationDay1Shift1 shift=new OpenShiftCreationDay1Shift1(driver);
			      logger.info("openshift");
			      shift.getFrame();
			      Assert.assertTrue(true, "openshift successful.");

			      shift.clickStartTime();
			      shift.clickEndTime();
			     
			        shift.selectJob();
			        shift.selectJobCategory();
			       shift.selectShiftCategory();
			        shift.selectNoOfShits();
			        shift.clickAddShift();
			        shift.getTooltip();
			        
			        	
		    	if(driver.getTitle().equalsIgnoreCase("singularity")) {
		    		Assert.assertTrue(true);
		    	}
		    	else {
		    		captureScreen(driver,"openShifttest");
		    		
		    		Assert.assertTrue(false);
		    	}
		  }    	
	}
