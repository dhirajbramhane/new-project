package com.thirtybees.pages;

import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.thirtybees.objrepository.BlogRepository;
import com.thirtybees.utility.ExcelUtils;

public class BlogPage extends BlogRepository {

	WebDriver driver;
	Logger log = Logger.getLogger(BlogPage.class);

	public BlogPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public boolean imageOfPostBlog() {
		return imageOfBlog.isDisplayed();
	}

	public String actblogDetails() {
		String actdetasil = blogPostDetails.getText();
		return actdetasil;
	}

	public String expblogDetails() {
		String actdetasil = ExcelUtils.getData(System.getProperty("user.dir") + "/src/main/resources/BlogSections.xls",
				"BlogSection", 8, 1);
		return actdetasil;
	}

	public WebElement allPostBtn() {
		return allPostBtn;
	}

	public boolean allSocialMediaSharingBtns() throws InterruptedException {

		String mainWindow = driver.getWindowHandle();
		for (WebElement webElement : socialMediaSharingBtn) {
			webElement.click();
		}

		Set<String> windows = driver.getWindowHandles();
		for (String window : windows) {
			if (!window.equals(mainWindow)) {
				driver.switchTo().window(window);
				Thread.sleep(5000);
				driver.close();
			}
			log.info("all social Media windows open and close ");
			return true;
		}
		log.error("Social media window does not open");
		return false;
	}

}
