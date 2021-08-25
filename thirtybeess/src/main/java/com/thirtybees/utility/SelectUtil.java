package com.thirtybees.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectUtil {

	public static void selectByText(WebElement element, String text){
		Select s= new Select(element);
		s.selectByVisibleText(text);
	}
	
	public static void selectByValue(WebElement element, String value){
		Select s= new Select(element);
		s.selectByValue(value);
	}
	
	public static void selectByIndex(WebElement element, int indexNo){
		Select s= new Select(element);
		s.selectByIndex(indexNo);
	}
	
}
