package com.thirtybees.objrepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeRepository {
	
	
	
	@FindBy(xpath="//div/h2/span")
	 protected WebElement header;
	
	@FindBy(xpath="//button[text()='Shop now !']")
	 protected WebElement shopnowbtn;
	
	
	@FindBy(linkText="Marketplace")
	 protected WebElement marketplacelink;
	
	@FindBy(xpath="//p[text()='The best selection for top prices.']")
	protected WebElement subHeader;
	
	@FindBy(xpath="//img[@title='Candle']")
	protected WebElement productImg;
	
	@FindBy(xpath="//section/div/h2/a")
	 protected WebElement blogSectnHeader;	
	
	@FindBy(xpath="//section/div/p")
	protected WebElement blogSubHeader;
  	
	
	@FindBy(xpath="//a[@class='beesblogrecentpostshome-title']")
	   protected List<WebElement> blogtitles;
  
	@FindBy(linkText="Read More")
   protected WebElement  readmorebtn;
   

   
 
}
