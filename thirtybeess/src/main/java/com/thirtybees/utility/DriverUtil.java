package com.thirtybees.utility;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
//Explicit wait and fluent wait for specific web element.

public class DriverUtil {
	public static WebDriver driver;
	
	public static void waitForElement(WebElement element, int time) {
		WebDriverWait wait=new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void fluentWaitForElement(WebElement element, long time, int pollingTime) {
		Wait w=new FluentWait(driver)
				.withTimeout(time, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class)
				.pollingEvery(pollingTime, TimeUnit.SECONDS);
		
		w.until(ExpectedConditions.visibilityOf(element));
	}
	
	//used for radio button element to be clickable
	public void waitForElementToBeClickable(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	
}
