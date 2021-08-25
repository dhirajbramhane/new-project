package com.thirtybees.objrepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CandlePageObjectRepo {

	@FindBy(xpath = "//select[@id='group_5']")
	protected WebElement scent;
	
	@FindBy(xpath = "//select[@id='group_4']")
	protected WebElement scentSize;
	
	@FindBy(xpath = "//a[@title='Decrease']")
	protected WebElement quantityDesceaseBtn;
	
	@FindBy(xpath = "//a[@title='Increase']")
	protected WebElement quantityIncreaseBtn;
	
	@FindBy(name = "Submit")
	protected WebElement addToCartBtn;
	
	@FindBy(xpath = "//span[text()='Home']")
	protected WebElement home;
	
	@FindBy(xpath = "//button[@data-type='twitter']")
	protected WebElement twitterIcon;
	
	@FindBy(className = "btn btn-xs btn-facebook")
	protected WebElement facebookIcon;
	
	@FindBy(id = "thumbnail_1")
	protected WebElement honeyScentYellow;
	
	@FindBy(id = "thumb_2")
	protected WebElement puffinScentBlack;
	
	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	protected WebElement ProceedToCheckoutBtn;
	
	@FindBy(xpath = "//a[contains(text(), 'Continue')]")
	protected WebElement continueShoppingBtn;
	
	@FindBy(tagName = "td")
	protected List<WebElement> tableData;
}
