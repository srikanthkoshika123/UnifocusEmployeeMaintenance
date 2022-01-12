package com.pack.loginPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
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

public class UpdateEmployeeAvailability extends TC_BaseClass {
	WebDriver ldriver;
	public UpdateEmployeeAvailability(WebDriver 	rdriver){
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);       	  		
	
}
	@FindBy(className="app-iframe")
	WebElement frame;
	@FindBy(xpath="//div[@row-index='0']/div[@aria-colindex='1']")
	WebElement empName;
	@FindBy(xpath="//section[2]/div[1]/div[1]/div[1]/div[1]/button[1]")
	WebElement addShift;
	@FindBy(xpath="//div[contains(@class,'ant-col ant-col-9')]//div[1]//div[2]//div[1]//span[1]//span[1]//input[1]")
	WebElement startTime;
	@FindBy(xpath="//div[contains(@class,'ant-col ant-col-9')]//div[2]//div[2]//div[1]//span[1]//span[1]//input[1]")
	WebElement endTime;
	@FindBy(xpath="//header/div[1]/div[1]/div[1]/button[1]")
	WebElement unifocus;
	@FindBy(xpath="//span[text()='Labor']")
    WebElement labor;
	@FindBy(xpath="//li[@title='Scheduling']")
    WebElement scheduling;
	
	public void switchFrame() throws InterruptedException {
		driver.switchTo().frame(frame);
		}
	public void selectEmployee(String empId) throws InterruptedException {
		 WebDriverWait wait=new WebDriverWait(driver, 120);
		 WebElement searchEmp= wait.until(
		 ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@placeholder,'Name or EmpID')]")));
		Thread.sleep(8000);
		//searchEmp.click();
		searchEmp.clear();
		searchEmp.sendKeys(empId);
		Thread.sleep(6000);
		empName.click();
		WebDriverWait wait2 = new WebDriverWait(driver, 40);
	    WebElement scheduling = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Scheduling']"))); 
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", scheduling);
		
		
	}
	public void selectEmployeeType() throws InterruptedException {
		WebDriverWait wait3 = new WebDriverWait(driver, 40);
		 WebElement addShift = wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//section[2]/div[1]/div[1]/div[1]/div[1]/button[1]"))); 
		 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", addShift);
		
		
	}
	public void selectShiftTime(String starttime,String endtime) throws InterruptedException {
		Thread.sleep(4000);
		startTime.sendKeys(starttime);
		endTime.sendKeys(endtime);
		WebDriverWait wait1 = new WebDriverWait(driver, 40);
		 WebElement jobType = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='job']"))); 
		 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", jobType);
		
	}
	public void selectCheckBoxs(String day1,String day2) throws InterruptedException {
      
		List<WebElement> checkBoxes = driver.findElements(By.xpath("//div[@id='days']/label/span/input"));
		 int size = checkBoxes.size();
		    for(int i = 0; i<size; i++) {
		        
		        String value = checkBoxes.get(i).getAttribute("value");
		        
		        if(value.equalsIgnoreCase(day1)){
		            
		        	checkBoxes.get(i).click();
		        	
		            break;
		            
		        }   
		    }
	
	 List<WebElement> checkBoxes1 = driver.findElements(By.xpath("//div[@id='days']/label/span/input"));
			 int size1 = checkBoxes.size();
			    for(int i = 0; i<size1; i++) {
			        
			        String value = checkBoxes1.get(i).getAttribute("value");
			        
			        if(value.equalsIgnoreCase(day2)){
			            
			        	checkBoxes1.get(i).click();
			        	
			            break;
			            
			        }
			        
			        
			    }
			    WebDriverWait wait5 = new WebDriverWait(driver, 40);
				 WebElement clickAdd = wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-btn ant-btn-primary']"))); 
				 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", clickAdd);
			   
	}
	
	 public boolean doubleClick(String day3) throws InterruptedException {
	        boolean result = false;
	        int attempts = 0;
	        while(attempts < 2) {
	            try {
	            	driver.switchTo().activeElement();
	        		Actions action = new Actions(driver);
	        		WebElement doubleClick =driver.findElement(By.xpath("//section[2]//div//div[3]//div//div//div//div//div[2]//div[1]//div[3]//div[2]//div/div//div[@role='row'][@row-index='0'][@aria-rowindex='2']//div[@col-id='"+day3+"']"));
	        		Thread.sleep(2000);
	        		action.moveToElement(doubleClick).doubleClick().build().perform();
	                result = true;
	                break;
	            } catch(StaleElementReferenceException e) {
	            }
	            attempts++;
	        }
	        return result;
	}
	public void clickEmptyCell(String starttime,String endtime) throws InterruptedException {
		
		startTime.sendKeys(starttime);
		endTime.sendKeys(endtime);
		
		 WebDriverWait wait2 = new WebDriverWait(driver, 40);
		 WebElement jobType = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='job']"))); 
		 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", jobType);

		 WebDriverWait wait1 = new WebDriverWait(driver, 40);
		 WebElement clickAdd = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-btn ant-btn-primary']"))); 
		 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", clickAdd);	
	}
	public boolean rightClick(String day4) throws InterruptedException {
		 boolean result = false;
	        int attempts = 0;
	        while(attempts < 2) {
	            try {
	            	driver.switchTo().activeElement();
	        		Actions action = new Actions(driver);
	        		WebElement doubleClick =driver.findElement(By.xpath("//section[2]//div//div[3]//div//div//div//div//div[2]//div[1]//div[3]//div[2]//div/div//div[@role='row'][@row-index='0'][@aria-rowindex='2']//div[@col-id='"+day4+"']"));
	        		Thread.sleep(2000);
	        		action.moveToElement(doubleClick).contextClick().build().perform();
	                result = true;
	                break;
	            } catch(StaleElementReferenceException e) {
	            }
	            attempts++;
	        }
	        return result;
	}
	@SuppressWarnings("deprecation")
	public void clickAddShift(String editStart,String editEnd) {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		 WebElement addShift = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Add Shift']"))); 
		 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", addShift);
		 
		startTime.sendKeys(Keys.CONTROL+ "a");
		startTime.sendKeys(Keys.DELETE);
		startTime.sendKeys(editStart);
		
		endTime.sendKeys(Keys.CONTROL+ "a");
		endTime.sendKeys(Keys.DELETE);
		endTime.sendKeys(editEnd);
		
		 WebDriverWait wait2 = new WebDriverWait(driver, 40);
		 WebElement jobType = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='job']"))); 
		 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", jobType);
		
	   WebDriverWait wait1 = new WebDriverWait(driver, 40);
	   WebElement clickAdd = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-btn ant-btn-primary']"))); 
	  ((JavascriptExecutor)driver).executeScript("arguments[0].click();", clickAdd);
}
	 public boolean doubleClick1(String day3) throws InterruptedException {
	        boolean result = false;
	        int attempts = 0;
	        while(attempts < 2) {
	            try {
	            	driver.switchTo().activeElement();
	        		Actions action = new Actions(driver);
	        		WebElement doubleClick =driver.findElement(By.xpath("//section[2]//div//div[3]//div//div//div//div//div[2]//div[1]//div[3]//div[2]//div/div//div[@role='row'][@row-index='0'][@aria-rowindex='2']//div[@col-id='"+day3+"']"));
	        		Thread.sleep(2000);
	        		action.moveToElement(doubleClick).doubleClick().build().perform();
	                result = true;
	                break;
	            } catch(StaleElementReferenceException e) {
	            }
	            attempts++;
	        }
	        return result;
	}
	public void clickEmptyCell1(String starttime,String endtime) throws InterruptedException {
		
		startTime.sendKeys(starttime);
		endTime.sendKeys(endtime);
		
		 WebDriverWait wait2 = new WebDriverWait(driver, 40);
		 WebElement jobType = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='job']"))); 
		 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", jobType);

		 WebDriverWait wait1 = new WebDriverWait(driver, 40);
		 WebElement clickAdd = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-btn ant-btn-primary']"))); 
		 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", clickAdd);	
		  driver.switchTo().defaultContent();
		  WebElement close=driver.findElement(By.xpath("//div[@class='ant-tabs-nav-container']//div[2]//div[1]//i[@aria-label='icon: close']"));
		  close.click();
	}
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
	        public void selectDateRange(String filterJob,String dynamicName) throws InterruptedException{
		       WebDriverWait wait = new WebDriverWait(driver, 40);
			   WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-btn ant-btn-icon-only']/i[@aria-label='icon: minus-square-o']"))); 
			  ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
			   WebDriverWait wait1 = new WebDriverWait(driver, 40);
				WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-btn ant-btn-icon-only']/i[@aria-label='icon: arrows-alt']"))); 
				((JavascriptExecutor)driver).executeScript("arguments[0].click();", element1);
				@SuppressWarnings("deprecation")
				WebDriverWait wait2 = new WebDriverWait(driver, 40);
				WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(filterJob)));
				 Coordinates cor=((Locatable) element2).getCoordinates();
			     cor.inViewPort();
			     Thread.sleep(1000);
				((JavascriptExecutor)driver).executeScript("arguments[0].click();", element2);
				WebDriverWait wait3 = new WebDriverWait(driver, 40);
				WebElement element4 = wait3.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[class='ant-btn ant-btn-primary']"))); 
				((JavascriptExecutor)driver).executeScript("arguments[0].click();", element4);
				WebDriverWait wait6 = new WebDriverWait(driver, 40);
				WebElement date = wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='unifocus-selectdropdown ant-select ant-select-enabled']"))); 
				((JavascriptExecutor)driver).executeScript("arguments[0].click();", date);
				WebDriverWait wait7 = new WebDriverWait(driver, 40);
				WebElement dateRange = wait7.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='12/25/21 - 1/7/22']"))); 
				((JavascriptExecutor)driver).executeScript("arguments[0].click();", dateRange);
				WebDriverWait wait5 = new WebDriverWait(driver, 40);
				WebElement element5 = wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='uf-employee-label-container line-clamp'][normalize-space()='"+dynamicName+"']"))); 
				 Coordinates cor1=((Locatable) element5).getCoordinates();
			     cor1.inViewPort();
			     Thread.sleep(1000);
				((JavascriptExecutor)driver).executeScript("arguments[0].click();", element5);
				String name =element5.getText();
				System.out.println(name);
				Thread.sleep(8000);
	     }
	        public void selectEmployee1(String empId) throws InterruptedException {
	   		 WebDriverWait wait=new WebDriverWait(driver, 120);
	   		 WebElement searchEmp= wait.until(
	   		 ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@placeholder,'Name or EmpID')]")));
	   		Thread.sleep(8000);
	   		//searchEmp.click();
	   		searchEmp.clear();
	   		searchEmp.sendKeys(empId);
	   		Thread.sleep(6000);
	   		empName.click();
	   		WebDriverWait wait2 = new WebDriverWait(driver, 40);
	   	    WebElement scheduling = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Scheduling']"))); 
	   		((JavascriptExecutor)driver).executeScript("arguments[0].click();", scheduling);
	   		
	   		
	   	}
}
