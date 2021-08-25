package com.thirtybees.objrepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SoapPageObjectRepo {

	@FindBy(xpath = "//select[@id='group_2']")
	protected WebElement bodyWashProduct;
	
	@FindBy(xpath = "//a[@title='Decrease']")
	protected WebElement quantityDesceaseBtn;
	
	@FindBy(xpath = "//a[@title='Increase']")
	protected WebElement quantityIncreaseBtn;
	
	@FindBy(name = "Submit")
	protected WebElement addToCartBtn;
	
	@FindBy(xpath = "//span[text()='Home']")
	protected WebElement home;
	
	@FindBy(className = "btn btn-xs btn-twitter")
	protected WebElement twitterIcon;
	
	@FindBy(className = "btn btn-xs btn-facebook")
	protected WebElement facebookIcon;
	
	@FindBy(xpath = "//ul[@id='thumbs_list_frame']//li[1]")
	protected WebElement honeyBodyWash;
	
	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	protected WebElement ProceedToCheckoutBtn;
	
	@FindBy(xpath = "//a[contains(text(), 'Continue')]")
	protected WebElement continueShoppingBtn;
	
	@FindBy(xpath = "//td")
	protected List<WebElement> tableData;
	
}
