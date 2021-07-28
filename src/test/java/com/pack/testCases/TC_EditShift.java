package com.pack.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.pack.loginPages.EditShift;

public class TC_EditShift extends TC_BaseClass {
	@Test
	public void editShift() throws IOException, InterruptedException {
		 
	EditShift editShift=new EditShift(driver);
	editShift.clickEditShift();
	editShift.clickStartTime();
    editShift.clickEndTime();
    editShift.selectJob();
    editShift.selectJobCategory();
    editShift.clickUpdateShift();
}
}