package com.pageTest;

import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.TestBase;

import com.thirtybees.pages.BlogPage;
import com.thirtybees.pages.HomePage;

public class HomeTest extends TestBase {

	WebDriver driver;
	HomePage hp;
	static BlogPage bp;
	
	Logger log = Logger.getLogger(HomeTest.class);

	@BeforeClass
	public void setup() throws InterruptedException {
		
		driver = initialization();
		hp = new HomePage(driver);
		bp = new BlogPage(driver);
	}

	@Test
	public void verifyHeader() {
		
		log.info("verifying header");
		String actual = hp.header();
		Assert.assertEquals(actual, "Our Featured Products");
		log.info("Header is as Expected");
	}
	
/*	@Test
	public void verifyMarketplacePageLink() throws InterruptedException {
		 String window=hp.shopnowbtn();
		 driver.switchTo().window(window);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		Assert.assertTrue(hp.marketplacePageLink(driver));
		}
*/
	@Test
	public void verifyBlogSectionHeader() {
		log.info("verifying Blog Section Header ");
		String actual = hp.actBlogHeader();
		String expected = hp.expBlogHeader();
		Assert.assertEquals(actual, expected);
		log.info("Header is as expected");
	}

	@Test
	public void verifyBlogSectionSubHeader() {
		log.info("verifying Blog Section Sub Header");
		String actual = hp.actblogSubHeader();
		String expected = hp.expblogSubHeader();
		Assert.assertEquals(actual, expected);
		log.info("Sub Header is as expected");
	}

	@Test
	public void verifyBlogsTitles() {
		log.info("verifying Home page Display Blog Titles");
		ArrayList<String> actual = hp.actBlogTitles();
		ArrayList<String> expected = hp.expBlogTitles();
		Assert.assertEquals(actual, expected);
		log.info("Blog Titles is as expected");
	}

	@Test
	public void verifyToReadSpecifiedByReadMoreBuutonBlog() {
		log.info("Clicks on the Readmore button to read full Blog");
		hp.readMorebtn().click();
		//bp = new BlogPage(driver);
		Assert.assertEquals(driver.getTitle(), "Organic Gifts - BEE");
		log.info("Readmore button clicks and  move to full Blog page");
	}

}
