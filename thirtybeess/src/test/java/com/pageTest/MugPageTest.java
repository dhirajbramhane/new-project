package com.pageTest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.thirtybees.pages.HomePage;
import com.thirtybees.pages.MugPage;

public class MugPageTest extends TestBase{
	HomePage hp;
	MugPage mp;
	
	@BeforeClass
	public void setUp() throws InterruptedException {
		initialization();
		hp=new HomePage(driver);
		mp=new MugPage(driver);
		hp.navigateToMugPage();
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
	
	
	@Test(priority = 1)
	public void validatemugColors() {
		Assert.assertTrue(mp.verifymugColors());
	}
	
	@Test(priority = 2)
	public void validateContinueShopping() {
		String actTitle=mp.verifyContinueShopping();
		String expTitle="Mug - BEE";
		Assert.assertEquals(actTitle, expTitle);
	}
	
	@Test(priority = 3)
	public void validateCheckout() {
		String actTitle=mp.verifyCheckout();
		String expTitle="Order - BEE";
		Assert.assertEquals(actTitle, expTitle);
	}
	
	
}
