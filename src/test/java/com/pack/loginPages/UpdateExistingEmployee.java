package com.pack.loginPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pack.testCases.TC_BaseClass;

public class UpdateExistingEmployee extends TC_BaseClass{
	WebDriver ldriver;
	public UpdateExistingEmployee(WebDriver 	rdriver){
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);       	  		
	
}
	@FindBy(className="app-iframe")
	WebElement frame;
	@FindBy(xpath="//div[@row-index='0']/div[@aria-colindex='1']")
	WebElement empName;
	@FindBy(xpath="//form[2]/div[1]/div[2]/div[1]/div[6]/div[1]/div[text()='Additional Fields']")
	WebElement additionalFields;
	@FindBy(xpath="//div[7]/div[2]/div[1]/div[2]/div[1]/span[1]/input[1]")
	WebElement adderss;
	//@FindBy(xpath="(//input[@class='ant-input input-field uf-input-field text-input-field '])[17]")
	//WebElement city;
	@FindBy(xpath="//div[@id='STATE']")
	WebElement state;
	@FindBy(xpath="//form[2]/div/div[2]/div/div[7]/div[6]/div/div[2]/div/span[1]/input[1]")
	WebElement zipCode;
	@FindBy(xpath="//form[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/span[1]/input[1]")
	WebElement displayName;
	@FindBy(xpath="//input[contains(@placeholder,'Name or EmpID')]")
    WebElement searchEmployee;
	@FindBy(xpath="//div[@class='EmployeeSidebar-module___employeeSidebarTableCell___hpZDq']")
    WebElement updatedEmp;
	@FindBy(xpath="//span[normalize-space()='Status']")
    WebElement status;
	@FindBy(xpath="//button[@class='ant-btn EmployeeStatusTimeline-module___EmploymentStatusTimelineAddStatusButton___2yfRd']")
    WebElement addButton;
	@FindBy(xpath="//span[normalize-space()='Terminated']")
    WebElement terminated;
	@FindBy(xpath="//div[contains(@class,'ant-col ant-form-item-control-wrapper')]/div/span/span/input")
    WebElement effectiveDate;
	@FindBy(xpath="//button[contains(@class,'ant-btn ant-btn-primary')]")
    WebElement addStatus;
	@FindBy(xpath="//button[@class='ant-btn EmployeeSidebar-module___filterButton___2_Aus ant-btn-primary ant-btn-circle ant-btn-icon-only']")
    WebElement expandFilter;
	@FindBy(xpath="//div[@class='EmployeeSidebar-module___filterSelect___1xYYQ ant-select ant-select-enabled']//div[@class='ant-select-selection__rendered']")
    WebElement employeeSet;
	@FindBy(xpath="//li[normalize-space()='Inactive']")
    WebElement inactive;
	@FindBy(xpath="//button[@class='ant-btn EmployeeStatusTimeline-module___EmploymentStatusTimelineDeleteStatusButton___3Adkn ant-btn-primary ant-btn-sm']")
    WebElement deleteEmp;
	@FindBy(xpath="//button[contains(@class,'ant-btn ant-btn-primary ant-btn-sm')]")
    WebElement delete;
	@FindBy(xpath="//li[normalize-space()='Active']")
    WebElement active;
	
	
	public void switchFrame() throws InterruptedException {
		driver.switchTo().frame(frame);
		}
	public void UpdateEmployee(String empId,String Address,String City,String State,String Zipcode,String dName) throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, 80);
		 WebElement searchEmp= wait.until(
		 ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@placeholder,'Name or EmpID')]")));
		Thread.sleep(8000);
		searchEmp.click();
		searchEmp.clear();
		searchEmp.sendKeys(empId);
		Thread.sleep(8000);
		empName.click();
		Thread.sleep(6000);
		additionalFields.click();
		adderss.sendKeys(Address);
		WebDriverWait wait1=new WebDriverWait(driver, 80);
		 WebElement city= wait1.until(
		 ExpectedConditions.elementToBeClickable(By.xpath("(//input[@class='ant-input input-field uf-input-field text-input-field '])[17]")));
		 city.click();
		 city.clear();
		city.sendKeys(City);
		Thread.sleep(6000);
		state.click();
	 List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@class='ant-select-dropdown-menu  ant-select-dropdown-menu-root ant-select-dropdown-menu-vertical']/li"));
          
		     for(int i = 0; i<=allOptions.size()-1; i++) {
		         if(allOptions.get(i).getText().contains(State)) { 
		             allOptions.get(i).click();
		             break;
		              
		         }
		     }
		zipCode.sendKeys(Zipcode);
		displayName.sendKeys(Keys.CONTROL+ "a");
		displayName.sendKeys(Keys.DELETE);
		displayName.sendKeys(dName);
		Thread.sleep(6000);
		updatedEmp.click();	
	}
	public void clickStatus(String effectivedate) throws InterruptedException {
		Thread.sleep(6000);
		status.click();
		Thread.sleep(6000);
		addButton.click();
		Thread.sleep(6000);
		terminated.click();
		Thread.sleep(6000);
		effectiveDate.sendKeys(Keys.CONTROL+ "a");
		effectiveDate.sendKeys(Keys.DELETE);
		effectiveDate.sendKeys(effectivedate);
		Thread.sleep(6000);
		addStatus.click();
		Thread.sleep(6000);
		expandFilter.click();
		Thread.sleep(6000);
		employeeSet.click();
		Thread.sleep(6000);
		inactive.click();
		Thread.sleep(6000);
		status.click();
		Thread.sleep(6000);
		deleteEmp.click();
		Thread.sleep(6000);
		delete.click();
		Thread.sleep(6000);
		employeeSet.click();
		Thread.sleep(6000);
		active.click();
		Thread.sleep(6000);
		status.click();
	}

}
