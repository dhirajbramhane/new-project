package com.thirtybees.objrepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class BlogRepository {
	
	@FindBy(xpath="//span[text()='All posts']")
	 protected WebElement allPostBtn;
	
	@FindBy(xpath="//div[@class='beesblog-post-info']")
	 protected WebElement blogPostDetails;
	
	@FindBy(xpath="//img[@alt='Organic Gifts']")
	 protected WebElement imageOfBlog;
	
	
	@FindBy(xpath="//p/button")
	 protected List<WebElement> socialMediaSharingBtn;
	
	

}
