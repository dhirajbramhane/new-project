package com.thirtybees.objrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjectRepo {

	@FindBy(id = "email")
	protected WebElement email;
	
	@FindBy(id = "passwd")
	protected WebElement password;
	
	@FindBy(id = "SubmitLogin")
	protected WebElement signInBtn;
	
	@FindBy(xpath = "//a[text()='Forgot your password?']")
	protected WebElement forgotPwd;
	
	
	//Registration Page objects
	@FindBy(id = "email_create")
	protected WebElement emailAddress;
	
	@FindBy(name = "SubmitCreate")
	protected WebElement createAccountBtn;
}
