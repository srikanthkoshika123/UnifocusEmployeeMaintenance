package com.pack.loginPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pack.testCases.TC_BaseClass;

public class DeleteShift extends TC_BaseClass{

	WebDriver ldriver;
	public DeleteShift(WebDriver 	rdriver){
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
}

	@FindBy(className="app-iframe")
	WebElement deleteFrame;
	@FindBy(xpath="//*[@id=\"root\"]/div/section/aside/div/section/div/div[3]/div/div/div/div/ul/li[3]/span")
	WebElement delete;
	@FindBy(xpath="//button[@class='ant-btn ant-btn-primary ant-btn-sm']")
	WebElement deleteShift;
	public void deleteFrames()  {
		driver.switchTo().frame(deleteFrame);
	}
	public void deleteShift() throws InterruptedException {
		delete.click();
		Thread.sleep(2000);
		deleteShift.click();
	}

}
