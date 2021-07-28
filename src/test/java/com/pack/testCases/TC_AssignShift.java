package com.pack.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.pack.loginPages.AssignShift;

public class TC_AssignShift extends TC_BaseClass{
	@Test
	public void assignShift() throws IOException, InterruptedException {
		
	AssignShift assign=new AssignShift(driver);
	assign.selectFrame();
    assign.clickAssignShift();
    assign.clickshiftCategory();
    assign.clickAssignEmployee();
}
}