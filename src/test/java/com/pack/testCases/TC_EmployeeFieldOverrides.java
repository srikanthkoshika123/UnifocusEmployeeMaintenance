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