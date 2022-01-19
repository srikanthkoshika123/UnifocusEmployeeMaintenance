package com.pack.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pack.loginPages.EmployeeMaintenance;
import com.pack.loginPages.UpdateEmployeeAvailability;
import com.pack.utils.XLUtils;

import recordingTests.ScreenRecorderUtil;

public class TC_UpdateEmployeeAvailability extends TC_BaseClass{
	@Test(dataProvider="EmployeeAvailability")
	public void updateSchedulingTab(String empId,String starttime,String endtime,String day1,String day2,String emptycellDay,String starttime1,String endtime1,String rightDay,String editStart,String editEnd,String day3,String starttime2,String endtime2,String filterJob,String empName,String empId1,String starttime3,String endtime3,String day5,String day6,String day7,String day8,String editDay,String starttime4,String endtime4,String deleteDay1,String deleteDay2) throws Exception {
		ScreenRecorderUtil.startRecord("EmployeeAvailability");
		 driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		 EmployeeMaintenance employeemaintenance=new EmployeeMaintenance(driver);
		employeemaintenance.clickUnifocus();
		employeemaintenance.getselect_List();
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    UpdateEmployeeAvailability availability = new UpdateEmployeeAvailability(driver);
	    availability.switchFrame();
	    availability.selectEmployee(empId);
	    availability.selectEmployeeType();
	    availability.selectShiftTime(starttime,endtime);
	    availability.selectCheckBoxs(day1,day2);
	    availability.doubleClick(emptycellDay);
	    availability.clickEmptyCell(starttime1,endtime1);
	    availability.rightClick(rightDay);
	    availability.clickAddShift(editStart,editEnd);
	    availability.doubleClick1(day3);
	    availability.clickEmptyCell1(starttime2,endtime2);
	    availability.clickUnifocus();
	    availability.retryingFindClick();
	    availability.selectDateRange(filterJob,empName);
		employeemaintenance.clickUnifocus();
		employeemaintenance.getselect_List();
	    availability.selectEmployee1(empId1);
	    availability.selectCheckBoxs1(starttime3,endtime3,day5,day6,day7,day8);
	    availability.clickDayShift(editDay);
	    availability.clickEdit(starttime4, endtime4);
	    availability.clickShiftDay(deleteDay1);
	    availability.clickDeleteSelectedShifts();
	    availability.clickDeleteShift(deleteDay2);
	    availability.clickDelete();
	    availability.clickDeleteAllShifts();
}
	 @DataProvider(name="EmployeeAvailability")
	   String [][] getData() throws IOException
	   {
		String path=System.getProperty("user.dir")+"/src/test/java/com/pack/testData/EmployeeAvailability.xlsx";
		
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path,"Sheet1",1);
		
		String empdata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				empdata[i-1][j]=XLUtils.getCellData(path,"Sheet1", i,j);
		}
				
		}
	   return empdata;

	}
	}