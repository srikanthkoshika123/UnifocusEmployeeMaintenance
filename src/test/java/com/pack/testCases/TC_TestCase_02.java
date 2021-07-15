package com.pack.testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pack.loginPages.MainPages;

public class TC_TestCase_02 extends TC_BaseClass{
    WebDriver driver;
	@Test
	public void mainTest() {
	
	MainPages mp=new MainPages(driver);
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      mp.clickUnifocus();
	  mp.getselect_List();
   
	

	if(driver.getTitle().equalsIgnoreCase("singularity")) {
		Assert.assertTrue(true);
	}
	else {
		Assert.assertTrue(false);
	}
	
	
	
	
	}
	

	
	



}



