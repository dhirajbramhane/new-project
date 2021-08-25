package com.thirtybees.pages;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.thirtybees.utility.ActionUtil;
import com.thirtybees.utility.DriverUtil;
import com.thirtybees.utility.ExcelUtil;
import com.thirtybees.utility.SelectUtil;

public class CandlePage extends com.thirtybees.objrepository.CandlePageObjectRepo {
	public WebDriver driver;

	public CandlePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void decreaseScentQuantity() {
		ActionUtil.click(quantityDesceaseBtn);
	}

	public String verifyCheckout() {
		SelectUtil.selectByText(scent, "Puffin");
		SelectUtil.selectByText(scentSize, "16 oz");
		ActionUtil.click(quantityIncreaseBtn);
		ActionUtil.click(addToCartBtn);
		ProceedToCheckoutBtn.click();
		return driver.getTitle();
	}

	public String verifyPageTitle() {
		return driver.getTitle();
	}

	//ask to mam/sir
	public boolean navigateToTwitter() {
		String mainWin = driver.getWindowHandle();
		twitterIcon.click();
		//DriverUtil.waitForElement(twitterIcon, 30);
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(twitterIcon));
		
		Set<String> winId = driver.getWindowHandles();
		for (String win : winId) {
			if (!win.equals(mainWin)) {
				driver.switchTo().window(win);
				driver.manage().timeouts().pageLoadTimeout(70, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
				driver.findElement(By.xpath("//input[@name='session[username_or_email]']")).sendKeys("9658639852");
				driver.findElement(By.xpath("//input[@name='session[password]']")).sendKeys("fdfd@521");
				String childTitle = driver.findElement(By.tagName("title")).getText();
				// String title=driver.switchTo().window(win).getTitle();
				System.out.println("Title of child window is " + childTitle);
				driver.close();
				driver.switchTo().window(mainWin);
				return true;
			}
			
			String titleMainwin = driver.switchTo().window(mainWin).getTitle();
			System.out.println("Title of parent window is " + titleMainwin);
		}
		return false;
	}

	public boolean verifyDatasheet() {
		System.out.println("Actual data from website");
		ArrayList<String> actData = new ArrayList<String>();
		for (WebElement data : tableData) {
			actData.add(data.getText());
		}
		System.out.println("Actual table data " + actData);

		System.out.println("Expected data from Excel");
		ArrayList<String> expData=ExcelUtil.getAllData(System.getProperty("user.dir")+"\\src\\test\\resources\\TestData.xlsx", "Data sheet");
		System.out.println("Expected table data " + expData);

		if (actData.equals(expData)) {
			return true;
		}
		return false;
	}

	public String verifyContinueShopping() {
		SelectUtil.selectByText(scent, "Puffin");
		SelectUtil.selectByText(scentSize, "24 oz");
		ActionUtil.click(quantityIncreaseBtn);
		ActionUtil.click(addToCartBtn);
		ActionUtil.click(continueShoppingBtn);
		return driver.getTitle();
	}
		
		

}
