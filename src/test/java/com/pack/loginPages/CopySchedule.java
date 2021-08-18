package com.pack.loginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pack.testCases.TC_BaseClass;

public class CopySchedule extends TC_BaseClass{
	
	WebDriver ldriver;
	public CopySchedule(WebDriver 	rdriver){
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
}

	@FindBy(className="app-iframe")
	WebElement iFrame;
	//@FindBy(xpath="//button/span[text()='...']")
	//WebElement clickDelete;
	@FindBy(xpath="//button[@class='ant-btn ant-btn-primary']")
	WebElement deleteAllShift;
	
	public void iFrames() throws InterruptedException  {
	driver.switchTo().frame(iFrame);
			
	}
public void CopySchedule() throws InterruptedException {
	Thread.sleep(6000);
	WebElement ele=driver.findElement(By.cssSelector("#root > div > section > section > header > div > div.ant-row.unifocus-page-header.unifocus-page-header__row > div.ant-col.ant-col-11.unifocus-page-header__col > div > div > div > button:nth-child(1)"));
    Actions action = new Actions(driver);
    action.moveToElement(ele).click().build().perform();
    Thread.sleep(4000);
    //driver.switchTo().activeElement();
    //WebElement das = driver.findElement(By.xpath("//li[text()='Delete All Shifts']"));
    //das.click();
   
  //
  

	}

	
}



