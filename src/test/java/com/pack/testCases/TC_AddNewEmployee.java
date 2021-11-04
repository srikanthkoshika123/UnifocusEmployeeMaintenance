package com.pack.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.pack.loginPages.AddNewEmployee;

import recordingTests.ScreenRecorderUtil;

public class TC_AddNewEmployee extends TC_BaseClass{
@Test
	public void addNewEmployee() throws  Exception {
		
	    
	    driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	    AddNewEmployee emp=new AddNewEmployee(driver);
	    Thread.sleep(8000);
	    emp.addNewemployee();
	    emp.selectWorkClass();
	    emp.selectJob();
	    emp.selectpayType();
	    emp.selectWorkingHours();
}
}