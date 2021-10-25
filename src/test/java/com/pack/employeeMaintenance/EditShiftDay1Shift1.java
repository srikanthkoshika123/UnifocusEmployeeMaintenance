package com.pack.loginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pack.testCases.TC_BaseClass;

public class EditShiftDay1Shift1 extends TC_BaseClass {
	WebDriver ldriver;
	public EditShiftDay1Shift1(WebDriver 	rdriver){
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);

}
	@FindBy(className="app-iframe")
	WebElement editShift;
	@FindBy(xpath="//*[@id=\"root\"]/div/section/aside/div/section/div/div[3]/div/div/div[1]/div/ul/li[2]/span/div")
	WebElement edit;
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[1]/div/div[2]/div/span/span/input")
	WebElement startTime;
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[2]/div/div[2]/div/span/span/input")
	WebElement endTime;
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[2]/div[1]/div/div[2]/div/span/div/div/div/div")
	WebElement job;

	@FindBy(xpath="//li[text()='FRONT DESK CLERK - TAC']")
	WebElement jobsel;
	@FindBy(xpath="/html/body/div[5]/div/div[2]/div/div[2]/div[2]/form/div[3]/div[1]/div/div[2]/div/span/div/div/div/div")
	WebElement shiftRole;
	@FindBy(xpath="//*[@id=\"891d0fed-5f6d-4298-a765-3d53f0d7031d\"]/ul/li[4]")
	WebElement shiftCategory;
	
	@FindBy(xpath="//button[@class='ant-btn ant-btn-primary']")
	WebElement updateShift;
	public void clickEditShift() throws InterruptedException {
		driver.switchTo().frame(editShift);
		WebElement os=driver.findElement(By.xpath("//button[@class='ant-btn OpenShiftRenderer-module___OpenShiftButton___33NM7']"));
		Thread.sleep(6000);
		os.click();
		Thread.sleep(1000);
		edit.click();
	}
	
	public void clickStartTime() throws InterruptedException {
		startTime.sendKeys(Keys.CONTROL+ "a");
		startTime.sendKeys(Keys.DELETE);
		Thread.sleep(600);
	
		startTime.sendKeys("6:00AM");
		clickEndTime();
		
	}
	public void clickEndTime() throws InterruptedException {
		endTime.sendKeys(Keys.CONTROL + "a");
	
		endTime.sendKeys(Keys.DELETE);
		Thread.sleep(600);
		endTime.sendKeys("2:00PM");
		
	}
	public void selectJob() throws InterruptedException {
		
		job.click();

		
		}


		public WebElement selectJobCategory() throws InterruptedException {
			
			
			jobsel.click();
			return jobsel;
			

			
		}	
		public WebElement selectShiftCategory() throws InterruptedException {
			Thread.sleep(2000);
			shiftRole.click();
			
			shiftCategory.click();
			return shiftCategory;
		}	

		
			
			
		
		public void clickUpdateShift() throws InterruptedException {
			updateShift.click();
			driver.switchTo().defaultContent();
		}
	
}
