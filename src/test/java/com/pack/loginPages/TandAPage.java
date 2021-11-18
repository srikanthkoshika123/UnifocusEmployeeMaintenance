package com.pack.loginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.pack.testCases.TC_BaseClass;

public class TandAPage extends TC_BaseClass{
	WebDriver ldriver;
	public TandAPage(WebDriver 	rdriver){
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);       	  		
	
}

	@FindBy(xpath="//header/div[1]/div[1]/div[1]/button[1]")
	WebElement unifocus1;
	@FindBy(xpath="//span[text()='T&A']")
    WebElement tANDa1;
	@FindBy(xpath="//li[@title='Review Pay Period']")
	WebElement reviewPayPeriod;
    @FindBy(xpath="//li[@title='Who Is In/Out']")
    WebElement WhoIsInOut;
    @FindBy(xpath="//li[@title='Attendance Points and Events']")
    WebElement AttendancePointsandEvents;
    @FindBy(xpath="//li[@title='Benefits']")
    WebElement Benefits;
    @FindBy(xpath="//li[@title='Enter Earnings']")
    WebElement EnterEarnings ;
    @FindBy(xpath="//li[@title='Holiday Pay']")
    WebElement HolidayPay;
    @FindBy(xpath="//li[@title='Punch Image Review']")
    WebElement PunchImageReview;
    @FindBy(xpath="//li[@title='Approve Earnings']")
    WebElement ApproveEarnings;
    
    public WebElement clickReviewPayPeriod() throws InterruptedException{
	unifocus1.click();
	String un =unifocus1.getText();
	System.out.println(un);
	Assert.assertEquals("UniFocus", un);
	tANDa1.click();
	String sc =tANDa1.getText();
	System.out.println(sc);
	Assert.assertEquals("T&A", sc);	
    Thread.sleep(3000);
	reviewPayPeriod.click();
	Thread.sleep(3000);
	return  reviewPayPeriod;
    }
    public void approveShifts() {
    	WebElement frame =driver.findElement(By.className("app-iframe"));
    	driver.switchTo().frame(frame);
    	WebDriverWait wait=new WebDriverWait(driver, 60);
    	WebElement as = wait.until(
    	ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='ant-btn ant-btn-primary']")));
    	driver.switchTo().defaultContent();
    }
  
    public WebElement clickWhoIsInOut() throws InterruptedException{
    	unifocus1.click();
    	tANDa1.click();
        WhoIsInOut.click();
    	Thread.sleep(3000);
    	return  WhoIsInOut;
    }
    public void viewAsOf() {
    	WebElement frame =driver.findElement(By.className("app-iframe"));
    	driver.switchTo().frame(frame);
    	WebDriverWait wait=new WebDriverWait(driver, 100);
    	WebElement as = wait.until(
    	ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Filter by Name or Emp. Id']")));
    	driver.switchTo().defaultContent();
    }
    public WebElement clickAttendancePointsandEvents() throws InterruptedException{
    	unifocus1.click();
    	tANDa1.click();
        Thread.sleep(3000);
        AttendancePointsandEvents.click();
    	Thread.sleep(3000);
    	return AttendancePointsandEvents;
    }
    public void viewSelectAll() {
    	WebElement frame =driver.findElement(By.className("app-iframe"));
    	driver.switchTo().frame(frame);
    	 WebDriverWait ca=new WebDriverWait(driver, 120);
	     WebElement addpoint = ca.until(
	     ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class='ant-radio-button-wrapper ant-radio-button-wrapper-checked']")));
    	driver.switchTo().defaultContent();
    }
    public WebElement clickBenefits() throws InterruptedException{
    	unifocus1.click();
    	tANDa1.click();
    	Benefits.click();
    	Thread.sleep(3000);
    	return  Benefits;
    }
    public void viewEmployees() {
    	WebElement frame =driver.findElement(By.className("app-iframe"));
    	driver.switchTo().frame(frame);
    	WebDriverWait wait=new WebDriverWait(driver, 120);
    	WebElement as = wait.until(
    	ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='uf-page-panel-header-action']/button[1]")));
    	as.click();
    	driver.switchTo().defaultContent();
    }
    public WebElement clickEnterEarnings() throws InterruptedException{
    	unifocus1.click();
    	tANDa1.click();
    	String sc =tANDa1.getText();
    	System.out.println(sc);
    	Assert.assertEquals("T&A", sc);	
        Thread.sleep(3000);
        EnterEarnings.click();
    	Thread.sleep(3000);
    	return  EnterEarnings;
    }
    public void viewBulkEarnings() throws InterruptedException {
    	WebElement frame =driver.findElement(By.className("app-iframe"));
    	driver.switchTo().frame(frame);
    	//WebDriverWait wait=new WebDriverWait(driver, 100);
    	Thread.sleep(80000);
    	WebElement as = driver.findElement(By.xpath("//div[@title='T - Tips Declared (D)']"));
    	as.click();
    	driver.switchTo().defaultContent();
    }
    public WebElement clickHolidayPay() throws InterruptedException{
    	unifocus1.click();
    	tANDa1.click();
        HolidayPay.click();
    	Thread.sleep(3000);
    	return  HolidayPay;
    }
    public void viewApplyEarnings() {
    	WebElement frame =driver.findElement(By.className("app-iframe"));
    	driver.switchTo().frame(frame);
    	WebDriverWait wait=new WebDriverWait(driver, 60);
    	WebElement as = wait.until(
    	ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='uf-tri-area-outer-right']//div[2]//div[1]//div[1]//span[1]//button[1]")));
    	driver.switchTo().defaultContent();
    }
    public WebElement clickPunchImageReview() throws InterruptedException{
    	unifocus1.click();
    	tANDa1.click();
        PunchImageReview.click();
    	Thread.sleep(3000);
    	return  PunchImageReview;
    }
    public void viewNames() {
    	WebElement frame =driver.findElement(By.className("app-iframe"));
    	driver.switchTo().frame(frame);
    	WebDriverWait wait=new WebDriverWait(driver, 60);
    	WebElement as = wait.until(
    	ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='uf-section-panel-titlebar']/h3[@title='Employees']")));
    	driver.switchTo().defaultContent();
    }
    public WebElement clickApproveEarnings() throws InterruptedException{
    	unifocus1.click();
    	tANDa1.click();
        ApproveEarnings.click();
    	Thread.sleep(3000);
    	return  ApproveEarnings;
    }
    public void viewApproveAllEarnings() {
    	WebElement frame =driver.findElement(By.className("app-iframe"));
    	driver.switchTo().frame(frame);
    	WebDriverWait wait=new WebDriverWait(driver, 60);
    	WebElement as = wait.until(
    	ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='uf-page-panel-header-action']//button[@type='button']")));
    	driver.switchTo().defaultContent();
    }
}
