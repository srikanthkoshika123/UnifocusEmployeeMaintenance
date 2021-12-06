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
	    tANDa.clickReviewPayPeriod();
	    tANDa.approveShifts();
	    tANDa.clickWhoIsInOut();
	    tANDa.viewAsOf();
	    tANDa.clickAttendancePointsandEvents();
	    tANDa.viewSelectAll();
	    tANDa.clickBenefits();
	    tANDa.viewEmployees();
	    tANDa.clickEnterEarnings();
	    tANDa.viewBulkEarnings();
	    tANDa.clickHolidayPay();
	    tANDa.viewApplyEarnings();
	    tANDa.clickPunchImageReview();
	    tANDa.viewNames();
	   // tANDa.clickApproveEarnings();
	   // tANDa.viewApproveAllEarnings();
}
}