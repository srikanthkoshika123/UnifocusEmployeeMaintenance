package com.pack.loginPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PartnerCodeValidation {
	WebDriver ldriver;
	public PartnerCodeValidation (WebDriver rdriver){
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//input[@class='x-input-el x-form-field x-input-text']")
	WebElement partnerCode;
	
	@FindBy(xpath="//span[@class='x-button-label']")
    WebElement next;
 
	 public void setPartnerCode(String pc) {
			partnerCode.sendKeys(pc);
		}
		public void clickNext() {
			next.click();
		}
}
