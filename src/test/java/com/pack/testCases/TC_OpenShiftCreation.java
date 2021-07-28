package com.pack.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pack.loginPages.AssignShift;
import com.pack.loginPages.EditShift;
import com.pack.loginPages.LoginPage;
import com.pack.loginPages.MainPages;
import com.pack.loginPages.OpenShiftCreation;

public class TC_OpenShiftCreation extends TC_BaseClass {
	@Test
	public void openShift() throws IOException, InterruptedException {
		 
			
		  	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    	
		    
		    	LoginPage lp=new LoginPage(driver);
		    	
		       //  lp.setPartnerCode(partnerCode);
		    	//lp.clickNext();
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
		  
		 
		/*    OpenShiftCreation shift=new OpenShiftCreation(driver);
			      logger.info("openshift");
			      shift.getFrame();
			      shift.clickStartTime();
			      shift.clickEndTime();
			     
			        shift.selectJob();
			        shift.selectJobCategory();
			       shift.selectShiftCategory();
			        shift.selectNoOfShits();
			        shift.clickAddShift();  
			        */
			   Thread.sleep(4000);     
			        EditShift editShift=new EditShift(driver);
			    	editShift.clickEditShift();
			    	editShift.clickStartTime();
			        editShift.clickEndTime();
			        editShift.selectJob();
			        editShift.selectJobCategory();
			        editShift.clickUpdateShift();
		    	Thread.sleep(2000);
		    	AssignShift assign=new AssignShift(driver);
		    	assign.selectFrame();
		        assign.clickAssignShift();
		        assign.clickshiftCategory(); 
		        assign.clickAssignEmployee();
		    	
		    	if(driver.getTitle().equalsIgnoreCase("singularity")) {
		    		Assert.assertTrue(true);
		    	}
		    	else {
		    		captureScreen(driver,"logintest");
		    		
		    		Assert.assertTrue(false);
		    	}
		    	
		    	


	

		    	
		    	
		    	
		    	
		    	
		    	
		    	
			
			
			

		  }
		 
		
	    	
	}
