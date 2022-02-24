package com.pack.loginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pack.testCases.TC_BaseClass;
@SuppressWarnings("deprecation")
public class C33193 extends TC_BaseClass{
	WebDriver ldriver;

	public C33193(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}
	@FindBy(className = "app-iframe")
	WebElement frame;
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/button[1]")
	WebElement unifocus;
	
	public void addJob() {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement job = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Jobs']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", job);
		WebDriverWait wait1 = new WebDriverWait(driver, 40);
		WebElement addJob = wait1
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Add Job']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", addJob);
	}
	public void selectJob() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 180);
		WebElement searchJob = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search']")));
		Thread.sleep(6000);
		searchJob.clear();
		searchJob.sendKeys("Auto Div1");
		WebDriverWait wait2 = new WebDriverWait(driver, 40);
		WebElement selectjob = wait2
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@title='Expand All']//button")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", selectjob);
		Thread.sleep(6000);
		WebDriverWait wait1 = new WebDriverWait(driver, 40);
		WebElement autoJob2 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//div[@row-index='3']/div/span/span[4]/div/div/label")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", autoJob2);
		WebDriverWait wait3 = new WebDriverWait(driver, 40);
		WebElement save = wait3
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-btn ant-btn-primary']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", save);

	}
	public void selectCertifications() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement job = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[9]//span[normalize-space()='Certifications']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", job);
		WebDriverWait wait2 = new WebDriverWait(driver, 40);
		WebElement addNewCertification = wait2
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Add New Certification']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", addNewCertification);
	}

}
