package com.thirtybees.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.thirtybees.objrepository.HomeRepository;
import com.thirtybees.utility.ActionUtil;
import com.thirtybees.utility.ExcelUtil;
import com.thirtybees.utility.ExcelUtils;
import com.thirtybees.utility.WIndowHandles;

public class HomePage extends HomeRepository {

	public WebDriver driver;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	public void navigateToLoginPage() {
		ActionUtil.click(signInLink);
	}
	
	
	public CandlePage navigateToCandlePage() {
		candleImg.click();
		return new CandlePage(driver);	
	}
	
	public SoapPage navigateToSoapPage() {
		soapImg.click();
		return new SoapPage(driver);	
	}
	
	public MugPage navigateToMugPage() {
		mugImg.click();
		return new MugPage(driver);	
	}
	
	public String verifyLabelOfCandle() {
		String actText=candle.getText();
		return actText;
	}
	
	public String verifyLabelOfSoap() {
		String actText=soap.getText();
		return actText;
	}
	
	public boolean verifyBlogHeaders() {
		ArrayList<String> actHeader=new ArrayList<String>();
		for(WebElement header: blogHeaders) {
			actHeader.add(header.getText());	
		}
		System.out.println("Actual blog headers are "+actHeader);
		
		ArrayList<String> expHeader=ExcelUtil.getAllData(System.getProperty("user.dir")+"\\src\\test\\resources\\TestData.xlsx", "Blog headers");
		System.out.println("Expected blog headers are "+expHeader);
		
		if(actHeader.equals(expHeader)) {
			return true;
		}
		return false;
	}
	
	public boolean verifySliderHeading() {
		ArrayList<String> actHeader=new ArrayList<String>();
		System.out.println("Actual slider heading from website");
		for(WebElement header: sliderHeading) {
			actHeader.add(header.getText());
			ActionUtil.click(nextBtn);
			System.out.println(actHeader);
		}System.out.println(actHeader);
		/*
		 * System.out.println("Expected slider heading from website"); ArrayList<String>
		 * expHeader=ExcelUtil.getAllData(System.getProperty("user.dir")+
		 * "\\src\\test\\resources\\TestData.xlsx", "Blog headers");
		 */
		return false;
		
		
	}
	
	
	public String header() {
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].scrollIntoView();", header);
		String actHearder = header.getText();
		return actHearder;

	}

	public String shopnowbtn() {
		String window= null;
		String mainWindows = driver.getWindowHandle();
		for (WebElement webElement : shopnowbtn) {
			if (webElement.isDisplayed()) {
				webElement.click();
			 window=driver.getWindowHandle();    
				}
		}
		
		return window;
	}
	public boolean marketplacePageLink(WebDriver driver) {
		Actions action = new Actions(driver);
		action.moveToElement(marketplacelink).build().perform();;;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		driver.navigate().back();
		driver.switchTo().parentFrame();
		 return true;
		
	}
	public String actSubHeader() {
		String actSubHearder = subHeader.getText();
		return actSubHearder;

	}

	public String  actBlogHeader() {
		String actHearder = blogSectnHeader.getText();
		return actHearder;

	}

	public String  expBlogHeader() {
		String expHearder =ExcelUtils.getData(System.getProperty("user.dir") +"/src/main/resources/BlogSections.xls", "BlogSection", 2, 1);
		return expHearder;
                                                    
	}

	
	public String actblogSubHeader() {
		String actSubHearder = ExcelUtils.getData(System.getProperty("user.dir") +"/src/main/resources/BlogSections.xls", "BlogSection", 4, 1);
		return actSubHearder;

	}

	
	
	public String expblogSubHeader() {
		String actSubHearder = blogSubHeader.getText();
		return actSubHearder;

	}
	
	public ArrayList<String> actBlogTitles() {
		ArrayList<String> actTitles= new ArrayList<String>();
		for (WebElement webElement : blogtitles) {
			String titles=webElement.getText();
			actTitles.add(titles);
		}
		
		return actTitles;

	}

	
	public ArrayList<String> expBlogTitles() {
		//ArrayList<String> actTitles= new ArrayList<String>();
		ArrayList<String> actTitles =ExcelUtils.getDataFromRow(System.getProperty("user.dir") +"/src/main/resources/BlogSections.xls", "BlogSection", 6);
		System.out.println(actTitles);
		return actTitles;

	}
	
	public WebElement readMorebtn() {
		return readmorebtn ;

	}

}
