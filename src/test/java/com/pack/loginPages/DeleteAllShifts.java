package com.pack.loginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pack.testCases.TC_BaseClass;

public class DeleteAllShifts extends TC_BaseClass{
	
	WebDriver ldriver;
	public DeleteAllShifts(WebDriver 	rdriver){
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
}

	@FindBy(className="app-iframe")
	WebElement iFrame;
	//@FindBy(xpath="//button/span[text()='...']")
	//WebElement clickDelete;
	@FindBy(xpath="//button[@class='ant-btn ant-btn-primary']")
	WebElement deleteAllShift;
	
	public void iFrames() throws InterruptedException  {
	driver.switchTo().frame(iFrame);
			
	}
public void deleteAllShift() throws InterruptedException {
	Thread.sleep(6000);
	WebElement ele=driver.findElement(By.cssSelector("#root > div > section > section > header > div > div.ant-row.unifocus-page-header.unifocus-page-header__row > div.ant-col.ant-col-11.unifocus-page-header__col > div > div > div > button.ant-btn.ant-dropdown-trigger"));
    Actions action = new Actions(driver);
    action.moveToElement(ele).click().build().perform();
    Thread.sleep(4000);
    driver.switchTo().activeElement();
    WebElement das = driver.findElement(By.xpath("//li[text()='Delete All Shifts']"));
    das.click();
   Thread.sleep(4000);
   
  // driver.switchTo().activeElement();
   WebElement checkBox=driver.findElement(By.xpath("//button/i[@aria-label='icon: check-square-o']"));
   Actions viewBox=new Actions(driver);
   viewBox.moveToElement(checkBox);
   viewBox.click().build().perform();
   Thread.sleep(4000);
   deleteAllShift.click();
 

	}


}
