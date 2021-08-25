package com.pageTest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.thirtybees.pages.CandlePage;
import com.thirtybees.pages.HomePage;

public class CandlePageTest extends TestBase {
	HomePage hp;
	CandlePage cp;
	
	@BeforeMethod
	public void setUp() {
		try {
			initialization();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		hp=new HomePage(driver);
		cp=new CandlePage(driver);
		hp.navigateToCandlePage();
		
	}
	
	@AfterMethod
	public void tearDown() {
		//driver.close();
	}
	
	@Test(priority=1)
	public void validatePageTitle() {
		String actTitle=cp.verifyPageTitle();
		String expTitle="Candle - BEE";
		Assert.assertEquals(actTitle, expTitle);
	}
	
	@Test(priority=2)
	public void validateDatasheet() {
		Assert.assertTrue(cp.verifyDatasheet());
	}
	
	@Test(priority=4)
	public void validatenavigateToTwitter() {
		Assert.assertTrue(cp.navigateToTwitter());
	}
	
	@Test(priority=3)
	public void validateContinueShopping() {
		String actTitle=cp.verifyContinueShopping();
		String expTitle="Candle - BEE";
		Assert.assertEquals(actTitle, expTitle);
	}
	
	@Test(priority = 5)
	public void validateCheckout() {
		String actTitle=cp.verifyCheckout();
		String expTitle="Order - BEE";
		Assert.assertEquals(actTitle, expTitle);
	}
	
	
	
	
	
	
}
