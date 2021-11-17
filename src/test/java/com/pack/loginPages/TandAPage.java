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
	@FindBy(xpath="//header/div[1]/div[1]/div[1]/button[1]")
	WebElement unifocus2;
	@FindBy(xpath="//span[text()='T&A']")
    WebElement tANDa2;
    @FindBy(xpath="//li[@title='Who Is In/Out']")
    WebElement WhoIsInOut;
    @FindBy(xpath="//header/div[1]/div[1]/div[1]/button[1]")
	WebElement unifocus3;
    @FindBy(xpath="//span[text()='T&A']")
    WebElement tANDa3;
    @FindBy(xpath="//li[@title='Attendance Points and Events']")
    WebElement AttendancePointsandEvents;
    @FindBy(xpath="//header/div[1]/div[1]/div[1]/button[1]")
	WebElement unifocus4;
    @FindBy(xpath="//span[text()='T&A']")
    WebElement tANDa4;
    @FindBy(xpath="//li[@title='Benefits']")
    WebElement Benefits;
    @FindBy(xpath="//header/div[1]/div[1]/div[1]/button[1]")
	WebElement unifocus5;
    @FindBy(xpath="//span[text()='T&A']")
    WebElement tANDa5;
    @FindBy(xpath="//li[@title='Enter Earnings']")
    WebElement EnterEarnings ;
    @FindBy(xpath="//header/div[1]/div[1]/div[1]/button[1]")
	WebElement unifocus6;
    @FindBy(xpath="//span[text()='T&A']")
    WebElement tANDa6;
    @FindBy(xpath="//li[@title='Holiday Pay']")
    WebElement HolidayPay;
    @FindBy(xpath="//header/div[1]/div[1]/div[1]/button[1]")
	WebElement unifocus7;
    @FindBy(xpath="//span[text()='T&A']")
    WebElement tANDa7;
    @FindBy(xpath="//li[@title='Punch Image Review']")
    WebElement PunchImageReview;
    @FindBy(xpath="//header/div[1]/div[1]/div[1]/button[1]")
   	WebElement unifocus8;
    @FindBy(xpath="//span[text()='T&A']")
    WebElement tANDa8;
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
    	String un =unifocus1.getText();
    	System.out.println(un);
    	Assert.assertEquals("UniFocus", un);
    	tANDa1.click();
    	String sc =tANDa1.getText();
    	System.out.println(sc);
    	Assert.assertEquals("T&A", sc);	
        WhoIsInOut.click();
    	Thread.sleep(3000);
    	
    	return  WhoIsInOut;
    }
    public void viewAsOf() {
    	WebElement frame =driver.findElement(By.className("app-iframe"));
    	driver.switchTo().frame(frame);
    	WebDriverWait wait=new WebDriverWait(driver, 100);
    	WebElement as = wait.until(
    	ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='uf-tri-area-inner-middle']")));
    	driver.switchTo().defaultContent();
    }
    public WebElement clickAttendancePointsandEvents() throws InterruptedException{
    	unifocus1.click();
    	String un =unifocus1.getText();
    	System.out.println(un);
    	Assert.assertEquals("UniFocus", un);
    	tANDa1.click();
    	String sc =tANDa1.getText();
    	System.out.println(sc);
    	Assert.assertEquals("T&A", sc);	
        Thread.sleep(3000);
        AttendancePointsandEvents.click();
    	Thread.sleep(3000);
    	
    	return AttendancePointsandEvents;
    }
    public void viewSelectAll() {
    	WebElement frame =driver.findElement(By.className("app-iframe"));
    	driver.switchTo().frame(frame);
    	     String toast = new WebDriverWait(driver, 100).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='ant-message-notice-content']"))).getText();
    	
    	    if (toast.contains("Previous filters restored")) {
    	    	 WebDriverWait ca=new WebDriverWait(driver, 80);
    		     WebElement calculate = ca.until(
    		     ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='AttendanceToolbar-module___buttonGroup___22W8J'] button[type='button']")));
    	    	driver.switchTo().defaultContent();
    	    } else {
    	        System.out.println(toast);
    	    }
    	 WebDriverWait ca=new WebDriverWait(driver, 80);
	     WebElement calculate = ca.until(
	     ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-child(3) div:nth-child(1) div:nth-child(1) span:nth-child(1) button:nth-child(1)")));
    	driver.switchTo().defaultContent();
    }
    public WebElement clickBenefits() throws InterruptedException{
    	unifocus1.click();
    	String un =unifocus1.getText();
    	System.out.println(un);
    	Assert.assertEquals("UniFocus", un);
    	tANDa1.click();
    	String sc =tANDa1.getText();
    	System.out.println(sc);
    	Assert.assertEquals("T&A", sc);	
    	Benefits.click();
    	Thread.sleep(3000);
    	
    	return  Benefits;
    }
    public void viewEmployees() {
    	WebElement frame =driver.findElement(By.className("app-iframe"));
    	driver.switchTo().frame(frame);
    	WebDriverWait wait=new WebDriverWait(driver, 120);
    	WebElement as = wait.until(
    	ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='uf-section-panel-titlebar']")));
    	driver.switchTo().defaultContent();
    }
    public WebElement clickEnterEarnings() throws InterruptedException{
    	unifocus1.click();
    	String un =unifocus1.getText();
    	System.out.println(un);
    	Assert.assertEquals("UniFocus", un);
    	tANDa1.click();
    	String sc =tANDa1.getText();
    	System.out.println(sc);
    	Assert.assertEquals("T&A", sc);	
        Thread.sleep(3000);
        EnterEarnings.click();
    	Thread.sleep(3000);
    
    	return  EnterEarnings;
    }
    public void viewBulkEarnings() {
    	WebElement frame =driver.findElement(By.className("app-iframe"));
    	driver.switchTo().frame(frame);
    	WebDriverWait wait=new WebDriverWait(driver, 60);
    	WebElement as = wait.until(
    	ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='unifocus-section-toolbar-content']//div[@class='uf-tri-area-outer-right']//button[@type='button']")));
    	driver.switchTo().defaultContent();
    }
    public WebElement clickHolidayPay() throws InterruptedException{
    	unifocus1.click();
    	String un =unifocus1.getText();
    	System.out.println(un);
    	Assert.assertEquals("UniFocus", un);
    	tANDa1.click();
    	String sc =tANDa1.getText();
    	System.out.println(sc);
    	Assert.assertEquals("T&A", sc);	
        Thread.sleep(3000);
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
    	String un =unifocus1.getText();
    	System.out.println(un);
    	Assert.assertEquals("UniFocus", un);
    	tANDa1.click();
    	String sc =tANDa1.getText();
    	System.out.println(sc);
    	Assert.assertEquals("T&A", sc);	
        Thread.sleep(3000);
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
    	String un =unifocus1.getText();
    	System.out.println(un);
    	Assert.assertEquals("UniFocus", un);
    	tANDa1.click();
    	String sc =tANDa1.getText();
    	System.out.println(sc);
    	Assert.assertEquals("T&A", sc);	
        Thread.sleep(3000);
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
