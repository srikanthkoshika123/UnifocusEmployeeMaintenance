package com.pack.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pack.loginPages.EmployeeMaintenance;
import com.pack.loginPages.UpdateExistingEmployee;
import com.pack.utils.XLUtils;

import recordingTests.ScreenRecorderUtil;

public class TC_UpdateExistingEmployee extends TC_BaseClass {
	 @Test()
		public void updateExistingEmployee() throws Exception {
		 ScreenRecorderUtil.startRecord("UpdateExistingEmployee");
		 driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		 EmployeeMaintenance employeemaintenance=new EmployeeMaintenance(driver);
		employeemaintenance.clickUnifocus();
		employeemaintenance.getselect_List();
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    UpdateExistingEmployee updateEmp=new UpdateExistingEmployee(driver);
	    updateEmp.switchFrame();
	    updateEmp.UpdateEmployee();
	    }
	   
	   
	    }


