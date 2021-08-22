package com.thirtybees.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.base.TestBase;

public class waitUtils extends TestBase {
	
	public static void  waitForElement(WebElement element, long time) {
		
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void fluentWait(WebElement element,long time) {
		 FluentWait wait= new FluentWait(driver).withTimeout(time,TimeUnit.SECONDS).ignoring(NoSuchElementException.class).pollingEvery(4,TimeUnit.SECONDS);
	     wait.until(ExpectedConditions.visibilityOf(element));	
	}
	 
	
	

}
