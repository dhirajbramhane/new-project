package com.thirtybees.objrepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MugPageObjectRepo {

	@FindBy(xpath = "//ul[@id='color_to_pick_list']//li//a")
	protected List<WebElement> mugColor;
	
	@FindBy(xpath = "//a[@title='White']")
	protected WebElement whiteColor;
	
	@FindBy(xpath = "//a[@title='Black']")
	protected WebElement blackColor;
	
	@FindBy(xpath = "//a[@title='Increase']")
	protected WebElement addMugQty;
	
	@FindBy(xpath = "//button[@name='Submit']")
	protected WebElement addToCartBtn;
	
	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	protected WebElement ProceedToCheckoutBtn;
	
	@FindBy(xpath = "//a[contains(text(), 'Continue')]")
	protected WebElement continueShoppingBtn;
	
	
	
	
}
