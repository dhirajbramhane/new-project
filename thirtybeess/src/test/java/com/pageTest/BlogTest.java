package com.pageTest;

import org.apache.log4j.Logger;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.thirtybees.pages.BlogPage;

public class BlogTest extends TestBase {

	// WebDriver driver;
	Logger log = Logger.getLogger(BlogTest.class);
	BlogPage bp;

	@BeforeClass
	public void setup() {
		log.info("intializing the Blogpage");
		bp = HomeTest.bp;

	}

	@Test
	public void verifyBlogDetails() {
		log.info("verifying the Details of the Blog");
		String actual = bp.actblogDetails();
		String expected = bp.expblogDetails();
		Assert.assertEquals(actual, expected);
		log.info("Blog Details is present & same as expected");

	}

	@Test
	public void verifyImgOfPostBlog() {
		log.info("verifying is there any image on post Blog");
		Assert.assertTrue(bp.imageOfPostBlog());
		log.info("image is present in the Posted Blog");

	}

	@Test
	public void verifyAllPostBtn() {
		log.info("click on the all post Button to see all posted Blogs");
		bp.allPostBtn().click();
		Assert.assertEquals(driver.getTitle(), "Bees blog title - BEE");
		log.info("All posted Blog Page open an see posted Blogs");
	}

	@Test
	public void verifySocialMediaSharingBtn() throws InterruptedException {
		log.info("verifying different  social media sharing button ");
		Assert.assertTrue(bp.allSocialMediaSharingBtns());
		log.info("Open all social media windows and closed");

	}
}
