package com.pack.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.pack.loginPages.EmployeeMaintenance;
import com.pack.loginPages.UpdateSchedulingTab;

import recordingTests.ScreenRecorderUtil;

public class TC_UpdateSchedulingTab extends TC_BaseClass{
	@Test()
	public void updateSchedulingTab() throws Exception {
		ScreenRecorderUtil.startRecord("UpdateSchedulingTab");
		 driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		 EmployeeMaintenance employeemaintenance=new EmployeeMaintenance(driver);
		employeemaintenance.clickUnifocus();
		employeemaintenance.getselect_List();
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    UpdateSchedulingTab scheduling=new UpdateSchedulingTab(driver);
	    scheduling.switchFrame();
	    scheduling.selectEmployee();
	    scheduling.selectEmployeeType();
	    scheduling.selectShiftTime();
	    scheduling.selectCheckBoxs();
	    scheduling.doubleClick();
	    scheduling.clickEmptyCell();
	    scheduling.rightClick();
	    scheduling.clickAddShift();
	    scheduling.selectCheckBoxes();
	    scheduling.clickEdit();
	    scheduling.clickDelete();
	    
	}

}
