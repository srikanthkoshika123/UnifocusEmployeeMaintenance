package com.pack.loginPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.json.JsonException;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pack.testCases.TC_BaseClass;

public class DragAndDrop extends TC_BaseClass {

	WebDriver ldriver;
	public DragAndDrop(WebDriver 	rdriver){
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
}
	@FindBy(className="app-iframe")
	WebElement dropFrame;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/section/aside/div/section/div/div[3]/div/div/div/div/div/div")
	WebElement dragLocation;
	@FindBy(xpath="//*[@id=\"root\"]/div/section/section/main/div/div/section/div/div[2]/div/div/div/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div[6]/div[2]/div/div/div[2]")
	WebElement dropLocation;
	public void selectFrames() {
		driver.switchTo().frame(dropFrame);
		
	}
	public void dragandDrop() {
		try {
		Actions builder = new Actions(driver);
		Action dragAndDrop = builder.clickAndHold(dragLocation)
				.moveToElement(dropLocation)
				.release(dropLocation)
				.build();
			dragAndDrop.perform();
		}
		catch (JsonException e) {
		    System.out.println("Unable to parse input" + e);
		  }
}
	
}