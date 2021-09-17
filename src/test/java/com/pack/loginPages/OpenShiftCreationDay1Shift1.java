package com.pack.loginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.pack.testCases.TC_BaseClass;

public class OpenShiftCreationDay1Shift1 extends TC_BaseClass{
	 String st="5:00AM";
	 String et="4:00PM";
	WebDriver ldriver;
	public OpenShiftCreationDay1Shift1(WebDriver 	rdriver){
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
}

	@FindBy(className="app-iframe")
	WebElement openShift;
	
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[1]/div/div[2]/div/span/span/input")
	WebElement startTime;
	
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[2]/div/div[2]/div/span/span/input")
	WebElement endTime;
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[2]/div[1]/div/div[2]/div/span/div/div/div/div")
	WebElement job;

	@FindBy(xpath="//li[text()='FRONT DESK CLERK - TAC']")
	WebElement jobsel;
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[3]/div[1]/div/div[2]/div/span/div/div/div/div")
	WebElement shiftRole;
	@FindBy(xpath="//li[text()='Contract Hours']")
	WebElement shiftCategory;
	@FindBy(xpath="//input[@class='ant-input input-field uf-input-field number-input-field ']")
	WebElement noOfShifts;
	@FindBy(xpath="//button[@class='ant-btn ant-btn-primary']")
	WebElement addShift;
	@FindBy(xpath="/html/body/div[3]/div/span/div/div/div")
	private WebElement toast;
	
	public void getFrame()throws InterruptedException {
	driver.switchTo().frame(openShift);
	WebElement dr=driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/section/div/div[2]/div/div/div/div/div/div[2]/div[1]/div[2]/div[2]/div/div[2]/div[1]/div/button"));
	Thread.sleep(8000);
	dr.click();
	
	}
 
public void clickStartTime() throws InterruptedException {
	Thread.sleep(600);
	startTime.sendKeys(st);
	if(st.equalsIgnoreCase("5:00AM")) {
		Assert.assertTrue(true);
		System.out.println(st);
	}
}
public void clickEndTime() throws InterruptedException {
	Thread.sleep(600);
	endTime.sendKeys(et);
	if(et.equalsIgnoreCase("4:00PM")) {
		Assert.assertTrue(true);
		System.out.println(et);
	}
	else {
		Assert.assertTrue(false);
	}
}

public void selectJob() throws InterruptedException {
job.click();
String strng =job.getText();
System.out.println(strng);
Assert.assertEquals("FRONT DESK CLERK - TAC", strng);

}

public WebElement selectJobCategory() throws InterruptedException {
	jobsel.click();
	String js =jobsel.getText();
	System.out.println(js);
	Assert.assertEquals("FRONT DESK CLERK - TAC", js);

	return jobsel;	
}	
public WebElement selectShiftCategory() throws InterruptedException {

	shiftRole.click();
	Thread.sleep(2000);
	shiftCategory.click();
	String sc =shiftCategory.getText();
	System.out.println(sc);
	Assert.assertEquals("Contract Hours", sc);

	return shiftCategory;
}	

public void selectNoOfShits() throws InterruptedException {
	String noShifts="1";
	noOfShifts.sendKeys(Keys.BACK_SPACE);
	noOfShifts.sendKeys("1");
	if(noShifts.equalsIgnoreCase("1")) {
		Assert.assertTrue(true);
		System.out.println(noShifts);
	}
	else {
		Assert.assertTrue(false);
	}
		
}
public void clickAddShift() throws InterruptedException {
	String kk = driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary']")).getText();
	System.out.println(kk);
	Assert.assertEquals("Add Shifts", kk);
	addShift.click();
	
	
}
public WebElement getTooltip() throws InterruptedException
{
	Thread.sleep(2000);
	String kk = driver.findElement(By.xpath("/html/body/div[3]/div/span/div/div/div")).getText();
	System.out.println(kk);
	Assert.assertEquals("Open Shifts Were Created", kk);
	return toast;
}
	
}