package com.pack.loginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.json.JsonException;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pack.testCases.TC_BaseClass;

import okio.Timeout;

public class DragAndDrop extends TC_BaseClass {

	WebDriver ldriver;
	public DragAndDrop(WebDriver 	rdriver){
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
}
	@FindBy(xpath="//button[@class='ant-btn fullscreen-button ant-btn-primary']")
	WebElement extension;
	@FindBy(className="app-iframe")
	WebElement dropFrame;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/section/aside/div/section/div/div[3]/div/div/div[1]/div/div/div")
	WebElement dragLocation;
	@FindBy(xpath="//*[@id=\"root\"]/div/section/section/main/div/div/section/div/div[2]/div/div/div/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div[6]/div[1]/div/div/div")
	WebElement dropLocation;
	
	public void clickExtention() throws InterruptedException {
		Thread.sleep(8000);
		extension.click();
	}
	public void iFrames() throws InterruptedException  {
		driver.switchTo().frame(dropFrame);
		Thread.sleep(4000);
		WebElement os=driver.findElement(By.xpath("//button[@class='ant-btn OpenShiftRenderer-module___OpenShiftButton___33NM7']"));
		Thread.sleep(8000);
		os.click();
				
		}
	public void dragandDrop() throws InterruptedException {
		try {
		Actions builder = new Actions(driver);
		

		builder.clickAndHold(dragLocation);
				 
		builder.moveToElement(dropLocation).perform();	        
		builder.release(dropLocation).build().perform();
				
		
		}
		catch (JsonException e) {
		    System.out.println("Unable to parse input" + e);
		  }
}
	
}