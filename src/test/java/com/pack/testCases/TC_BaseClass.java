package com.pack.testCases;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TC_BaseClass {
	public String url ="https://security-portal.unifocus.com";
	public String partnerCode = "secpoc";
	public String loginas = "testpoc";
	public String Password = "pr00fC0nc3pt";
	public String scheduler="Scheduling";
	public static WebDriver driver ;
    public static Logger logger;	

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 logger=logger.getLogger("unifocusScheduler");
		PropertyConfigurator.configure("log.properties.txt");
		}
	@AfterClass
	public void tearDown() {
		driver.quit();
		
	}
	

}
