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
	@FindBy(xpath="/html/body/div[4]/div/div[2]/div/div[2]/div[2]/section/div/div/div/div/div[1]/section[1]/div/div/div/div/div[1]/div[2]/button[2]")
	WebElement presentWeek;
	@FindBy(xpath="/html/body/div[4]/div/div[2]/div/div[2]/div[2]/section/div/div/div/div/div[1]/section[1]/div/div/div/div/div[2]/div[2]/button[2]")
	WebElement nextWeek;
	
	public void iFrames() throws InterruptedException  {
	driver.switchTo().frame(iFrame);
			
	}
public void copyschedule() throws InterruptedException {
	Thread.sleep(6000);
	WebElement ele=driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/header/div/div[1]/div[2]/div/div/div/button[1]"));
    Actions action = new Actions(driver);
    action.moveToElement(ele).click().build().perform();
   
	}

public void presentWeekData() throws InterruptedException {
	
	 presentWeek.click();
}
public void nextWeekData() throws InterruptedException {
	
	 nextWeek.click();
}
}
