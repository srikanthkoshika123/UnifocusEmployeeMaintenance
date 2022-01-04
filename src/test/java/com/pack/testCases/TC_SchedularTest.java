package com.pack.testCases;

import org.testng.annotations.Test;

import com.pack.loginPages.SchedularTest;

public class TC_SchedularTest extends TC_BaseClass{
	 @Test
		public void schedularTest() throws  Exception {
		 //ScreenRecorderUtil.startRecord("HomePage");
		 SchedularTest schedularTest=new SchedularTest(driver);
		 schedularTest.clickUnifocus();
		 schedularTest.retryingFindClick();
		 schedularTest.selectDateRange();
	 }
}
