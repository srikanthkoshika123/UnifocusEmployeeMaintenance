package com.pack.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.pack.loginPages.LoginPage;
import com.pack.loginPages.TandAPage;

import recordingTests.ScreenRecorderUtil;

public class TC_TandAPage extends TC_BaseClass{
	@Test
	public void tANDa() throws  Exception {
		
		ScreenRecorderUtil.startRecord("TandA");
	    TandAPage tANDa=new TandAPage(driver);
	    tANDa.clickUnifocus();
	    tANDa.clickReviewPayPeriod();
	    tANDa.approveShifts();
	    tANDa.whoIsInOut();
	    tANDa.clickAttendancePointsandEvents();
	    tANDa.clickBenefits();
	    tANDa.clickEnterEarnings();
	    tANDa.clickHolidayPay();
	    tANDa.clickPunchImageReview();
	    tANDa.clickApproveEarnings();
	   
}
}