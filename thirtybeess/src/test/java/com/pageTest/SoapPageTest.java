package com.pageTest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.thirtybees.pages.HomePage;
import com.thirtybees.pages.SoapPage;

public class SoapPageTest extends TestBase{

	HomePage hp;
	SoapPage sp;
	
	@BeforeClass
	public void setUp() {
		try {
			initialization();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		hp=new HomePage(driver);
		sp=new SoapPage(driver);
		hp.navigateToSoapPage();
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
	
	@Test(priority=3)
	public void validateCheckout() {
		String actTitle=sp.verifyCheckout();
		String expTitle="Order - BEE";
		Assert.assertEquals(actTitle, expTitle);
	}
	
	@Test(priority=1)
	public void validateContinueShopping() {
		String actTitle=sp.verifyContinueShopping();
		String expTitle="Soap - BEE";
		Assert.assertEquals(actTitle, expTitle);
	}
	
	
	
	@Test(priority=2)
	public void validateDataSheet() {
		Assert.assertTrue(sp.verifyDataSheet());
	}
	
	
}
