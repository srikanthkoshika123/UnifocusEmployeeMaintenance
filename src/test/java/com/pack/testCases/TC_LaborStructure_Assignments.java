package com.pack.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.pack.loginPages.LaborStructure_Assignments;

public class TC_LaborStructure_Assignments extends TC_BaseClass {
	@Test()
	public void updateLaborStructure_Assignments() throws InterruptedException {
		  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		  LaborStructure_Assignments assignments = new LaborStructure_Assignments(driver);
		  assignments.clickUnifocus();
		  assignments.switchFrame();
		  assignments.selectPropertyDefault();
		  assignments.clickAdd();
		  assignments.doubleClick();
		  assignments.changeNameDivision();
		  assignments.doubleClickCode();
		  assignments.EditCode();
		  assignments.clickAddDepatment();
		  assignments.doubleClickDepatment();
		  assignments.changeNameDepartment();
		  assignments.doubleClickDepartmentCode();
		  assignments.EditDepartmentCode();
		  assignments.clickAddJob();
		  assignments.doubleClickJob();
		  assignments.changeNameJob();
		  assignments.doubleClickJobCode();
		  assignments.EditJobCode();
		  assignments.clickAddAssignment();
		  assignments.doubleClickAssignment();
		  assignments.changeNameAssignment();
		  assignments.doubleClickAssignmentCode();
		  assignments.EditAssignmentCode();
		  assignments.doubleClickAutoJob1();
		  assignments.clickExpandAutoJob1();
		  assignments.doubleClickAssignment2();
		  assignments.changeNameAssignment2();
		  assignments.doubleClickAssignmentCode2();
		  assignments.EditAssignmentCode2();
		  assignments.doubleClickAutoJob2();
		  assignments.doubleClickAssignment3();
		  assignments.changeNameAssignment3();
		  assignments.doubleClickAssignmentCode3();
		  assignments.EditAssignmentCode3();
		  
		  
		
	}

}
