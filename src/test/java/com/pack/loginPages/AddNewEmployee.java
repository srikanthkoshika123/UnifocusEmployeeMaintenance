package com.pack.loginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	@FindBy(xpath="//span[text()='10. Rooms']")
	WebElement selectjob;
	@FindBy(xpath="//span[text()='Front Office']")
	WebElement jobType;
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
	selectjob.click();
	selectjob.click();
	jobType.click();;
	}
		
	
}