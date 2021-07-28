package com.pack.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pack.loginPages.OpenShiftCreation;

public class OpenShift extends TC_BaseClass{
	@Test
	public void openShift() throws IOException {
		 
		 OpenShiftCreation shift=new OpenShiftCreation(driver);
		 	   
		 		   
		 	   
		 	if(driver.getTitle().equalsIgnoreCase("singularity")) {
		 		Assert.assertTrue(true);
		 	}
		 	
		 	else {
		 		captureScreen(driver,"mainTest");
				
		 		Assert.assertTrue(false);
		 	}
		
	}

}
