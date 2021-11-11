package com.pack.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.pack.loginPages.LoginPage;
import com.pack.loginPages.TandAPage;

import recordingTests.ScreenRecorderUtil;

public class TC_TandAPage extends TC_BaseClass{
	@Test
	public void tANDa() throws  Exception {
		
		ScreenRecorderUtil.startRecord("TandA");
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	LoginPage lp=new LoginPage(driver);
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	lp.setPartnerCode(partnerCode);
    	lp.clickNext();
	    logger.info("enter user name");
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
     	lp.setUserName(loginas);
     	logger.info("password entered");
        lp.setPassWord(Password);
		Thread.sleep(4000);
    	lp.clickSignIn();
    	logger.info("signin clicked");
    	Thread.sleep(2000);	
	    TandAPage tANDa=new TandAPage(driver);
	    tANDa.cilckunifocus();
	    tANDa.getselectReviewPayPeriod();
}
}