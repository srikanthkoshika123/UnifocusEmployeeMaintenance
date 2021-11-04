package com.pack.loginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pack.testCases.TC_BaseClass;

public class AddNewEmployee extends TC_BaseClass{
	WebDriver ldriver;
	public AddNewEmployee(WebDriver 	rdriver){
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);       	  		
	
}
	@FindBy(className="app-iframe")
	WebElement frame;
	@FindBy(xpath="//body//div//div[@class='ant-modal-body']//div//div//div//div[1]//div[1]//div[2]//div[1]//span[1]//input[1]")
    WebElement Empid;
	@FindBy(xpath="//div[@class='ant-modal-body']//div//div//div//div[2]//div[1]//div[2]//div[1]//span[1]//input[1]")
	WebElement DisplayName;
	@FindBy(xpath="//div[@class='ant-modal-body']//div//div//div//div[3]//div[1]//div[2]//div[1]//span[1]//input[1]")
	WebElement FirstName;
	@FindBy(xpath="//div[@class='ant-modal-body']//div//div//div//div[4]//div[1]//div[2]//div[1]//span[1]//input[1]")
	WebElement middleName;
	@FindBy(xpath="//div[@class='ant-modal-body']//div//div//div//div[5]//div[1]//div[2]//div[1]//span[1]//input[1]")
	WebElement lastName;
	@FindBy(xpath="//div[@class='ant-modal-body']//div//div//div//div[6]//div[1]//div[2]//div[1]//span//span//input[1]")
	WebElement hireDate;
	@FindBy(xpath="//div[@class='ant-modal-body']//div//div//div//div[7]//div[1]//div[2]//div[1]//span//span//input[1]")
	WebElement seniority;
	@FindBy(xpath="//div[@class='ant-modal-body']//div//div//div//div[8]//div[1]//div[2]//div[1]//span[1]//div//div//div")
	WebElement workClass;
	@FindBy(xpath="//li[text()='EXE']")
	WebElement workType;
	@FindBy(xpath="//button[@class='ant-btn ant-btn-primary']")
	WebElement next;
	@FindBy(xpath="//div[@title='Expand All']//button")
	WebElement selectjob;
	@FindBy(xpath="//div[contains(@class,'AddEditJobModal-module___jobField___17X0F')]//input")
	WebElement jobdate;
	@FindBy(xpath="//input[@class='ant-input input-field uf-input-field AddEditJobModal-module___jobField___17X0F']")
	WebElement jobrank;
	@FindBy(xpath="//div[@class='AddEditJobModal-module___payTypeSelect___3RptZ ant-select ant-select-enabled']")
	WebElement paytype;
	@FindBy(xpath="//li[text()='Salaried Non Exempt']")
	WebElement pay;
	@FindBy(xpath="//input[@value='40.00']")
	WebElement weeklyContractHours;
	@FindBy(xpath="//input[@value='5.00']")
	WebElement contractDays;
	@FindBy(xpath="//label[@class='AddEditJobModal-module___wageCheckbox___TQnIf ant-checkbox-wrapper']//input[@type='checkbox']")
	WebElement ar;
	@FindBy(xpath="//body//div//div[@class='AddEditJobModal-module___initialWageContent___IWN61']//div//div//div[1]//input[1]")
	WebElement hr;
	@FindBy(xpath="//button[@class='ant-btn ant-btn-primary']")
	WebElement save;
	
	public void addNewemployee() throws InterruptedException {
	driver.switchTo().frame(frame);
	WebElement addnew = driver.findElement(By.xpath("//button[normalize-space()='Add New']"));
	Thread.sleep(4000);
	addnew.click();
	Empid.sendKeys("003589");
	DisplayName.sendKeys("vishal,narvate");
	FirstName.sendKeys("vishal");
	middleName.sendKeys("patil");
	lastName.sendKeys("narvate");
	hireDate.sendKeys("10/16/2021");
	seniority.sendKeys("11/1/2021");
	}
	public void selectWorkClass() throws InterruptedException {
	Thread.sleep(2000);
	workClass.click();
	workType.click();
	next.click();
	}
	public void selectJob() throws InterruptedException {
	Thread.sleep(4000);
	selectjob.click();
	WebElement Type =driver.findElement(By.xpath("//label[@class='uf-tree-selector-tree-item-single-select-cell-renderer__selection ant-radio-wrapper']//input"));
	Thread.sleep(4000);
	Type.click();
	jobdate.sendKeys(Keys.CONTROL+ "a");
	jobdate.sendKeys(Keys.DELETE);
	jobdate.sendKeys("11/8/2021");
	jobrank.sendKeys(Keys.CONTROL+ "a");
	jobrank.sendKeys(Keys.DELETE);
	jobrank.sendKeys("4");
		
	}
	public void selectpayType() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement effectivedate = wait.until(
		ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='input-field uf-input-field AddEditJobModal-module___wageField___5cszH ant-input-affix-wrapper']/input")));
		effectivedate.sendKeys(Keys.CONTROL+ "a");
		effectivedate.sendKeys(Keys.DELETE);
		effectivedate.sendKeys("11/14/2021");
		paytype.click();
		pay.click();
		}	
	public void selectWorkingHours() throws InterruptedException {
		weeklyContractHours.sendKeys(Keys.CONTROL+ "a");
		weeklyContractHours.sendKeys(Keys.DELETE,"35.00");
		contractDays.sendKeys(Keys.CONTROL+ "a");
		contractDays.sendKeys(Keys.DELETE,"7.00");
	    ar.click();
	    save.click();
	   
	}
}