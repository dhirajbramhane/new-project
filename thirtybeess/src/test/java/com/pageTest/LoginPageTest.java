package com.pageTest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.thirtybees.pages.HomePage;
import com.thirtybees.pages.LoginPage;

public class LoginPageTest extends TestBase {

	HomePage hp;
	LoginPage lp;
	
	@BeforeMethod
	public void setUp() {
		try {
			initialization();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		hp=new HomePage(driver);
		lp=new LoginPage(driver);
		hp.navigateToLoginPage();
	}
	
	@AfterMethod
	public void tearDown() {
	driver.close();
		
	}	
	
	@Test(priority = 3)
	public void validateValidLoginCredential() {
		String actTitle=lp.verifyValidLogin();
		String expTitle="My account - BEE";
		Assert.assertEquals(actTitle, expTitle);	
	}
	
	@Test(priority = 1 )
	public void validateInvalidateLoginCredential() {
		String actTitle=lp.verifyInvalidLoginCredential();
		String expTitle="Login - BEE";
		Assert.assertEquals(actTitle, expTitle);	
	}
	
	@Test(priority = 2)
	public void validateBlankLoginCredential() {
		String actTitle=lp.verifyBlankLoginCredential();
		String expTitle="Login - BEE";
		Assert.assertEquals(actTitle, expTitle);		
	}
	
	
}
