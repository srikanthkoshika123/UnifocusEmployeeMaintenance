package com.pack.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.pack.loginPages.AddNewEmployee;

import recordingTests.ScreenRecorderUtil;

public class TC_AddNewEmployee extends TC_BaseClass{
@Test
	public void addNewEmployee() throws  Exception {
		
	    ScreenRecorderUtil.startRecord("AddEmployee");
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    AddNewEmployee emp=new AddNewEmployee(driver);
	    Thread.sleep(8000);
	    emp.addNewemployee();
	   // emp.displayName();
	   // emp.getValues();
}}