package com.pack.loginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.pack.testCases.TC_BaseClass;

public class LaborPage extends TC_BaseClass {
	WebDriver ldriver;
	public LaborPage(WebDriver 	rdriver){
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);       	  		
	
}

	@FindBy(xpath="//header/div[1]/div[1]/div[1]/button[1]")
	WebElement unifocus;
	@FindBy(xpath="//span[text()='Labor']")
    WebElement labor;
	@FindBy(xpath="//li[@title='Actuals']")
    WebElement actuals;
	 public void clickUnifocus(){
	 unifocus.click();
	 String un =unifocus.getText();
	 System.out.println(un);
	 Assert.assertEquals("UniFocus", un);
	 labor.click();
	 }
	 public void clickActuals() throws InterruptedException {
	 actuals.click();
	 WebElement frame =driver.findElement(By.className("app-iframe"));
 	driver.switchTo().frame(frame);
 	try {
 	WebDriverWait wait=new WebDriverWait(driver, 80);
 	 WebElement mn= wait.until(
 	 ExpectedConditions.visibilityOfElementLocated(By.xpath ("//ul[@class='ant-timeline']/div[1]/div/div[2]/div/i")));
    Actions a = new Actions(driver);
     a.moveToElement(mn).
     click().build().perform();
     driver.switchTo().activeElement();
     WebElement das = driver.findElement(By.xpath("//div[3]//div//div//li[2]//div[normalize-space()='Update']"));
     das.click();
     driver.switchTo().activeElement();
     WebDriverWait kbi=new WebDriverWait(driver, 80);
  	WebElement multipleKBIs = kbi.until(
  	ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Multiple KBIs/Days']")));
  	 multipleKBIs.click();
 }
 	catch(NoSuchElementException e) {
 		System.out.println("nosuchelement");
 		
 	}
	 }
 	public void clickEnterActualEnvironments() throws InterruptedException {
	WebDriverWait wait=new WebDriverWait(driver, 80);
 	WebElement ActualEnvironments = wait.until(
 	ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='ant-timeline']/div[1]/div/div[2]/div/i")));
 	 Actions a = new Actions(driver);
 	 Coordinates cor=((Locatable) ActualEnvironments).getCoordinates();
     cor.inViewPort();
     Thread.sleep(1000);
     a.moveToElement(ActualEnvironments).
     click().build().perform();
 	driver.switchTo().activeElement();
    WebElement das = driver.findElement(By.cssSelector("li[class='ant-dropdown-menu-item ant-dropdown-menu-item-active']"));
    Thread.sleep(4000);
    das.click();
    Thread.sleep(4000);
	 }
	 
}
