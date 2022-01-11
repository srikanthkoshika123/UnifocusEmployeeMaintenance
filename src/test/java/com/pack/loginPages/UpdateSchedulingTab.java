package com.pack.loginPages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pack.testCases.TC_BaseClass;

public class UpdateSchedulingTab extends TC_BaseClass{
		WebDriver ldriver;
		public UpdateSchedulingTab(WebDriver 	rdriver){
	    	ldriver=rdriver;
	    	PageFactory.initElements(rdriver, this);       	  		
		
	}
		@FindBy(className="app-iframe")
		WebElement frame;
		
		@FindBy(xpath="//div[@row-index='0']/div[@aria-colindex='1']")
		WebElement empName;
		@FindBy(xpath="//span[normalize-space()='Scheduling']")
		WebElement scheduling;
		@FindBy(xpath="//div[@id='type']")
		WebElement employeeType;
		@FindBy(xpath="//li[normalize-space()='Regular']")
		WebElement regular;
		@FindBy(xpath="//section[2]/div[1]/div[1]/div[1]/div[1]/button[1]")
		WebElement addShift;
		@FindBy(xpath="//div[contains(@class,'ant-col ant-col-9')]//div[1]//div[2]//div[1]//span[1]//span[1]//input[1]")
		WebElement startTime;
		@FindBy(xpath="//div[contains(@class,'ant-col ant-col-9')]//div[2]//div[2]//div[1]//span[1]//span[1]//input[1]")
		WebElement endTime;
		@FindBy(xpath="//div[@id='job']")
		WebElement jobType;
		@FindBy(xpath="//li[normalize-space()='Door Person']")
		WebElement jobName;
		@FindBy(xpath="//button[@class='ant-btn ant-btn-primary']")
		WebElement clickAdd;
		@FindBy(xpath="//div[@class='ag-cell ag-cell-not-inline-editing ag-cell-with-height ag-cell-value ag-cell-focus'][@col-id='THURSDAY']")
		WebElement rightClick;
		@FindBy(xpath="//input[@id='override']")
		WebElement overRide;
		@FindBy(xpath="//section[2]//div[1]//div[1]//div[1]//div[1]//button[2]")
		WebElement edit;
		@FindBy(xpath="//button[@class='ant-btn ant-btn-primary']")
		WebElement save;
		
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
			WebDriverWait wait1 = new WebDriverWait(driver, 40);
			 WebElement employeeType = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='type']"))); 
			 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", employeeType);
			
			WebDriverWait wait2 = new WebDriverWait(driver, 40);
			 WebElement regular = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='Regular']"))); 
			 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", regular);
			
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
		public void selectCheckBoxes(String starttime,String endtime,String day5,String day6,String day7,String day8) throws InterruptedException {
			Thread.sleep(4000);
			addShift.click();
			startTime.sendKeys(starttime);
			endTime.sendKeys(endtime);
			List<WebElement> checkBoxes = driver.findElements(By.xpath("//div[@id='days']/label/span/input"));
			 int size = checkBoxes.size();
			    for(int i = 0; i<size; i++) {
			        
			        String value = checkBoxes.get(i).getAttribute("value");
			        
			        if(value.equalsIgnoreCase(day5)){
			            
			        	checkBoxes.get(i).click();
			        	Thread.sleep(6000);
			            break;
			            
			        }   
			    }
			   
				        List<WebElement> checkBoxes2= driver.findElements(By.xpath("//div[@id='days']/label/span/input"));
						 int size2 = checkBoxes2.size();
						    for(int i = 0; i<size2; i++) {
						        
						        String value = checkBoxes2.get(i).getAttribute("value");
						        
						        if(value.equalsIgnoreCase(day6)){
						            
						        	checkBoxes2.get(i).click();
						        	Thread.sleep(6000);
						            break;
						            
						        } 
				        
				    }
						    List<WebElement> checkBoxes3 = driver.findElements(By.xpath("//div[@id='days']/label/span/input"));
							 int size3 = checkBoxes3.size();
							    for(int i = 0; i<size3; i++) {
							        
							        String value = checkBoxes3.get(i).getAttribute("value");
							        
							        if(value.equalsIgnoreCase(day7)){
							            
							        	checkBoxes3.get(i).click();
							        	Thread.sleep(6000);
							            break;
							            
							        }
				    
							    }
							    List<WebElement> checkBoxes4 = driver.findElements(By.xpath("//div[@id='days']/label/span/input"));
								 int size4 = checkBoxes4.size();
								    for(int i = 0; i<size4; i++) {
								        
								        String value = checkBoxes4.get(i).getAttribute("value");
								        
								        if(value.equalsIgnoreCase(day8)){
								            
								        	checkBoxes4.get(i).click();
								        	Thread.sleep(6000);
								            break;
								            
								        }
					    
								    }	    
					
					WebElement overRide =driver.findElement(By.xpath("//input[@id='override']")); 
					Thread.sleep(6000);
					overRide.click();	   
				    WebDriverWait wait1 = new WebDriverWait(driver, 40);
					WebElement clickAdd = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-btn ant-btn-primary']"))); 
					Thread.sleep(4000);
					clickAdd.click();
					Thread.sleep(4000);
					 WebDriverWait wait2 = new WebDriverWait(driver, 40);
					 WebElement ok = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='ant-modal-body']//button[2]"))); 
					((JavascriptExecutor)driver).executeScript("arguments[0].click();", ok);
					
		}
		public boolean clickDayShift(String day9) throws InterruptedException {
			
			 boolean result = false;
		        int attempts = 0;
		        while(attempts < 2) {
		            try {
		            	driver.switchTo().activeElement();
		        		Actions action = new Actions(driver);
		        		WebElement doubleClick =driver.findElement(By.xpath("//section[2]//div//div[3]//div//div//div//div//div[2]//div[1]//div[3]//div[2]//div/div//div[@role='row'][@row-index='0'][@aria-rowindex='2']//div[@col-id='"+day9+"']"));
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
	
			 public void clickEdit(String starttime,String endtime) throws InterruptedException {
				/* WebDriverWait wait = new WebDriverWait(driver, 40);
				 WebElement editShift = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//section[2]//div[1]//div[1]//div[1]//div[1]//button[2]"))); 
				 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", editShift);*/
				
			    startTime.sendKeys(Keys.CONTROL+ "a");
				startTime.sendKeys(Keys.DELETE);
				startTime.sendKeys(starttime);
				
				endTime.sendKeys(Keys.CONTROL+ "a");
				endTime.sendKeys(Keys.DELETE);
				endTime.sendKeys(endtime);
			WebDriverWait wait3 = new WebDriverWait(driver, 40);
			 WebElement save = wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-btn ant-btn-primary']"))); 
			 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", save);
			
		}
			 public boolean clickShiftDay(String day10) throws InterruptedException {
				 boolean result = false;
			        int attempts = 0;
			        while(attempts < 2) {
			            try {
			            	driver.switchTo().activeElement();
			        		Actions action = new Actions(driver);
			        		WebElement doubleClick =driver.findElement(By.xpath("//section[2]//div//div[3]//div//div//div//div//div[2]//div[1]//div[3]//div[2]//div/div//div[@role='row'][@row-index='0'][@aria-rowindex='2']//div[@col-id='"+day10+"']"));
			        		Thread.sleep(2000);
			        		action.moveToElement(doubleClick).click().build().perform();
			                result = true;
			                break;
			            } catch(StaleElementReferenceException e) {
			            }
			            attempts++;
			        }
			        return result;
			} 
			 public void clickDeleteSelectedShifts() throws InterruptedException {
					WebDriverWait wait1 = new WebDriverWait(driver, 40);
				    WebElement delete = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//section[2]//div[1]//div[1]//div[1]//div[1]//button[3]"))); 
					((JavascriptExecutor)driver).executeScript("arguments[0].click();", delete);
					
					WebDriverWait wait3 = new WebDriverWait(driver, 40);
					 WebElement DeleteShift = wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[normalize-space()='Delete Selected Shift']"))); 
					 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", DeleteShift);
					
					WebDriverWait wait4 = new WebDriverWait(driver, 40);
					 WebElement clickOk = wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-btn ant-btn-primary']"))); 
					 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", clickOk);
					
					
				}
			 public boolean clickDeleteShift(String day11) throws InterruptedException {
				 boolean result = false;
			        int attempts = 0;
			        while(attempts < 2) {
			            try {
			            	driver.switchTo().activeElement();
			        		Actions action = new Actions(driver);
			        		WebElement doubleClick =driver.findElement(By.xpath("//section[2]//div//div[3]//div//div//div//div//div[2]//div[1]//div[3]//div[2]//div/div//div[@role='row'][@row-index='0'][@aria-rowindex='2']//div[@col-id='"+day11+"']"));
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
		public void clickDelete() throws InterruptedException {
			WebDriverWait wait1 = new WebDriverWait(driver, 40);
			 WebElement Delete = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Delete Shift']"))); 
			 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", Delete);
				WebDriverWait wait2 = new WebDriverWait(driver, 40);
				 WebElement ok = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-btn ant-btn-primary']"))); 
				 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", ok);
		}
			public void clickDeleteAllShifts() throws InterruptedException {
			WebDriverWait wait1 = new WebDriverWait(driver, 40);
		    WebElement delete = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//section[2]//div[1]//div[1]//div[1]//div[1]//button[3]"))); 
			((JavascriptExecutor)driver).executeScript("arguments[0].click();", delete);
			
			WebDriverWait wait3 = new WebDriverWait(driver, 40);
			 WebElement DeleteShift = wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[normalize-space()='Delete All Shifts']"))); 
			 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", DeleteShift);
			
			WebDriverWait wait4 = new WebDriverWait(driver, 40);
			 WebElement clickOk = wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-btn ant-btn-primary']"))); 
			 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", clickOk);
			
			
		}
			public void selectPermanent(String starttime,String endtime,String day12) throws InterruptedException {
				WebDriverWait wait3 = new WebDriverWait(driver, 40);
				 WebElement addShift = wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//section[2]/div[1]/div[1]/div[1]/div[1]/button[1]"))); 
				 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", addShift);
                  Thread.sleep(4000);
					startTime.sendKeys(starttime);
					endTime.sendKeys(endtime);
					WebDriverWait wait4 = new WebDriverWait(driver, 40);
					 WebElement jobType = wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='job']"))); 
					 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", jobType);
					
					 List<WebElement> checkBoxes1 = driver.findElements(By.xpath("//div[@id='days']/label/span/input"));
					 int size1 = checkBoxes1.size();
					    for(int i = 0; i<size1; i++) {
					        
					        String value = checkBoxes1.get(i).getAttribute("value");
					        
					        if(value.equalsIgnoreCase(day12)){
					            
					        	checkBoxes1.get(i).click();
					        	
					            break;
					            
					        }
					        
					        
					    }
					    WebDriverWait wait6 = new WebDriverWait(driver, 40);
						 WebElement clickAdd = wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-btn ant-btn-primary']"))); 
						 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", clickAdd);
						 
						 WebDriverWait wait1 = new WebDriverWait(driver, 40);
						 WebElement employeeType = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='type']"))); 
						 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", employeeType);
							
						WebDriverWait wait2 = new WebDriverWait(driver, 40);
						WebElement Permanent= wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='Permanent']"))); 
						((JavascriptExecutor)driver).executeScript("arguments[0].click();", Permanent);
					   
			}
			    public void selectVariableType(String EmployeeType) throws InterruptedException{
				 WebDriverWait wait1 = new WebDriverWait(driver, 40);
				 WebElement employeeType = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='type']"))); 
				 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", employeeType);
					
				  List<WebElement> jobType = driver.findElements(By.xpath("//ul[@class='ant-select-dropdown-menu  ant-select-dropdown-menu-root ant-select-dropdown-menu-vertical']/li"));
		     	     
		     	     for(int i = 0; i<=jobType.size()-1; i++) {
		     	         if(jobType.get(i).getText().contains(EmployeeType)) {
		     	        	 Thread.sleep(4000);
		     	        	jobType.get(i).click();
		     	             break;     
		     	         }
		     	     }
		     	    WebDriverWait wait4 = new WebDriverWait(driver, 40);
					 WebElement clickOk = wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-btn ant-btn-primary']"))); 
					 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", clickOk);
					 WebDriverWait wait5 = new WebDriverWait(driver, 40);
					 WebElement informationSaved = wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Scheduling Information Saved')]"))); 
					 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", informationSaved);
					 String name =informationSaved.getText();
					 System.out.println(name);
					
			}
			        public void EmployeeType() {
			    	 WebDriverWait wait1 = new WebDriverWait(driver, 40);
					 WebElement employeeType = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='type']"))); 
					 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", employeeType);
					 WebDriverWait wait2 = new WebDriverWait(driver, 40);
					 WebElement Permanent= wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='Variable']"))); 
					 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", Permanent);
			    	
			    }
			
		}

