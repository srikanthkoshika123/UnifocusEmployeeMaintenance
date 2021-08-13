package com.pack.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pack.loginPages.OpenShiftCreationDay1Shift1;

public class OpenShift extends TC_BaseClass{
	@Test
	public void openShift() throws IOException {
		 
		 OpenShiftCreationDay1Shift1 shift=new OpenShiftCreationDay1Shift1(driver);
		 	   
		 		   
		 	   
		 	if(driver.getTitle().equalsIgnoreCase("singularity")) {
		 		Assert.assertTrue(true);
		 	}
		 	
		 	else {
		 		captureScreen(driver,"mainTest");
				
		 		Assert.assertTrue(false);
		 	}
		
	}

}
