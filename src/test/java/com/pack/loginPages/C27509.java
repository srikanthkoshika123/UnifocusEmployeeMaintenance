package com.pack.loginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.pack.testCases.TC_BaseClass;
@SuppressWarnings("deprecation")
public class C27509 extends TC_BaseClass{
		WebDriver ldriver;

		public C27509(WebDriver rdriver) {
			ldriver = rdriver;
			PageFactory.initElements(rdriver, this);

		}
		@FindBy(className = "app-iframe")
		WebElement frame;
		@FindBy(xpath = "//header/div[1]/div[1]/div[1]/button[1]")
		WebElement unifocus;
		@FindBy(xpath = "//div[@class='ant-tabs-tab-active ant-tabs-tab']//div//i[@aria-label='icon: close']//[name()='svg']//[name()='path' and contains(@d,'M563.8 512')]")
		WebElement close;
		@FindBy(xpath = "//span[text()='Setup']")
		WebElement setup;
		@FindBy(xpath = "//li[@title='Earning Types']")
		WebElement earningtypes;
		@FindBy(xpath = "//li[@title='Flow Patterns']")
		WebElement flowpatterns;
		@FindBy(xpath = "//li[@title='Flow Plans']")
		WebElement flowplans;
		@FindBy(xpath = "//li[@title='Forecast Structure']")
		WebElement forecastst;
		@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/span[1]/*[name()='svg'][1]")
		WebElement market;
		@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/span[1]/*[name()='svg'][1]")
		WebElement revenue;
		@FindBy(xpath = "//li[@title='Interfaces']")
		WebElement interfaces;
		@FindBy(xpath = "//li[@title='Labor Standards']")
		WebElement labourstandards;
		@FindBy(xpath = "//li[@title='Labor Structure']")
		WebElement labourstructure;
		@FindBy(xpath = "//li[@title='Mobile Configuration']")
		WebElement mobileconfig;
		@FindBy(xpath = "//li[@title='Work Rules']")
		WebElement workrules;
		
		
		public void clickUnifocus() {
			unifocus.click();
			String un = unifocus.getText();
			System.out.println(un);
			Assert.assertEquals("UniFocus", un);
			setup.click();
		}
		public void earningtypes() {
			driver.switchTo().frame(frame);
			WebDriverWait wait= new WebDriverWait(driver, 120);
			WebElement details= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@title='Details']")));
		    String de = details.getText();
		    System.out.println(de);
			Assert.assertEquals("Details", de);
	      
	        WebDriverWait wait1= new WebDriverWait(driver, 120);
			WebElement type= wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='Type:']")));
		    String td = type.getText();
		    System.out.println(td);
			Assert.assertEquals("Type:", td);
			driver.switchTo().defaultContent();
			close.click();
			System.out.println(driver.findElement(By.xpath("//div[text()='Earning Types']")).getText());
		}
		public void flowpatterns() {
			unifocus.click();
			setup.click();
			driver.switchTo().frame(frame);
			flowpatterns.click();
			WebDriverWait wait= new WebDriverWait(driver, 120);
			WebElement flowpattern= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Flow Pattern']")));
		    String button = flowpattern.getText();
		    System.out.println(button);
			Assert.assertEquals("Flow Pattern", button);
	       
	        WebDriverWait wait1= new WebDriverWait(driver, 120);
			WebElement per= wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Details - Percentage']")));
		    String dp = per.getText();
		    System.out.println(dp);
			Assert.assertEquals("Details - Percentage", dp);
			driver.switchTo().defaultContent();
			close.click();
			System.out.println(driver.findElement(By.xpath("//div[text()='Flow Patterns']")).getText());
			
		}
		public void flowplans() {
			unifocus.click();
			setup.click();
			driver.switchTo().frame(frame);
			flowplans.click();
			WebDriverWait wait= new WebDriverWait(driver, 120);
			WebElement fp= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@title='Flow Plans']")));
			fp.click();
			WebDriverWait wait1= new WebDriverWait(driver, 120);
			WebElement flowpattern= wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Flow Plan']")));
		    String button = flowpattern.getText();
		    System.out.println(button);
			Assert.assertEquals("Flow Plan", button);
	      
	        WebDriverWait wait2= new WebDriverWait(driver, 120);
			WebElement per= wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@role='columnheader'][normalize-space()='Flow Plan']")));
		    String dp = per.getText();
		    System.out.println(dp);
			Assert.assertEquals("Flow Plan", dp);
			driver.switchTo().defaultContent();
	        close.click();
			System.out.println(driver.findElement(By.xpath("//div[text()='Flow Plans']")).getText());
		}
		public void forecaststructure() {
			unifocus.click();
			setup.click();
			forecastst.click();
			driver.switchTo().frame(frame);
			
			WebDriverWait wait= new WebDriverWait(driver, 120);
			WebElement k= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='KBIs']")));
		    String kbis = k.getText();
		    System.out.println(kbis);
			Assert.assertEquals("KBIs", kbis);
		   
		    WebDriverWait wait1= new WebDriverWait(driver, 120);
			WebElement add= wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ant-btn-group']//button[1]")));
		    String button = add.getText();
			Assert.assertEquals(true,add.isDisplayed());
			System.out.println("add button is displayed");

			WebDriverWait wait2= new WebDriverWait(driver, 120);
			WebElement n= wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Name']")));
		    String name = n.getText();
		    System.out.println(name);
			Assert.assertEquals("Name", name);
			driver.switchTo().defaultContent();
			
		}
		public void market() {
			
				market.click();
				WebDriverWait wait= new WebDriverWait(driver, 120);
				WebElement mg= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Market Groups']")));
			    String margr = mg.getText();
			    System.out.println(margr);
				Assert.assertEquals("Market Groups", margr);
			   
			    WebDriverWait wait1= new WebDriverWait(driver, 120);
				WebElement add1= wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='ant-btn ant-dropdown-trigger']")));
			    String button1 = add1.getText();
				Assert.assertEquals(true,add1.isDisplayed());
				System.out.println("add1 dropdown is displayed");

				WebDriverWait wait2= new WebDriverWait(driver, 120);
				WebElement delete1= wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[1]//div[1]//div[1]//div[1]//div[3]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//button[1]//[name()='svg']//[name()='path' and contains(@fill,'currentCol')]")));
			    String name1 = delete1.getText();
			    System.out.println("delete is displayed");
				Assert.assertEquals(true,delete1.isDisplayed());
			
		}
		public void revenue() {
			
				revenue.click();
				WebDriverWait wait= new WebDriverWait(driver, 120);
				WebElement re= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Revenue Centers']")));
			    String revenue = re.getText();
			    System.out.println(revenue);
				Assert.assertEquals("Revenue Centers", revenue);
			   
			    WebDriverWait wait1= new WebDriverWait(driver, 120);
				WebElement adddrop= wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='ant-btn ant-dropdown-trigger']")));
			    String button2 = adddrop.getText();
				Assert.assertEquals(true,adddrop.isDisplayed());
				System.out.println("add1 dropdown is displayed");

				WebDriverWait wait2= new WebDriverWait(driver, 120);
				WebElement delete2= wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[1]//div[1]//div[1]//div[1]//div[3]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//button[1]//[name()='svg']//[name()='path' and contains(@fill,'currentCol')]")));
			    String del = delete2.getText();
			    System.out.println("deelete is displayed");
				Assert.assertEquals(true,delete2.isDisplayed());
		        driver.switchTo().defaultContent();
			
			    close.click();
		        System.out.println(driver.findElement(By.xpath("//div[text()='Forecast Structure']")).getText());
		}
		public void interfaces() {
			unifocus.click();
			setup.click();
			interfaces.click();
			driver.switchTo().frame(frame);
			WebDriverWait wait= new WebDriverWait(driver, 120);
			WebElement infbu= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='uf-tri-area-inner-left']//button[@type='button']")));
		    String addinterafce = infbu.getText();
			Assert.assertEquals(true,infbu.isDisplayed());
			System.out.println("addinterface is displayed");
			 
			WebDriverWait wait1= new WebDriverWait(driver, 120);
			WebElement in= wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Interface Name']")));
		    String interfacebar = in.getText();
			Assert.assertEquals(true,in.isDisplayed());
			System.out.println("interfacebar is displayed");
			
			driver.switchTo().defaultContent();
			close.click();
			System.out.println(driver.findElement(By.xpath("//div[text()='Interfaces'")).getText());
		}
		public void labourstandarads() {
			unifocus.click();
			setup.click();
			interfaces.click();
			labourstandards.click();
			driver.switchTo().frame(frame);
			WebDriverWait wait= new WebDriverWait(driver, 120);
			WebElement sl= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@title='Select Levels']")));
		    String selectlevels = sl.getText();
			Assert.assertEquals(true,sl.isDisplayed());
			System.out.println("selectlevels is displayed");
			 
			WebDriverWait wait1= new WebDriverWait(driver, 120);
			WebElement ls1= wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Labor Structure']")));
		    String labstr = ls1.getText();
			System.out.println(labstr);
	        Assert.assertEquals("Labor Structure", labstr);
	        
	        WebDriverWait wait2= new WebDriverWait(driver, 120);
			WebElement ss= wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Standard Set:']")));
		    String sset = ss.getText();
			System.out.println(sset);
	        Assert.assertEquals("Standard Set:", sset);
		   
			driver.switchTo().defaultContent();
			close.click();
			System.out.println(driver.findElement(By.xpath("//div[text()='Labor Standards']")).getText());
		}
		public void labourstructure() {
			unifocus.click();
			setup.click();
			labourstructure.click();
			driver.switchTo().frame(frame);
			WebDriverWait wait= new WebDriverWait(driver, 120);
			WebElement add= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='ant-btn ant-dropdown-trigger']")));
		    String adddropdown = add.getText();
			Assert.assertEquals(true,add.isDisplayed());
			System.out.println("adddropdown is displayed");
			 
			WebDriverWait wait1= new WebDriverWait(driver, 120);
			WebElement pd= wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Property Default']")));
		    String prde = pd.getText();
			System.out.println(prde);
	        Assert.assertEquals("Property Default", prde);
	     
			driver.switchTo().defaultContent();
			close.click();	
		    System.out.println(driver.findElement(By.xpath("//div[text()='Labor Structure']")).getText());
			
		}
		public void mobileconfig() {
			unifocus.click();
			setup.click();
			mobileconfig.click();
			driver.switchTo().frame(frame);
			WebDriverWait wait= new WebDriverWait(driver, 120);
			WebElement sr= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Scheduling and Requests']")));
		    String schandreq = sr.getText();
			System.out.println(schandreq);
	        Assert.assertEquals("Scheduling and Requests ", schandreq);
		
			WebDriverWait wait1= new WebDriverWait(driver, 120);
			WebElement reg= wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Registration']")));
		    String  registr= reg.getText();
		    System.out.println(registr);
	        Assert.assertEquals("Registration",registr);
	     
	        WebDriverWait wait2= new WebDriverWait(driver, 120);
			WebElement i= wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Invitation Expiration (days):']")));
		    String  invitation= i.getText();
		    System.out.println(invitation);
	        Assert.assertEquals("Invitation Expiration (days):",invitation);

			driver.switchTo().defaultContent();
			close.click();	
			System.out.println(driver.findElement(By.xpath("//div[text()='Mobile Configuration']")).getText());
			
			
		}
		public void workrules() {
			unifocus.click();
			setup.click();
			workrules.click();
			driver.switchTo().frame(frame);
			
			WebDriverWait wait= new WebDriverWait(driver, 120);
			WebElement td= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Type:']")));
		    String type = td.getText();
			System.out.println(type);
	        Assert.assertEquals("Type:", type);
		
			WebDriverWait wait1= new WebDriverWait(driver, 120);
			WebElement addrule= wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Add Rule Item']")));
		    String  arbutton= addrule.getText();
		    System.out.println(arbutton);
	        Assert.assertEquals("Add Rule Item",arbutton);
	        
	        driver.switchTo().defaultContent();
	        close.click();	
			System.out.println(driver.findElement(By.xpath("//div[text()='Work Rules']")).getText());
			driver.close();
			
		}
	}

