package com.pack.loginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pack.testCases.TC_BaseClass;

public class OpenShiftCreationDay2Shift2 extends TC_BaseClass{

	WebDriver ldriver;
	public OpenShiftCreationDay2Shift2(WebDriver 	rdriver){
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
}
	
	
	@FindBy(className="app-iframe")
	WebElement openShift;
	
	@FindBy(xpath="/html/body/div[5]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[1]/div/div[2]/div/span/span")
	WebElement endTime;
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[2]/div[1]/div/div[2]/div/span/div/div/div/div")
	WebElement job;

	@FindBy(xpath="//li[text()='FRONT DESK COORDINATOR-TAC']")
	WebElement jobsel;
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[3]/div[1]/div/div[2]/div/span/div/div/div/div")
	WebElement shiftRole;
	@FindBy(xpath="//li[text()='Training']")
	WebElement shiftCategory;
	@FindBy(xpath="//input[@class='ant-input input-field uf-input-field number-input-field ']")
	WebElement noOfShifts;
	@FindBy(xpath="//button[@class='ant-btn ant-btn-primary']")
	WebElement addShift;
	
	public void getFrame()throws InterruptedException {
	driver.switchTo().frame(openShift);
	WebElement dr=driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/section/div/div[2]/div/div/div/div/div/div[2]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/button"));
	Thread.sleep(8000);
	dr.click();
	Thread.sleep(8000);
	WebElement dr2=driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/aside/div/section/div/div[3]/div/div/button"));
	dr2.click();
	Thread.sleep(8000);
	
	}
 
public void clickStartTime() throws InterruptedException {
	
	WebElement starttime=driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[1]/div/div[2]/div/span/span/input"));
	Thread.sleep(600);
	starttime.sendKeys("10:00PM");
	
	
	
}
public void clickEndTime() throws InterruptedException {
	
	WebElement endtime=driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[2]/div/div[2]/div/span/span/input"));
	Thread.sleep(600);
	endtime.sendKeys("6:00AM");
}

public void selectJob() throws InterruptedException {
job.click();

}

public WebElement selectJobCategory() throws InterruptedException {
	jobsel.click();
	return jobsel;	
}	
public WebElement selectShiftCategory() throws InterruptedException {

	shiftRole.click();
	Thread.sleep(2000);
	shiftCategory.click();
	return shiftCategory;
}	

public void selectNoOfShits() throws InterruptedException {
	noOfShifts.sendKeys(Keys.BACK_SPACE);
	noOfShifts.sendKeys("1");
	
	
}
public void clickAddShift() throws InterruptedException {
	addShift.click();
}
	
}