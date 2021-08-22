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
import com.thirtybees.utility.ExcelUtils;

public class HomePage extends HomeRepository {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	
	public String header() {
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].scrollIntoView();", header);
		String actHearder = header.getText();
		return actHearder;

	}

	public WebElement shopnowbtn() {
		 return shopnowbtn;
		
	}
	public boolean marketplacePageLink() {
		Actions action = new Actions(driver);
		action.moveToElement(marketplacelink);
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
