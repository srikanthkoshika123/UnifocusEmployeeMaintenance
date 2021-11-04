package com.pack.testCases;



import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.pack.loginPages.LoginPage;
import com.pack.utils.ReadConfig;

import recordingTests.ScreenRecorderUtil;

public class TC_BaseClass {
	ReadConfig readconfig=new ReadConfig();
	public String url =readconfig.getApplicationUrl();
	public String partnerCode = readconfig.getPartnerCode();
	public String loginas =readconfig.getUserName();
	public String Password =readconfig.getPassword();
	public String emp="001234";
	public static WebDriver driver ;
	
    public static Logger logger;	
     
  
 @Parameters("browser")
    
  @BeforeClass
	
	public void setup(String browser) throws Exception {
		 logger=logger.getLogger("unifocusScheduler");
		PropertyConfigurator.configure("log.properties.txt");
		
		if(browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver",readconfig.getChromepath());
		 driver = new ChromeDriver();
		 
		}
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxpath());
			 driver = new FirefoxDriver();
			}
		else if(browser.equals("ie")) {
			System.setProperty("webdriver.ie.driver",readconfig.getIEpath());
			 driver = new InternetExplorerDriver();
			}
		  driver.get(url);
		  driver.manage().window().maximize(); 
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  ScreenRecorderUtil.startRecord("AddEmployee");
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    	LoginPage lp=new LoginPage(driver);
	    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    	lp.setPartnerCode(partnerCode);
	    	lp.clickNext();
		    logger.info("enter user name");
		    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	     	lp.setUserName(loginas);
	     	logger.info("password entered");
	        lp.setPassWord(Password);
			Thread.sleep(2000);
	    	lp.clickSignIn();
	    	logger.info("signin clicked");
	    	Thread.sleep(2000);
	    	lp.clickUnifocus();
	        lp.getselect_List();
		 
    }
	
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/screenShots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	
	@AfterClass
	public void tearDown() throws Exception {
		ScreenRecorderUtil.stopRecord();  
		driver.quit();
		
	}
	

}
