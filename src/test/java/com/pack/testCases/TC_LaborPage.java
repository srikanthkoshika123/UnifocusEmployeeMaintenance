package com.pack.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.pack.loginPages.LaborPage;
import com.pack.loginPages.LoginPage;

import recordingTests.ScreenRecorderUtil;

public class TC_LaborPage extends TC_BaseClass  {
	@Test
	public void labor() throws  Exception {
		
		ScreenRecorderUtil.startRecord("Labor");
    	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    	LoginPage lp=new LoginPage(driver);
    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    	lp.setPartnerCode(partnerCode);
    	lp.clickNext();
	    logger.info("enter user name");
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
     	lp.setUserName(loginas);
     	logger.info("password entered");
        lp.setPassWord(Password);
		Thread.sleep(4000);
    	lp.clickSignIn();
    	logger.info("signin clicked");
    	Thread.sleep(2000);	
    	LaborPage labor=new LaborPage(driver);
    	/*labor.clickUnifocus();
    	labor.clickEnterActualEnvironments();
    	labor.clickEnterActualKBIs();
    	labor.clickEnterEmployeeProductivity();
    	labor.clickEnterActualHours();*/
    	labor.clickPlanning();
    	labor.clickForecastEnvironments();
    	labor.clickEnterPreWork();
    	labor.clickEnterInputKBIForecast();
    	//labor.clickViewEditRevenueCenterForecast();
    	//labor.clickManageSchedules();
    	//labor.clickEnterScheduledHours();
    	labor.clickReProjectLabor();
    	labor.clickScheduling();
    	labor.clickEmployeeRequests();
    	labor.clickShiftRequests();
    	labor.clickCallIns();
    	labor.clickAvailabilityRequests();
    	labor.clickTimeLineScheduling();
    	
}
}