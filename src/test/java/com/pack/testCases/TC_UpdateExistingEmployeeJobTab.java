package com.pack.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.pack.loginPages.EmployeeMaintenance;
import com.pack.loginPages.UpdateExistingEmployeeJobTab;

import recordingTests.ScreenRecorderUtil;

public class TC_UpdateExistingEmployeeJobTab extends TC_BaseClass{
	@Test()
	public void updateExistingEmployeeJobsTab() throws Exception {
	 ScreenRecorderUtil.startRecord("UpdateExistingEmployeeJobTab");
	 driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	 EmployeeMaintenance employeemaintenance=new EmployeeMaintenance(driver);
	employeemaintenance.clickUnifocus();
	employeemaintenance.getselect_List();
    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); 
    UpdateExistingEmployeeJobTab updateJobs=new UpdateExistingEmployeeJobTab(driver);
    updateJobs.switchFrame();
    updateJobs.clickdate();
    updateJobs.selectpayType();
    updateJobs.addNewEffectiveDate();
	}
}
