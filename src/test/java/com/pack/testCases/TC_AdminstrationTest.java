package com.pack.testCases;

import org.testng.annotations.Test;

import com.pack.loginPages.AdminstrationTest;

import recordingTests.ScreenRecorderUtil;

public class TC_AdminstrationTest extends TC_BaseClass{
	@Test

	public void admin() throws Exception
	{
		ScreenRecorderUtil.startRecord("admin");
		AdminstrationTest adminstration=new AdminstrationTest(driver);
		adminstration.clickUnifocus();
		adminstration.audit();
		adminstration.employeeMaintenance();
		adminstration.myProcesses();
		
	}

}
