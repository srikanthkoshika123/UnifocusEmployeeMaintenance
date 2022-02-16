package com.pack.loginPages;

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

@SuppressWarnings("deprecation")
public class C32968 extends TC_BaseClass {
	WebDriver ldriver;

	public C32968(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	@FindBy(className = "app-iframe")
	WebElement frame;
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/button[1]")
	WebElement unifocus;
	@FindBy(xpath = "//div[@class='input-renderer error input-string-renderer ']//div")
	WebElement certifictionName;
	@FindBy(xpath = "//div[@class='ant-tabs-tab-active ant-tabs-tab']//div//i[@aria-label='icon: close']//*[name()='svg']")
	WebElement close;

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
		WebElement employee = wait1
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Employee')]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", employee);
		WebDriverWait wait2 = new WebDriverWait(driver, 40);
		WebElement certifiction = wait2
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@title='Certifications']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", certifiction);
		driver.switchTo().frame(frame);
	}

	public void clickAddRowButton() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement addRow = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Add Row')]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", addRow);
	}

	public boolean selectAutocert1() throws InterruptedException {
		boolean result = false;
		int attempts = 0;
		while (attempts < 2) {
			try {
				driver.switchTo().activeElement();
				WebElement certifictionName = driver
						.findElement(By.xpath("//div[@row-index='0']//div[@aria-colindex='1']"));
				Thread.sleep(2000);
				certifictionName.sendKeys("autocert1");
				Thread.sleep(2000);
				certifictionName.sendKeys("utocert1");
				Thread.sleep(2000);
				certifictionName.sendKeys(Keys.ENTER);
				result = true;
				break;
			} catch (StaleElementReferenceException e) {
			}
			attempts++;
		}
		return result;
	}
	public void clickAddRowButton1() throws InterruptedException {
        Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement addRow = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Add Row')]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", addRow);
	}
	public boolean clickAutocert2() throws InterruptedException {
		 clickAddRowButton();
		boolean result = false;
		int attempts = 0;
		while (attempts < 2) {
			try {
				driver.switchTo().activeElement();
				WebElement certifictionName = driver
						.findElement(By.xpath("//div[@row-index='0']//div[@aria-colindex='1']"));
				Thread.sleep(2000);
				certifictionName.sendKeys("gutocert2");
				certifictionName.sendKeys("utocert2");
				certifictionName.sendKeys(Keys.ENTER);
				result = true;
				break;
			} catch (StaleElementReferenceException e) {
			}
			attempts++;
		}
		return result;
	}

	public void clickLaborStructure() {
		driver.switchTo().defaultContent();
		close.click();
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

	public void ExpandAutoJob() throws InterruptedException {
		EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(driver);
		eventFiringWebDriver.executeScript("document.querySelector('div[ref=\"eBodyViewport\"]').scrollTop=700");
		Thread.sleep(4000);
		WebDriverWait wait1 = new WebDriverWait(driver, 40);
		WebElement expanddivision = wait1.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[@row-index='20']//span[@class='ag-icon ag-icon-contracted']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", expanddivision);
		WebDriverWait wait2 = new WebDriverWait(driver, 40);
		WebElement expandDivision = wait2.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[@row-index='21']//span[@class='ag-icon ag-icon-contracted']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", expandDivision);

	}

	public boolean doubleClickAutoJob1() throws InterruptedException {
		boolean result = false;
		int attempts = 0;
		while (attempts < 2) {
			try {
				
				driver.switchTo().activeElement();
				Actions action = new Actions(driver);
				WebElement department = driver.findElement(By.xpath("//div[@row-index='22']//span[text()='Auto Job1']"));
				action.moveToElement(department).click().build().perform();
				Thread.sleep(4000);
				department.click();
				result = true;
				break;
			} catch (StaleElementReferenceException e) {
			}
			attempts++;
		}
		return result;
	}

	public void clickAddJob() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//button[@class='ant-btn ant-dropdown-trigger']//span[contains(text(),'Add')]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", ele);
		Actions action = new Actions(driver);
		action.moveToElement(ele).build().perform();
		driver.switchTo().activeElement();
		WebElement addJob = driver.findElement(By.xpath("//li[normalize-space()='Add Job']"));
		Thread.sleep(4000);
		addJob.click();

	}

	public boolean doubleClickJob() throws InterruptedException {
		boolean result = false;
		int attempts = 0;
		while (attempts < 2) {
			try {
				EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(driver);
				eventFiringWebDriver.executeScript("document.querySelector('div[ref=\"eBodyViewport\"]').scrollTop=800");
				Thread.sleep(4000);
				driver.switchTo().activeElement();
				Actions action = new Actions(driver);
				WebElement department = driver.findElement(By.xpath("//div[@row-index='23']"));
				action.moveToElement(department).doubleClick(department).build().perform();
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
		editDepartment.sendKeys("Auto Job2");
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
				WebElement code = driver.findElement(By.xpath("//div[@row-index='23']//div[@aria-colindex='2']"));
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
		editCode.sendKeys("Auto Job2");
		editCode.sendKeys(Keys.ENTER);

	}

	public void horizontalScrollView() throws InterruptedException {
		EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(driver);
		eventFiringWebDriver.executeScript("document.querySelector('div[ref=\"eBodyViewport\"]').scrollTop=900");
		Thread.sleep(4000);
	}

	public boolean doubleClickCertifiction() throws InterruptedException {
		boolean result = false;
		int attempts = 0;
		while (attempts < 2) {
			try {
				driver.switchTo().activeElement();
				Actions action = new Actions(driver);
				WebElement code = driver.findElement(By.xpath("//div[@row-index='23']//div[@aria-colindex='14']"));
				action.moveToElement(code).doubleClick().build().perform();
				result = true;
				break;
			} catch (StaleElementReferenceException e) {
			}
			attempts++;
		}
		return result;
	}

	public void selectCheckBox() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement checkBox = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@row-index='0']/div[2]/div/label")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkBox);
		WebDriverWait wait1 = new WebDriverWait(driver, 40);
		WebElement ok = wait1
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-btn ant-btn-primary']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", ok);

	}
}
