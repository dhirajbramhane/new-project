package com.pageTest;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.thirtybees.pages.HomePage;

public class HomePageTest extends TestBase {

	
	HomePage hp;
	
	@BeforeClass
	public void setUp() {
		try {
			initialization();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		hp=new HomePage(driver);
	}
	
	@Test(priority = 1)
	public void validateLabelOfCandle(){
		String actText=hp.verifyLabelOfCandle();
		String expText="PERFUME";
		Assert.assertEquals(actText, expText);
	}
	
	@Test(priority = 2)
	public void validateLabelOfSoap(){
		String actText=hp.verifyLabelOfSoap();
		String expText="BODY WASH";
		Assert.assertEquals(actText, expText);
	}
	
	@Test(priority = 3)
	public void validateBlogHeaders(){
		Assert.assertTrue(hp.verifyBlogHeaders());
	}

	//error
	@Test(priority = 4)
	public void validateSliderHeaders(){
		Assert.assertFalse(hp.verifySliderHeading());
	}
	
	public void tearDown() {
		driver.close();
	}
		
}
