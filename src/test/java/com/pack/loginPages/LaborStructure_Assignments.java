package com.pack.loginPages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.pack.testCases.TC_BaseClass;

public class LaborStructure_Assignments extends TC_BaseClass {
	WebDriver ldriver;

	public LaborStructure_Assignments(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	@FindBy(className = "app-iframe")
	WebElement frame;
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/button[1]")
	WebElement unifocus;

	public void clickUnifocus() {
		unifocus.click();
		String un = unifocus.getText();
		System.out.println(un);
		Assert.assertEquals("UniFocus", un);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement setup = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Setup')]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", setup);

		WebDriverWait wait1 = new WebDriverWait(driver, 40);
		WebElement laborStructure = wait1
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@title='Labor Structure']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", laborStructure);
	}

	public void switchFrame() throws InterruptedException {
		driver.switchTo().frame(frame);
	}

	public boolean selectPropertyDefault() throws InterruptedException {
		boolean result = false;
		int attempts = 0;
		while (attempts < 2) {
			try {
				WebDriverWait wait = new WebDriverWait(driver, 120);
				WebElement propertyDefault = wait
						.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[1]/div[@aria-colindex='1']")));
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", propertyDefault);
				result = true;
				break;
			} catch (StaleElementReferenceException e) {
			}
			attempts++;
		}
		return result;
	}

	public void clickAdd() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//button[@class='ant-btn ant-dropdown-trigger']//span[contains(text(),'Add')]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", ele);
		Actions action = new Actions(driver);
		action.moveToElement(ele).build().perform();
		driver.switchTo().activeElement();
		WebElement addDivision = driver.findElement(By.xpath("//li[contains(text(),'Add Division')]"));
		addDivision.click();
		  @SuppressWarnings("deprecation")
		EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(driver);
		eventFiringWebDriver.executeScript("document.querySelector('div[ref=\"eBodyViewport\"]').scrollTop=600");
		
		
	}

	public boolean doubleClick() throws InterruptedException {
		boolean result = false;
		int attempts = 0;
		while (attempts < 4) {
			try {
				driver.switchTo().activeElement();
				Actions action = new Actions(driver);
				WebElement doubleClick = driver.findElement(By.xpath("//div/span/span[text()='Division 1']"));
				action.moveToElement(doubleClick).doubleClick().build().perform();
				result = true;
				break;
			} catch (StaleElementReferenceException e) {
			}
			attempts++;
		}
		return result;
	}

	public void changeNameDivision() {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement editName = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Division 1']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", editName);
		editName.sendKeys(Keys.CONTROL + "a");
		editName.sendKeys(Keys.DELETE);
		editName.sendKeys("Auto Div1");
		WebDriverWait wait1 = new WebDriverWait(driver, 40);
		WebElement ok = wait1
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-btn ant-btn-primary']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", ok);
	}

	public boolean doubleClickCode() throws InterruptedException {
		boolean result = false;
		int attempts = 0;
		while (attempts < 2) {
			try {
				driver.switchTo().activeElement();
				Actions action = new Actions(driver);
				WebElement code = driver.findElement(By.xpath("//div[contains(text(),'Division 1')]"));
				action.moveToElement(code).doubleClick().build().perform();
				result = true;
				break;
			} catch (StaleElementReferenceException e) {
			}
			attempts++;
		}
		return result;
	}

	public void EditCode() {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement editCode = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Division 1']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", editCode);
		editCode.sendKeys(Keys.CONTROL + "a");
		editCode.sendKeys(Keys.DELETE);
		editCode.sendKeys("Auto Div1");
		editCode.sendKeys(Keys.ENTER);
	}

	public void clickAddDepatment() {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//button[@class='ant-btn ant-dropdown-trigger']//span[contains(text(),'Add')]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", ele);
		Actions action = new Actions(driver);
		action.moveToElement(ele).build().perform();
		driver.switchTo().activeElement();
		WebElement addDivision = driver.findElement(By.xpath("//li[normalize-space()='Add Department']"));
		addDivision.click();
		WebDriverWait wait1 = new WebDriverWait(driver, 40);
		WebElement expandDivision = wait1.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[@row-index='20']//span[@class='ag-icon ag-icon-contracted']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", expandDivision);

	}

	public boolean doubleClickDepatment() throws InterruptedException {
		boolean result = false;
		int attempts = 0;
		while (attempts < 4) {
			try {
				driver.switchTo().activeElement();
				Actions action = new Actions(driver);
				WebElement department = driver.findElement(By.xpath("//span[text()='Department1']"));
				action.moveToElement(department).doubleClick().build().perform();
				result = true;
				break;
			} catch (StaleElementReferenceException e) {
			}
			attempts++;
		}
		return result;
	}

	public void changeNameDepartment() {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement editDepartment = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Department1']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", editDepartment);
		editDepartment.sendKeys(Keys.CONTROL + "a");
		editDepartment.sendKeys(Keys.DELETE);
		editDepartment.sendKeys("Auto Dep1");
		WebDriverWait wait1 = new WebDriverWait(driver, 40);
		WebElement ok = wait1
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-btn ant-btn-primary']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", ok);
	}

	public boolean doubleClickDepartmentCode() throws InterruptedException {
		boolean result = false;
		int attempts = 0;
		while (attempts < 4) {
			try {
				driver.switchTo().activeElement();
				Actions action = new Actions(driver);
				WebElement code = driver.findElement(By.xpath("//div[contains(text(),'Department1')]"));
				action.moveToElement(code).doubleClick().build().perform();
				result = true;
				break;
			} catch (StaleElementReferenceException e) {
			}
			attempts++;
		}
		return result;
	}

	public void EditDepartmentCode() {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement editCode = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Department1']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", editCode);
		editCode.sendKeys(Keys.CONTROL + "a");
		editCode.sendKeys(Keys.DELETE);
		editCode.sendKeys("Auto Dept1");
		editCode.sendKeys(Keys.ENTER);
	}

	public void clickAddJob() {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//button[@class='ant-btn ant-dropdown-trigger']//span[contains(text(),'Add')]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", ele);
		Actions action = new Actions(driver);
		action.moveToElement(ele).build().perform();
		driver.switchTo().activeElement();
		WebElement addJob = driver.findElement(By.xpath("//li[normalize-space()='Add Job']"));
		addJob.click();
		WebDriverWait wait1 = new WebDriverWait(driver, 40);
		WebElement expandDivision = wait1.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[@row-index='21']//span[@class='ag-icon ag-icon-contracted']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", expandDivision);

	}

	public boolean doubleClickJob() throws InterruptedException {
		boolean result = false;
		int attempts = 0;
		while (attempts < 4) {
			try {
				driver.switchTo().activeElement();
				Actions action = new Actions(driver);
				WebElement department = driver.findElement(By.xpath("//div/span/span[text()='Job1']"));
				action.moveToElement(department).doubleClick().build().perform();
				result = true;
				break;
			} catch (StaleElementReferenceException e) {
			}
			attempts++;
		}
		return result;
	}

	public void changeNameJob() {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement editDepartment = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Job1']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", editDepartment);
		editDepartment.sendKeys(Keys.CONTROL + "a");
		editDepartment.sendKeys(Keys.DELETE);
		editDepartment.sendKeys("Auto job1");
		WebDriverWait wait1 = new WebDriverWait(driver, 40);
		WebElement ok = wait1
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-btn ant-btn-primary']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", ok);
	}

	public boolean doubleClickJobCode() throws InterruptedException {
		boolean result = false;
		int attempts = 0;
		while (attempts < 2) {
			try {
				driver.switchTo().activeElement();
				Actions action = new Actions(driver);
				WebElement code = driver.findElement(By.xpath("//div[contains(text(),'Job1')]"));
				action.moveToElement(code).doubleClick().build().perform();
				result = true;
				break;
			} catch (StaleElementReferenceException e) {
			}
			attempts++;
		}
		return result;
	}

	public void EditJobCode() {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement editCode = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Job1']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", editCode);
		editCode.sendKeys(Keys.CONTROL + "a");
		editCode.sendKeys(Keys.DELETE);
		editCode.sendKeys("Auto Job1");
		editCode.sendKeys(Keys.ENTER);
	}

	public void clickAddAssignment() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//button[@class='ant-btn ant-dropdown-trigger']//span[contains(text(),'Add')]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", ele);
		Actions action = new Actions(driver);
		action.moveToElement(ele).build().perform();
		driver.switchTo().activeElement();
		WebElement addJob = driver.findElement(By.xpath("//li[normalize-space()='Add Assignment']"));
		Thread.sleep(4000);
		addJob.click();

	}

	public boolean doubleClickAssignment() throws InterruptedException {
		WebDriverWait wait1 = new WebDriverWait(driver, 40);
		WebElement expandAssignment = wait1.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//div[@row-index='22']//span[@class='ag-icon ag-icon-contracted']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", expandAssignment);
		boolean result = false;
		int attempts = 0;
		while (attempts < 4) {
			try {
				
				driver.switchTo().activeElement();
				Actions action = new Actions(driver);
				WebElement department = driver.findElement(By.xpath("//div/span/span[text()='Assignment1']"));
				action.moveToElement(department).doubleClick().build().perform();
				result = true;
				break;
			} catch (StaleElementReferenceException e) {
			}
			attempts++;
		}
		return result;
	}

	public void changeNameAssignment() {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement editDepartment = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Assignment1']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", editDepartment);
		editDepartment.sendKeys(Keys.CONTROL + "a");
		editDepartment.sendKeys(Keys.DELETE);
		editDepartment.sendKeys("Auto Assignment1");
		WebDriverWait wait1 = new WebDriverWait(driver, 40);
		WebElement ok = wait1
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-btn ant-btn-primary']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", ok);
	}

	public boolean doubleClickAssignmentCode() throws InterruptedException {
		boolean result = false;
		int attempts = 0;
		while (attempts < 4) {
			try {
				driver.switchTo().activeElement();
				Actions action = new Actions(driver);
				WebElement code = driver.findElement(By.xpath("//div[contains(text(),'Assignment1')]"));
				action.moveToElement(code).doubleClick().build().perform();
				result = true;
				break;
			} catch (StaleElementReferenceException e) {
			}
			attempts++;
		}
		return result;
	}

	public void EditAssignmentCode() {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement editCode = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Assignment1']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", editCode);
		editCode.sendKeys(Keys.CONTROL + "a");
		editCode.sendKeys(Keys.DELETE);
		editCode.sendKeys("Auto Assignment1");
		editCode.sendKeys(Keys.ENTER);
	}

	public boolean doubleClickAutoJob1() throws InterruptedException {
		boolean result = false;
		int attempts = 0;
		while (attempts < 4) {
			try {
				driver.switchTo().activeElement();
				Actions action = new Actions(driver);
				WebElement department = driver.findElement(By.xpath("//div/span/span[text()='Auto job1']"));
				action.moveToElement(department).click().build().perform();
				result = true;
				break;
			} catch (StaleElementReferenceException e) {
			}
			attempts++;
		}
		return result;
	}
	public void clickExpandAutoJob1() throws InterruptedException {
		clickAddAssignment();
	
	}

	public boolean doubleClickAssignment2() throws InterruptedException {
		boolean result = false;
		int attempts = 0;
		while (attempts < 4) {
			try {
				
				driver.switchTo().activeElement();
				Actions action = new Actions(driver);
				WebElement department = driver.findElement(By.xpath("//span[text()='Assignment1']"));
				action.moveToElement(department).doubleClick().build().perform();
				result = true;
				break;
			} catch (StaleElementReferenceException e) {
			}
			attempts++;
		}
		return result;
	}

	public void changeNameAssignment2() {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement editDepartment = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Assignment1']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", editDepartment);
		editDepartment.sendKeys(Keys.CONTROL + "a");
		editDepartment.sendKeys(Keys.DELETE);
		editDepartment.sendKeys("Auto Assignment2");
		WebDriverWait wait1 = new WebDriverWait(driver, 40);
		WebElement ok = wait1
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-btn ant-btn-primary']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", ok);
	}

	public boolean doubleClickAssignmentCode2() throws InterruptedException {
		boolean result = false;
		int attempts = 0;
		while (attempts < 4) {
			try {
				driver.switchTo().activeElement();
				Actions action = new Actions(driver);
				WebElement code = driver.findElement(By.xpath("//div[contains(text(),'Assignment1')]"));
				action.moveToElement(code).doubleClick().build().perform();
				result = true;
				break;
			} catch (StaleElementReferenceException e) {
			}
			attempts++;
		}
		return result;
	}
	public void EditAssignmentCode2() {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement editCode = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Assignment1']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", editCode);
		editCode.sendKeys(Keys.CONTROL + "a");
		editCode.sendKeys(Keys.DELETE);
		editCode.sendKeys("Auto Assisnment2");
		editCode.sendKeys(Keys.ENTER);
	}

	public boolean doubleClickAutoJob2() throws InterruptedException {
		boolean result = false;
		int attempts = 0;
		while (attempts < 4) {
			try {
				driver.switchTo().activeElement();
				Actions action = new Actions(driver);
				WebElement department = driver.findElement(By.xpath("//div/span/span[text()='Auto job1']"));
				action.moveToElement(department).click().build().perform();
				result = true;
				break;
			} catch (StaleElementReferenceException e) {
			}
			attempts++;
		}
		return result;
	}

	public boolean doubleClickAssignment3() throws InterruptedException {
		clickAddAssignment();
		boolean result = false;
		int attempts = 0;
		while (attempts < 4) {
			try {
				driver.switchTo().activeElement();
				Actions action = new Actions(driver);
				WebElement department = driver.findElement(By.xpath("//span[text()='Assignment1']"));
				action.moveToElement(department).doubleClick().build().perform();
				result = true;
				break;
			} catch (StaleElementReferenceException e) {
			}
			attempts++;
		}
		return result;
	}

	public void changeNameAssignment3() {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement editDepartment = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Assignment1']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", editDepartment);
		editDepartment.sendKeys(Keys.CONTROL + "a");
		editDepartment.sendKeys(Keys.DELETE);
		editDepartment.sendKeys("Auto Assignment3");
		WebDriverWait wait1 = new WebDriverWait(driver, 40);
		WebElement ok = wait1
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-btn ant-btn-primary']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", ok);
	}

	public boolean doubleClickAssignmentCode3() throws InterruptedException {
		boolean result = false;
		int attempts = 0;
		while (attempts < 4) {
			try {
				driver.switchTo().activeElement();
				Actions action = new Actions(driver);
				WebElement code = driver.findElement(By.xpath("//div[contains(text(),'Assignment1')]"));
				action.moveToElement(code).doubleClick().build().perform();
				result = true;
				break;
			} catch (StaleElementReferenceException e) {
			}
			attempts++;
		}
		return result;
	}

	public void EditAssignmentCode3() {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement editCode = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Assignment1']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", editCode);
		editCode.sendKeys(Keys.CONTROL + "a");
		editCode.sendKeys(Keys.DELETE);
		editCode.sendKeys("Auto Assisnment3");
		editCode.sendKeys(Keys.ENTER);
	}

}
