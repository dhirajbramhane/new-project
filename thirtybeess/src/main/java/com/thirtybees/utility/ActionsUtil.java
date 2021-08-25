package com.thirtybees.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsUtil {
	public static WebDriver driver;

	Actions action = new Actions(driver);

	public void dragAndDrop(WebElement sourceEle, WebElement targetEle) {
		action.clickAndHold(sourceEle).moveToElement(targetEle).release().build().perform();
	}

	public void rightClick(WebElement sourceEle) {
		action.contextClick(sourceEle).perform();
	}

	public void mouseHover(WebElement sourceEle) {
		action.moveToElement(sourceEle).perform();
	}
	
	public void doubleClick(WebElement sourceEle) {
		action.doubleClick(sourceEle).perform();
	}
	
}
