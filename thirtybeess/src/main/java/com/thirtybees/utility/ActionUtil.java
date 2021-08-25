package com.thirtybees.utility;

import org.openqa.selenium.WebElement;

public class ActionUtil {

	public static void sendKeys(WebElement element, String dataToEnter) {
		element.sendKeys(dataToEnter);
	}
	
	
	public static void click(WebElement element) {
		element.click();
	}
	
	
	public static String getText(WebElement element) {
		return element.getText();
	}
	
	
	public static void clear(WebElement element) {
		element.clear();
	}
	
	
}
