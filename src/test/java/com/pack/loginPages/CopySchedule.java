package com.pack.loginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.pack.testCases.TC_BaseClass;

public class CopySchedule extends TC_BaseClass{
	
	WebDriver ldriver;
	public CopySchedule(WebDriver 	rdriver){
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
}


	@FindBy(className="app-iframe")
	WebElement iFrame;
	@FindBy(xpath="/html/body/div[8]/div/div[2]/div/div[2]/div[2]/section/div/div/div/div/div[1]/section[1]/div/div/div/div/div[1]/div[2]/button[2]")
	WebElement pw;
	@FindBy(xpath="/html/body/div[8]/div/div[2]/div/div[2]/div[2]/section/div/div/div/div/div[1]/section[1]/div/div/div/div/div[2]/div[2]/button")
	WebElement nw;
	@FindBy(xpath="//div/div[text()='Select All']")
	WebElement selectAll;
	@FindBy(xpath="//input[@class='ant-checkbox-input'][@value='4']")
	WebElement selDay1;
	@FindBy(xpath="//input[@class='ant-checkbox-input'][@value='6']")
	WebElement selDay2;
	@FindBy(xpath="//button[@class='ant-btn ant-btn-primary']")
	WebElement copy;
	public void iFrames() throws InterruptedException  {
	driver.switchTo().frame(iFrame);
			
	}
   public void copyschedule() throws InterruptedException {
	Thread.sleep(6000);
	WebElement ele=driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/header/div/div[1]/div[2]/div/div/div/button[1]"));
    Thread.sleep(8000);
    ele.click();
    String strng =ele.getText();
    System.out.println(strng);
    Assert.assertEquals("Copy Schedules", strng);

	 Thread.sleep(4000);
	 WebElement eleme=driver.findElement(By.xpath("//button/i[@aria-label='icon: check-square-o']"));
	 Actions viewBox=new Actions(driver);
	   viewBox.moveToElement(eleme);
	   viewBox.click().build().perform();
	   String select =selectAll.getText();
	    System.out.println(select);
	    Assert.assertEquals("Select All", select); 
	 
   }
   public void nextWeekData() throws InterruptedException {
	  
	   WebElement copyFrom=driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/section/div/div/div/div/div[1]/section[1]/div/div/div/div/div[1]/div[1]/div/div/div"));
	   String strng =copyFrom.getText();
	    System.out.println(strng);
	    Assert.assertEquals("6/21/21 to 6/27/21", strng);
	    WebElement copyTo=driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/section/div/div/div/div/div[1]/section[1]/div/div/div/div/div[2]/div[1]/div/div/div"));
	    String strn =copyTo.getText();
	    System.out.println(strn);
	    Assert.assertEquals("6/28/21 to 7/4/21", strn);
	 
   }
public void selectDay() throws InterruptedException {
	selDay1.click();
    Assert.assertNull(selDay1.getAttribute("checked"));
    System.out.println(selDay1.getAttribute("checked"));
	Thread.sleep(3000);
	selDay2.click();
    Assert.assertNull(selDay2.getAttribute("checked"));
    System.out.println(selDay2.getAttribute("checked"));
}
 public void clickCopy() throws InterruptedException {
   Thread.sleep(3000);
	copy.click();
	
	 String Copy =copy.getText();
	    System.out.println(Copy);
	    Assert.assertEquals("Copy", Copy); 
}
    }
