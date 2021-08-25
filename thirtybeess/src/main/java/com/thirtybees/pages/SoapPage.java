package com.thirtybees.pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.thirtybees.objrepository.SoapPageObjectRepo;
import com.thirtybees.utility.ActionUtil;
import com.thirtybees.utility.ExcelUtil;
import com.thirtybees.utility.SelectUtil;

public class SoapPage extends SoapPageObjectRepo {
	public WebDriver driver;

	public SoapPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String verifyCheckout() {
		SelectUtil.selectByText(bodyWashProduct, "Conditioner");
		ActionUtil.click(quantityIncreaseBtn);
		ActionUtil.click(addToCartBtn);
		ActionUtil.click(ProceedToCheckoutBtn);
		return driver.getTitle();
	}

	public String verifyContinueShopping() {
		SelectUtil.selectByText(bodyWashProduct, "Shampoo");
		ActionUtil.click(quantityIncreaseBtn);
		ActionUtil.click(quantityDesceaseBtn);
		ActionUtil.click(addToCartBtn);
		ActionUtil.click(continueShoppingBtn);
		return driver.getTitle();
	}

	public boolean verifyDataSheet() {
		System.out.println("Actual soap data sheet from website");
		ArrayList<String> actList = new ArrayList<String>();
		for (WebElement data : tableData) {
			actList.add(data.getText());
		}
		System.out.println("Expected soap data sheet from excel ");
		ArrayList<String> expList = ExcelUtil.getAllData(
				System.getProperty("user.dir") + "\\src\\test\\resources\\TestData.xlsx", "Soap Data Sheet");

		if (actList.equals(expList)) {
			return true;
		}
		return false;
	}
}
