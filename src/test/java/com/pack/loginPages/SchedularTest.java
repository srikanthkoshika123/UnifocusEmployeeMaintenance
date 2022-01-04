package com.pack.loginPages;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.pack.testCases.TC_BaseClass;

public class SchedularTest extends TC_BaseClass {
	WebDriver ldriver;
	public SchedularTest(WebDriver 	rdriver){
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);       	  

}
	
	@FindBy(className="app-iframe")
	WebElement frame;
	@FindBy(xpath="//header/div[1]/div[1]/div[1]/button[1]")
	WebElement unifocus;
	@FindBy(xpath="//span[text()='Labor']")
    WebElement labor;
	@FindBy(xpath="//li[@title='Scheduling']")
    WebElement scheduling;
	
	
	  public void clickUnifocus() throws InterruptedException{
		  driver.switchTo().defaultContent();
			unifocus.click();
			String un =unifocus.getText();
			System.out.println(un);
			Assert.assertEquals("UniFocus", un);
			Thread.sleep(4000);
			   labor.click();
			   Thread.sleep(4000);
			   scheduling.click();     
	  }
	  public boolean retryingFindClick() throws InterruptedException {
		  driver.switchTo().frame(frame);
			   Thread.sleep(6000);
		  boolean result = false;
	        int attempts = 0;
	        while(attempts < 2) {
	            try {
	            	
		  			 WebDriverWait wait = new WebDriverWait(driver, 120);
					   WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div > div >button.ant-dropdown-trigger:nth-child(2)")));
					   //div > div >button.ant-dropdown-trigger:nth-child(2)
					   ((JavascriptExecutor)driver).executeScript("arguments[0].click();", ele);	    
					    Actions action = new Actions(driver);
		       		    action.moveToElement(ele).build().perform();
		       			driver.switchTo().activeElement();
		 				WebElement das = driver.findElement(By.xpath("//li[text()='Filter by Job']"));
		 				das.click();
		 				Thread.sleep(4000);
	                    result = true;
	                    break;
	            } catch(StaleElementReferenceException e) {
	            }
	            attempts++;
	        }
	        return result;
	           
	            }
	        @SuppressWarnings("deprecation")
	        public void selectDateRange() throws InterruptedException{
		       WebDriverWait wait = new WebDriverWait(driver, 40);
			   WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-btn ant-btn-icon-only']/i[@aria-label='icon: minus-square-o']"))); 
			  ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
			   WebDriverWait wait1 = new WebDriverWait(driver, 40);
				WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-btn ant-btn-icon-only']/i[@aria-label='icon: arrows-alt']"))); 
				((JavascriptExecutor)driver).executeScript("arguments[0].click();", element1);
				@SuppressWarnings("deprecation")
				WebDriverWait wait2 = new WebDriverWait(driver, 40);
				WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[1]//ul[1]//li[2]//ul[1]//li[3]//span[2]//span[1]"))); 
				((JavascriptExecutor)driver).executeScript("arguments[0].click();", element2);
				WebDriverWait wait3 = new WebDriverWait(driver, 40);
				WebElement element4 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[class='ant-btn ant-btn-primary']"))); 
				((JavascriptExecutor)driver).executeScript("arguments[0].click();", element4);
				WebDriverWait wait5 = new WebDriverWait(driver, 40);
				WebElement element5 = wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='uf-employee-label-container line-clamp'][normalize-space()='bharat']"))); 
				((JavascriptExecutor)driver).executeScript("arguments[0].click();", element5);
				String name =element5.getText();
				System.out.println(name);   
	     }
}
