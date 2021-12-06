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
    	LaborPage labor=new LaborPage(driver);
    	/*labor.clickUnifocus();
    	labor.clickEnterActualEnvironments();
    	labor.clickEnterActualKBIs();
    	labor.clickEnterEmployeeProductivity();
    	labor.clickEnterActualHours();
    	labor.clickPlanning();
    	labor.clickForecastEnvironments();
    	labor.clickEnterPreWork();
    	labor.clickEnterInputKBIForecast();
    	labor.clickViewEditRevenueCenterForecast();
    	labor.clickManageSchedules();
    	labor.clickEnterScheduledHours();*/
    	labor.clickReProjectLabor();
    	labor.clickScheduling();
    	labor.clickEmployeeRequests();
    	labor.clickShiftRequests();
    	labor.clickCallIns();
    	labor.clickAvailabilityRequests();
    	labor.clickTimeLineScheduling();
    	
}
}