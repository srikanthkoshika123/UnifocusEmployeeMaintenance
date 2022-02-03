package com.pack.testCases;



import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.pack.loginPages.LoginPage;
import com.pack.utils.ReadConfig;

public class TC_BaseClass {
	ReadConfig readconfig=new ReadConfig();
	public String url =readconfig.getApplicationUrl();
	public String partnerCode = readconfig.getPartnerCode();
	public String loginas =readconfig.getUserName();
	public String Password =readconfig.getPassword();
	public static WebDriver driver ;
	
    public static Logger logger;	
     
  
 @SuppressWarnings("deprecation")
@Parameters("browser")
    
  @BeforeMethod
	
	public void setup(String browser) throws Exception {
		 logger=logger.getLogger("unifocusScheduler");
		PropertyConfigurator.configure("log.properties.txt");
		
		if(browser.equals("chrome")) {
	
		System.setProperty("webdriver.chrome.driver",readconfig.getChromepath());
		ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		 driver = new ChromeDriver(chromeOptions);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		 
		}
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//Drivers//geckodriver.exe");
			 driver = new FirefoxDriver();
				JavascriptExecutor js = (JavascriptExecutor) driver;
			}
		else if(browser.equals("ie")) {
			System.setProperty("webdriver.ie.driver",readconfig.getIEpath());
			 driver = new InternetExplorerDriver();
			}
		  driver.get(url);
		  driver.manage().window().maximize(); 
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		  LoginPage lp=new LoginPage(driver);
		  lp.setPartnerCode(partnerCode);
		  lp.clickNext();
		  logger.info("enter user name");
		  lp.setUserName(loginas);
		  	logger.info("password entered");
		  lp.setPassWord(Password);
		  Thread.sleep(4000);
		  lp.clickSignIn();
		  logger.info("signin clicked");
		 
		 
    }
	
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/screenShots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	
	 @AfterMethod
	   	public void tearDown() throws Exception {
	   		//ScreenRecorderUtil.stopRecord();  
	   		driver.quit();
	   		
	   	} 

}
