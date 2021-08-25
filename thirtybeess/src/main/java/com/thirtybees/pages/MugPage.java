package com.thirtybees.pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.thirtybees.objrepository.MugPageObjectRepo;
import com.thirtybees.utility.ActionUtil;
import com.thirtybees.utility.ExcelUtil;

public class MugPage extends MugPageObjectRepo{

public WebDriver driver;
	
	public MugPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifymugColors() {
		System.out.println("Actual color data from website ");
		ArrayList<String> actColor=new ArrayList<String>();
		for(WebElement color: mugColor) {
			String colorName=color.getAttribute("title");
			actColor.add(colorName);
		}
		System.out.println("Mug color are "+ actColor);
		System.out.println("expected color data from excel ");
		ArrayList<String> expColor=ExcelUtil.getAllData(System.getProperty("user.dir")+"\\src\\test\\resources\\TestData.xlsx", "Colors");
		System.out.println("Mug color are "+ expColor);
		if(actColor.equals(expColor)) {
			return true;
		}
		return false;
	}
	
	public String verifyCheckout() {
		ActionUtil.click(whiteColor);
		ActionUtil.click(addMugQty);
		ActionUtil.click(addToCartBtn);
		ActionUtil.click(ProceedToCheckoutBtn);
		return driver.getTitle();
	}
	
	public String verifyContinueShopping() {
		ActionUtil.click(blackColor);
		ActionUtil.click(addMugQty);
		ActionUtil.click(addToCartBtn);
		ActionUtil.click(continueShoppingBtn);
		return driver.getTitle();
	}
}
