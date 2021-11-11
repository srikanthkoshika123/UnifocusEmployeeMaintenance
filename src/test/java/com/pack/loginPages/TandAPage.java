package com.pack.loginPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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
    public WebElement clickWhoIsInOut() throws InterruptedException{
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
    }public WebElement clickAttendancePointsandEvents() throws InterruptedException{
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
    public WebElement clickBenefits() throws InterruptedException{
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
    	reviewPayPeriod.click();
    	Thread.sleep(3000);
    	return  reviewPayPeriod;
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
    	reviewPayPeriod.click();
    	Thread.sleep(3000);
    	return  reviewPayPeriod;
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
    	reviewPayPeriod.click();
    	Thread.sleep(3000);
    	return  reviewPayPeriod;
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
    	reviewPayPeriod.click();
    	Thread.sleep(3000);
    	return  reviewPayPeriod;
    }
}
