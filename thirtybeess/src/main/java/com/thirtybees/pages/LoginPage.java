package com.thirtybees.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.thirtybees.objrepository.LoginPageObjectRepo;
import com.thirtybees.utility.ActionUtil;

public class LoginPage extends LoginPageObjectRepo {
	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public MyAccountPage verifyValidLoginCredential() {
		ActionUtil.sendKeys(email, "testuser@bee.com");
		ActionUtil.sendKeys(password, "welcome@123123");
		ActionUtil.click(signInBtn);
		//pageLogs().info("after clicking on login btn my account page will be opened");
		return new MyAccountPage(driver) ;
		
	}
	
	public String verifyValidLogin() {
		verifyValidLoginCredential();	
		return driver.getTitle();	
	}

	public String verifyInvalidLoginCredential() {
		ActionUtil.sendKeys(email, "abc@gmal.com");
		ActionUtil.sendKeys(password, "8dd58ddsx");
		ActionUtil.click(signInBtn);
		return driver.getTitle();
	}
	
	public String verifyBlankLoginCredential() {
		ActionUtil.sendKeys(email, "");
		ActionUtil.sendKeys(password, "");
		ActionUtil.click(signInBtn);
		return driver.getTitle();
	}
	
	
	public void verifyForgotPwd() {
		
	}
	
}
