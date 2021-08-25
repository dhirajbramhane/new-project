package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public static Logger log = Logger.getLogger(TestBase.class);
	
	public TestBase() {
		FileInputStream fis;
		try {
			prop = new Properties();
			fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\config.properties");
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static String readProperty(String key) {
		 log.info("reading a value for a prooerty: "+key);
		Properties ps = new Properties();
		try {
			log.info("initializing property file");
			FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/config.properties");
			ps.load(file);
		} catch (IOException e) {
			log.error("Invalid property file path");
			e.printStackTrace();
		}
		log.info("property value found in the file with key as: "+key+"and value is : "+ps.getProperty(key));
		return ps.getProperty(key);

	}

	public static WebDriver initialization() throws InterruptedException {
		log.info("initializating browser");
		if (readProperty("browser").equalsIgnoreCase("Chrome")) {
			log.info("User wabts to automate with chrome browser");
			System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (readProperty("browser").equalsIgnoreCase("firefox")) {
			log.info("user wants to automate with firefox browser");
			System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if  (readProperty("browser").equalsIgnoreCase("IE")){
			log.info("user wants to automate with invalid browser");
			System.setProperty("webdriver.ie.driver", "");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		log.info("launching an application");
		driver.get(readProperty("url"));
		return driver;

	}

	public static void getScreenShot(WebDriver driver, String name) {
		 log.info("test case failed and taking screenshot");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir") + "/Screenshot/" + name + ".jpg");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			e.printStackTrace();

		}
		 log.info("screenshot saved in the project directory");
	}

}
