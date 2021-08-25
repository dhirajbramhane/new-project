package com.thirtybees.objrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderObjectRepo {

	//page objects
		@FindBy(xpath = "//div[@id='shop-logo']//img")
		protected WebElement logo;
		
		@FindBy(id = "search_query_top")
		protected WebElement searchTextbox;
		
		@FindBy(xpath = "//button[@name='submit_search']")
		protected WebElement searchSubmitBtn;
		
		@FindBy(xpath = "//a[@class='login']")
		protected WebElement signInLink;
		
		@FindBy(xpath = "//a[@class='dropdown-toggle']")
		protected WebElement englishdropdown;
		
		@FindBy(id = "blockcart-header")
		protected WebElement myCart;
		
		@FindBy(xpath = "//a[text()='Coffee and Tea']")
		protected WebElement coffeeAndTea;
		
		@FindBy(xpath = "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/child::li[2]")
		protected WebElement tea;
		
		@FindBy(xpath = "//a[text()='Coffee']")
		protected WebElement coffeeSubMenu;
		
		@FindBy(xpath = "//ul[@class='submenu-container clearfix first-in-line-xs']//li[2]")
		protected WebElement teaSubMenu;
		
		@FindBy(xpath = "//li[@class='category-thumbnail']/child::div[1]//img")
		protected WebElement coffeeAndTeaImg;
		
		@FindBy(xpath = "//li[@class='category-thumbnail']/child::div[2]//img")
		protected WebElement coffeeAndTeaImg2;
		

	
}
