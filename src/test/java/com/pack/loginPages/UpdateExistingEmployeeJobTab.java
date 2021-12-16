package com.pack.loginPages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pack.testCases.TC_BaseClass;


public class UpdateExistingEmployeeJobTab extends TC_BaseClass{
	WebDriver ldriver;
	public UpdateExistingEmployeeJobTab(WebDriver 	rdriver){
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);       	  		
	
}
	@FindBy(className="app-iframe")
	WebElement frame;
	//@FindBy(xpath="//span[normalize-space()='Jobs']")
	//WebElement jobs;
	@FindBy(xpath="//div[@class='JobsForRangeContent-module___jobButtonsContainer___1Je5x']//button[1]")
	WebElement addJob;
	@FindBy(xpath="//div[@title='Expand All']//button[@type='button']")
	WebElement expandAll;
	@FindBy(xpath="//div[@row-index='2']/div[1]/span[1]/span[4]/div[1]/div[1]/label[1]/span[1]/input[1]")
	WebElement selectEmployee;
	@FindBy(xpath="//div[@class='AddEditJobModal-module___payTypeSelect___3RptZ ant-select ant-select-enabled']")
	WebElement paytype;
	@FindBy(xpath="//input[@value='40.00']")
	WebElement weeklyContractHours;
	@FindBy(xpath="//input[@value='5.00']")
	WebElement contractDays;
	@FindBy(xpath="//label[@class='AddEditJobModal-module___wageCheckbox___TQnIf ant-checkbox-wrapper']//input[@type='checkbox']")
	WebElement ar;
	@FindBy(xpath="//button[@class='ant-btn ant-btn-primary']")
	WebElement clickOk;
	@FindBy(xpath="//button[@class='ant-btn action-button ant-btn-primary']")
	WebElement refresh;
	@FindBy(xpath="//div[@row-index='0']/div[@aria-colindex='1']")
	WebElement empName;
	@FindBy(xpath="//button[@class='ant-btn JobsTab-module___newRangeButton___38XMl']")
	WebElement addNewEffectiveDate;
	@FindBy(xpath="//div[@class='ant-modal-root']//span[1]//div[1]//*[name()='svg']")
	WebElement calender;
	@FindBy(xpath="//div[contains(text(),'12. Attache\\Attache\\Attache Agent')]")
	WebElement selectJob;
	@FindBy(xpath="//div[@class='JobsTab-module___mainContent___3D2Dq']//button[2]")
	WebElement editJob;
	@FindBy(xpath="//input[contains(@class,'ant-input input-field uf-input-field AddEditJobModal-module___wageField___5cszH')]")
	WebElement modifyRate;
	@FindBy(xpath="//button[contains(@class,'ant-btn ant-btn-primary')]")
	WebElement ok;
	@FindBy(xpath="//div[contains(@class,'JobsTab-module___mainContent___3D2Dq')]//button[3]")
	WebElement deletejob;
	@FindBy(xpath="")
	WebElement ba1;
	@FindBy(xpath="")
	WebElement ba;
	
	public void switchFrame() throws InterruptedException {
		driver.switchTo().frame(frame);
		}
   public void clickdate() throws InterruptedException {
	   WebDriverWait wait=new WebDriverWait(driver, 80);
		 WebElement searchEmp= wait.until(
		 ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@placeholder,'Name or EmpID')]")));
		Thread.sleep(8000);
		searchEmp.click();
		searchEmp.clear();
		searchEmp.sendKeys("234563");
		Thread.sleep(8000);
		empName.click();
	   WebDriverWait wait1=new WebDriverWait(driver, 80);
		WebElement jobs= wait1.until(
		ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Jobs']")));
	   Thread.sleep(6000);
	   jobs.click();
	   Thread.sleep(6000);
	   addJob.click();
	   Thread.sleep(6000);
	   expandAll.click();
	   Thread.sleep(6000);
	   selectEmployee.click();
   }
	   public void selectpayType() throws InterruptedException {
			paytype.click();
			 List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@class='ant-select-dropdown-menu  ant-select-dropdown-menu-root ant-select-dropdown-menu-vertical']/li"));
		     
		     for(int i = 0; i<=allOptions.size()-1; i++) {
		         if(allOptions.get(i).getText().contains("Salaried Non Exempt")) { 
		             allOptions.get(i).click();
		             break;     
		         }
		     }
		    
	        	 weeklyContractHours.sendKeys(Keys.CONTROL+ "a");
	     		weeklyContractHours.sendKeys(Keys.DELETE,"30");
	     		contractDays.sendKeys(Keys.CONTROL+ "a");
	     		contractDays.sendKeys(Keys.DELETE,"6");
	     		 ar.click();
	     		WebElement aRate=driver.findElement(By.xpath("//body//div//div[@class='AddEditJobModal-module___initialWageContent___IWN61']//div//div//div[1]//input[1]"));
	     		aRate.sendKeys(Keys.CONTROL+ "a");
	     		aRate.sendKeys(Keys.DELETE,"4570");
	     		 Thread.sleep(5000);
	     		clickOk.click();
	     		driver.switchTo().defaultContent();
	     		Thread.sleep(5000);
	     		refresh.click();
	         }
			
	   public void addNewEffectiveDate() throws InterruptedException {
		driver.switchTo().frame(frame);
		WebDriverWait wait=new WebDriverWait(driver, 80);
		 WebElement searchEmp= wait.until(
		 ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@placeholder,'Name or EmpID')]")));
		Thread.sleep(8000);
		searchEmp.click();
		searchEmp.clear();
		searchEmp.sendKeys("234563");
		Thread.sleep(8000);
		empName.click();
		 WebDriverWait wait1=new WebDriverWait(driver, 80);
		WebElement jobs= wait1.until(
		ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Jobs']")));
	    Thread.sleep(6000);
		jobs.click();
		Thread.sleep(8000);
	   addNewEffectiveDate.click();
	   WebElement date=driver.findElement(By.xpath("//div[contains(@class,'ant-modal-body')]//div//input[contains(@type,'text')]"));
	   date.sendKeys(Keys.CONTROL+ "a");
	   date.sendKeys(Keys.DELETE);
	   date.sendKeys("12/17/2021");
	   WebElement create=driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary']"));
	   Thread.sleep(6000);
	   create.click();
	   WebElement selectJobs=driver.findElement(By.xpath("(//div[@row-index='1']/div[3]/div/div/div)[1]"));
	   Thread.sleep(8000);
	   selectJobs.click();
	   Thread.sleep(6000);
	   editJob.click();
	   Thread.sleep(6000);
	   //modifyRate.sendKeys("35");
	   ok.click();
	   Thread.sleep(6000);
	   WebDriverWait wait2=new WebDriverWait(driver, 80);
		WebElement deletejob=wait2.until(
		ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class,'JobsTab-module___mainContent___3D2Dq')]//button[3]")));
		Thread.sleep(6000);
	   deletejob.click(); 
	   WebElement yes=driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary']"));
	   Thread.sleep(8000);
	   yes.click();
   }
}
