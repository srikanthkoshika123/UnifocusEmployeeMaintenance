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
	@FindBy(xpath="/html/body/div[4]/div/div/ul/li[3]")
	WebElement deleteAllShift;
	
	public void iFrames() throws InterruptedException  {
	driver.switchTo().frame(iFrame);
			
	}
public void deleteAllShift() throws InterruptedException {
	Thread.sleep(2000);
WebElement menu = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/section/div/div[1]/div/div/div[2]/div/div/button[1]"));
Actions builder = new Actions(driver);
//builder.moveToElement(menu).perform();
builder.moveToElement(menu, 150, 150).perform();

 
//builder.contextClick().perform();
WebDriverWait wait = new WebDriverWait(driver, 5);
wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/ul/li[3]")));
WebElement menuOption = driver.findElement(By.xpath("/html/body/div[3]/div/div/ul/li[3]"));
menuOption.click();

	}


}
