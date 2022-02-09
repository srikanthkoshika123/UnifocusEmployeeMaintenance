package com.pack.loginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.pack.testCases.TC_BaseClass;

public class AdminstrationTest extends TC_BaseClass {
	WebDriver ldriver;

	public AdminstrationTest(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(className = "app-iframe")
	WebElement frame;
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/button[1]")
	WebElement unifocus;
	@FindBy(xpath = "//span[contains(text(),'Administration')]")
	WebElement Adminstration;
	@FindBy(xpath = "//li[@title='Audits']")
	WebElement Audits;
	@FindBy(xpath = "//ul[@id='ADMIN$Menu']//li[@title='Employee Maintenance']")
	WebElement EmployeeMaintenance;
	@FindBy(xpath = "//ul[@id='ADMIN$Menu']//li[@title='My Processes']")
	WebElement MyProcesses;
	@FindBy(xpath = "//div[@class='ant-tabs-tab-active ant-tabs-tab']//div//i[@aria-label='icon: close']//*[name()='svg']")
	WebElement close;
	
	public void clickUnifocus() {
		unifocus.click();
		String un = unifocus.getText();
		System.out.println(un);
		Assert.assertEquals("UniFocus", un);
		driver.manage().window().maximize();
		Adminstration.click();
	}

	public void audit() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement Audits = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//li[@title='Audits']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", Audits);
		driver.switchTo().frame(frame);
		WebDriverWait wait1 = new WebDriverWait(driver, 120);
		WebElement filter = wait1.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//button[@class='ant-btn audit-main-filter-button ant-btn-primary']")));
		String un = filter.getText();
		System.out.println(un);
		Assert.assertEquals("Filters", un);

		WebDriverWait wait2 = new WebDriverWait(driver, 120);
		WebElement excel = wait2
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Export to Excel']")));
		String ex = excel.getText();
		System.out.println(ex);
		Assert.assertEquals("Export to Excel", ex);
        Thread.sleep(4000);
		driver.switchTo().defaultContent();
		close.click();

	}

	public void employeeMaintenance() throws InterruptedException {
		clickUnifocus();
		EmployeeMaintenance.click();
		driver.switchTo().frame(frame);
		WebDriverWait wait = new WebDriverWait(driver, 120);
		WebElement addNew = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Add New']")));
		String add = addNew.getText();
		System.out.println(add);
		Assert.assertEquals("Add New", add);

		WebDriverWait wait1 = new WebDriverWait(driver, 120);
		WebElement general = wait1
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='General']")));
		String ge = general.getText();
		System.out.println(ge);
		Assert.assertEquals("General", ge);
		WebDriverWait wait2 = new WebDriverWait(driver, 40);
		WebElement Audits = wait2.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//button[@class='ant-btn uf-actionbar-menu-button ant-dropdown-trigger uf-actionbar-dropdown']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", Audits);
		WebDriverWait wait3 = new WebDriverWait(driver, 40);
		WebElement reconcileEmployees = wait3.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//li[normalize-space()='Reconcile Employees']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", reconcileEmployees);
		Thread.sleep(18000);
		driver.switchTo().defaultContent();
		close.click();
	}
	public void EditPayRates() throws InterruptedException {
		driver.switchTo().frame(frame);
		WebDriverWait wait2 = new WebDriverWait(driver, 40);
		WebElement Audits = wait2.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//button[@class='ant-btn uf-actionbar-menu-button ant-dropdown-trigger uf-actionbar-dropdown']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", Audits);
		WebDriverWait wait3 = new WebDriverWait(driver, 40);
		WebElement reconcileEmployees = wait3.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//li[normalize-space()='Edit Pay Rates']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", reconcileEmployees);
		Thread.sleep(18000);
		driver.switchTo().defaultContent();
		close.click();
	}
	public void manageEmployeeBadges() throws InterruptedException {
		driver.switchTo().frame(frame);
		WebDriverWait wait2 = new WebDriverWait(driver, 40);
		WebElement Audits = wait2.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//button[@class='ant-btn uf-actionbar-menu-button ant-dropdown-trigger uf-actionbar-dropdown']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", Audits);
		WebDriverWait wait3 = new WebDriverWait(driver, 40);
		WebElement reconcileEmployees = wait3.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//li[normalize-space()='Manage Employee Badges']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", reconcileEmployees);
		Thread.sleep(18000);
		driver.switchTo().defaultContent();
		close.click();
		close.click();
	}
	public void myProcesses() throws InterruptedException {
		clickUnifocus();
		MyProcesses.click();
		driver.switchTo().frame(frame);
		WebDriverWait wait = new WebDriverWait(driver, 120);
		WebElement mps = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[normalize-space()='My Processes']")));
		String processes = mps.getText();
		System.out.println(processes);
		Assert.assertEquals("My Processes", processes);
		Thread.sleep(4000);
	}
}
