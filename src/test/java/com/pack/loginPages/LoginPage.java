package com.pack.loginPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.pack.testCases.TC_BaseClass;

public class LoginPage extends TC_BaseClass{
	WebDriver ldriver;
	public LoginPage(WebDriver 	rdriver){
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);       	  		
	
}
	@FindBy(xpath="//input[@id='ext-element-36'][@class='x-input-el x-form-field x-input-text']")
	
	WebElement txtName;
	@FindBy(xpath="//input[@class='x-input-el x-form-field x-input-password']")
	WebElement password;
	@FindBy(css="#ext-button-1")
	WebElement signin;
	

	public void setUserName(String uname) {
		 
		txtName.sendKeys(uname);
		Assert.assertEquals(true, txtName.isEnabled());
		System.out.println(txtName.isEnabled());
		
	}
	
	
	public void setPassWord(String pwd) {
			password.sendKeys(pwd);
		    Assert.assertEquals(true, password.isEnabled());
			System.out.println(password.isEnabled());
		}
	public void clickSignIn() {
				signin.click();
				Assert.assertEquals(true, signin.isEnabled());
				System.out.println("signin clicked");
	}
	
	
		         
	
	}



