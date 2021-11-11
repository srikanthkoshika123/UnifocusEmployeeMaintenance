package com.pack.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pack.loginPages.AddNewEmployee;
import com.pack.loginPages.EmployeeMaintenance;
import com.pack.loginPages.LoginPage;
import com.pack.utils.XLUtils;

import recordingTests.ScreenRecorderUtil;

public class TC_AddNewEmployee extends TC_BaseClass{
	
	
    @Test(dataProvider="AddEmpData")
	public void addNewEmployee(String eid,String display,String first,String middle,String last,String hire,String sen,String opt,String job,String jobName,String jdate,String jrank,String edate,String payType) throws  Exception {
    driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
    AddNewEmployee emp=new AddNewEmployee(driver);
    emp.switchFrame();
    emp.addNewemployee(eid,display,first,middle,last,hire,sen);
    emp.selectWorkClass(opt);
   // emp.selectTipped(tip);
    emp.selectJob(job,jobName,jdate,jrank);
    emp.selectEffectiveDate(edate);
    emp.selectpayType(payType);
    emp.selectWorkingHours();
    }
   
    @DataProvider(name="AddEmpData")
    String [][] getData() throws IOException
    {
	String path=System.getProperty("user.dir")+"/src/test/java/com/pack/testData/AddEmployee.xlsx";
	
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
   
	  

