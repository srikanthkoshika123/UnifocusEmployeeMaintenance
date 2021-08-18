package com.pack.loginPages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pack.testCases.TC_BaseClass;

public class AssignShiftDay4Shift1 extends TC_BaseClass{
  
	WebDriver ldriver;
	public AssignShiftDay4Shift1(WebDriver 	rdriver){
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
}
	@FindBy(className="app-iframe")
	WebElement assignFrame;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/section/aside/div/section/div/div[3]/div/div/div/div/ul/li[1]/span")
	WebElement assignShift;
	
	
	
	public void selectFrame() throws InterruptedException {
		driver.switchTo().frame(assignFrame);
		
	}
	public void clickAssignShift() throws InterruptedException {
		assignShift.click();
	}
	
	public void clickAssignEmployee() throws InterruptedException {
		driver.switchTo().activeElement();
		
		WebElement ele1=driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div[2]/div/div[3]/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div[2]/div[9]"));
		Thread.sleep(2000);
	    ele1.click();
	    WebElement button=driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary ant-btn-sm']"));
	    button.click();
	   
}
	
	}
