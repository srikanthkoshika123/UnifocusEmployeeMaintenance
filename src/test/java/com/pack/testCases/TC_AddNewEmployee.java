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
	/*@SuppressWarnings("deprecation")
	@BeforeMethod
	public void setup1() throws Exception {
	 ScreenRecorderUtil.startRecord("AddNewEmployee");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  LoginPage lp=new LoginPage(driver);
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  lp.setPartnerCode(partnerCode);
	  lp.clickNext();
	  logger.info("enter user name");
	  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	  	lp.setUserName(loginas);
	  	logger.info("password entered");
	  lp.setPassWord(Password);
	  Thread.sleep(4000);
	  lp.clickSignIn();
	  logger.info("signin clicked");
	  Thread.sleep(6000);
	   EmployeeMaintenance employeemaintenance=new EmployeeMaintenance(driver);
	   employeemaintenance.clickUnifocus();
	   employeemaintenance.getselect_List();
	}*/
    @Test(dataProvider="AddEmpData")
	public void addNewEmployee(String eid,String display,String first,String middle,String last,String Email,String hire,String sen,String wc,String tip,String job,String jobName,String jdate,String jrank,String edate,String payType,String hourly,String wch,String ch,String annual,String se,String sar,String piece) throws  Exception {
    driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
    AddNewEmployee emp=new AddNewEmployee(driver);
    emp.switchFrame();
    emp.addNewemployee(eid,display,first,middle,last,Email,hire,sen);
    emp.selectWorkClass(wc);
    emp.selectTipped(tip);
    emp.selectJob(job,jobName,jdate,jrank);
    emp.selectEffectiveDate(edate);
    emp.selectpayType(payType,hourly,wch,ch,annual,se,sar,piece);
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
   
	  

