package com.pack.loginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pack.testCases.TC_BaseClass;

public class UpdateExistingEmployee extends TC_BaseClass{
	WebDriver ldriver;
	public UpdateExistingEmployee(WebDriver 	rdriver){
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);       	  		
	
}
	@FindBy(className="app-iframe")
	WebElement frame;
	@FindBy(xpath="//input[@placeholder='Name or EmpID']")
    WebElement searchEmp;
	@FindBy(xpath="//div[@class='EmployeeSidebar-module___employeeSidebarTableCell___hpZDq']")
    WebElement empName;
	@FindBy(xpath="//form[2]/div[1]/div[2]/div[1]/div[6]/div[1]/div[text()='Additional Fields']")
	WebElement additionalFields;
	@FindBy(xpath="//div[7]/div[2]/div[1]/div[2]/div[1]/span[1]/input[1]")
	WebElement adderss;
	@FindBy(xpath="//form[2]/div/div[2]/div/div[7]/div[4]/div/div[2]/div/span[1]/input[1]")
	WebElement city;
	@FindBy(xpath="//div[@id='STATE']//div[contains(@class,'ant-select-selection__rendered')]")
	WebElement state;
	@FindBy(xpath="//form[2]/div/div[2]/div/div[7]/div[6]/div/div[2]/div/span[1]/input[1]")
	WebElement zipCode;
	@FindBy(xpath="//form[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/span[1]/input[1]")
	WebElement displayName;
	@FindBy(xpath="//input[contains(@placeholder,'Name or EmpID')]")
    WebElement searchEmployee;
	@FindBy(xpath="//div[@class='EmployeeSidebar-module___employeeSidebarTableCell___hpZDq']")
    WebElement updatedEmp;
	
	public void switchFrame() throws InterruptedException {
		driver.switchTo().frame(frame);
		}
	public void UpdateEmployee() throws InterruptedException {
		driver.switchTo().activeElement();
		Thread.sleep(6000);
		searchEmp.sendKeys("001179");
		Thread.sleep(6000);
		empName.click();
		Thread.sleep(6000);
		additionalFields.click();
		adderss.sendKeys("madhapur");
		city.sendKeys("hydreabad");
		Thread.sleep(6000);
		state.click();
		zipCode.sendKeys("501510");
		displayName.sendKeys(Keys.CONTROL+ "a");
		displayName.sendKeys(Keys.DELETE,"adam");
		searchEmployee.sendKeys("001179");
		Thread.sleep(6000);
		updatedEmp.click();
		Thread.sleep(16000);
		
		
		
		
		
	}

}
