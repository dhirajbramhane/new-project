package com.thirtybees.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class switchToUtil {

	public static WebDriver driver;
	
	public void switchToAlert() {
		driver.switchTo().alert();
	}
	
	public void switchToFrame(WebElement frameElement) {
		driver.switchTo().frame(frameElement);
	}

	public void switchToFrame(String name) {
		driver.switchTo().frame(name);
	}
	
	public void switchToFrame(int index) {
		driver.switchTo().frame(index);
	}
	
	public void switchToWindow(String winHandleName) {
		driver.switchTo().window(winHandleName);
	}
	
}
