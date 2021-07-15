package com.pack.loginPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPages {
WebDriver driver;
	
	public  MainPages(WebDriver rdriver){
    	driver=rdriver;
    	PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//header/div[1]/div[1]/div[1]/button[1]")
	WebElement unifocus;
	
			
	
	@FindBy(xpath="//span[contains(text(),'Labor')]")
	 WebElement labor;
	@FindBy(xpath="//*[@id=\"LABOR$Menu\"]/li[4]")
	  WebElement schedule;
	 
	 
	public void clickUnifocus(){
		unifocus.click();
		labor.click();
		
	}
	
	public WebElement getselect_List() {
		schedule.click();
		return schedule;
		
	}

}
