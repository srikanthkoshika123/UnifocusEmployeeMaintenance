package com.pack.loginPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.pack.testCases.TC_BaseClass;

public class MainPages extends TC_BaseClass {

	WebDriver ldriver;
	public  MainPages(WebDriver rdriver){
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//header/div[1]/div[1]/div[1]/button[1]")
	WebElement unifocus;
	@FindBy(xpath="//span[contains(text(),'Administration')]")
	 WebElement adminstration;
	@FindBy(xpath="//*[@id=\"MOST_USED_APPS$Menu\"]/li[1]")
	  WebElement schedule;
	 
	 
	public void clickUnifocus(){
		unifocus.click();
		String un =unifocus.getText();
		System.out.println(un);
		Assert.assertEquals("UniFocus", un);
		adminstration.click();
		String sc =adminstration.getText();
		System.out.println(sc);
		Assert.assertEquals("Administration", sc);
		
		
	}
	
	public WebElement getselect_List() {
	
		schedule.click();
		
		return schedule;
		
	}

}
