package com.pack.loginPages;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pack.testCases.TC_BaseClass;

public class Swaping extends TC_BaseClass {
	WebDriver ldriver;
	public Swaping(WebDriver 	rdriver){
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
}

	@FindBy(className="app-iframe")
	WebElement iFrame;
	@FindBy(xpath="//*[@id=\"root\"]/div/section/section/main/div/div/section/div/div[2]/div/div/div/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div[1]/div[1]/div/div/div[2]")
	WebElement src;
	@FindBy(xpath="//*[@id=\"root\"]/div/section/section/main/div/div/section/div/div[2]/div/div/div/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div[5]/div[1]/div/div/div[2]")
	WebElement dest;
	public void iframe() {
		driver.switchTo().frame(iFrame);
	}
	public void swap() throws AWTException, InterruptedException {        
   Actions builder = new Actions(driver);
   builder.clickAndHold(src);
   builder.moveToElement(dest);
   builder.release(dest);
   builder.build().perform();
	}
}
