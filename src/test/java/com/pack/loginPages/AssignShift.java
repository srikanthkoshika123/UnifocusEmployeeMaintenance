package com.pack.loginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pack.testCases.TC_BaseClass;

public class AssignShift extends TC_BaseClass{

	WebDriver ldriver;
	public AssignShift(WebDriver 	rdriver){
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
}
	@FindBy(className="app-iframe")
	WebElement assignFrame;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/section/aside/div/section/div/div[3]/div/div/div/div/ul/li[1]/span")
	WebElement assignShift;
	@FindBy(xpath="/html/body/div[4]/div/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div")
	WebElement shiftCategory;
	@FindBy(xpath="//*[@id=\"9dbb1b6b-5ab8-4538-e848-bb0cc473bc9d\"]/ul/li[3]")
	WebElement shiftRole;
	@FindBy(xpath="/html/body/div[4]/div/div[2]/div/div[2]/div[2]/div/div[3]/div/div/div[2]/div[1]")
	WebElement assignRowCol;
	@FindBy(xpath="/html/body/div[4]/div/div[2]/div/div[2]/div[2]/div/div[3]/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div[1]")
	WebElement assignRow;
	@FindBy(xpath="/html/body/div[4]/div/div[2]/div/div[2]/div[2]/div/div[3]/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div[1]/div[2]/div/div/a")
	WebElement assign;
 
	public void selectFrame() throws InterruptedException {
		driver.switchTo().frame(assignFrame);
		
	}
	public void clickAssignShift() throws InterruptedException {
		assignShift.click();
		
	}
	public WebElement clickshiftCategory() throws InterruptedException {
		Thread.sleep(2000);
		shiftCategory.click();
		Thread.sleep(5000);
		shiftRole.click();
		return shiftRole;
	}
	public void clickAssignEmployee() throws InterruptedException {
		assign.click();
		
	}
}

