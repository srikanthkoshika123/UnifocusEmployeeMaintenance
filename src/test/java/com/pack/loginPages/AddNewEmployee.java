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
	@FindBy(xpath="//li[text()='Salaried Exempt']")
	WebElement pay;
	public void addNewemployee() throws InterruptedException {
	driver.switchTo().frame(frame);
	WebElement addnew = driver.findElement(By.xpath("//button[normalize-space()='Add New']"));
	Thread.sleep(4000);
	addnew.click();
	Empid.sendKeys("003734");
	DisplayName.sendKeys("srikanthkoshika");
	FirstName.sendKeys("srikanth");
	middleName.sendKeys("yadav");
	lastName.sendKeys("koshika");
	hireDate.sendKeys("10/31/2021");
	seniority.sendKeys("11/6/2021");
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
	jobdate.sendKeys("10/19/2012");
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
		effectivedate.sendKeys("9/15/2011");
		paytype.click();
		pay.click();
		}	
	
}