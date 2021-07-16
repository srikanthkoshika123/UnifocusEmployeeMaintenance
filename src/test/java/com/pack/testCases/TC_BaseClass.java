package com.pack.testCases;



import java.io.File;
import java.io.IOException;

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
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.pack.utils.ReadConfig;

public class TC_BaseClass {
	ReadConfig readconfig=new ReadConfig();
	public String url =readconfig.getApplicationUrl();
	public String partnerCode = "secpoc";
	public String loginas = readconfig.getUserName();
	public String Password = readconfig.getPassword();
	public static WebDriver driver ;
    public static Logger logger;	
     
    
    @Parameters("browser")
    @BeforeTest
  
	
	public void setup(String browser) {
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
    }
	@AfterClass
	public void tearDown() {
		driver.quit();
		
	}
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/screenShots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	

}
