package com.pack.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.pack.loginPages.EmployeeFieldOverrides;
import com.pack.loginPages.EmployeeMaintenance;
import com.pack.loginPages.LoginPage;

import recordingTests.ScreenRecorderUtil;

public class TC_EmployeeFieldOverrides extends TC_BaseClass{
	 @Test
		public void employeeFieldOverrides() throws  Exception {
	    ScreenRecorderUtil.startRecord("EmployeeFieldOverrides");
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
	    	Thread.sleep(6000);
	    	EmployeeMaintenance employeemaintenance=new EmployeeMaintenance(driver);
			employeemaintenance.clickUnifocus();
			EmployeeFieldOverrides efo=new EmployeeFieldOverrides(driver);
			efo.clickEmployeeFieldOverrides();
			efo.switchToFrame();
			efo.checkEmailAdderss();
			efo.checkTipped();
			efo.checkHoursAvaliable();
}
}