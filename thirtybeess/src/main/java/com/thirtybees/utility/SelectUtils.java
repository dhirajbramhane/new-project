package com.thirtybees.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectUtils {
	
	public void selectByText(WebElement element, String text) {
		Select sel= new Select(element);
		sel.selectByVisibleText(text);	
	}
	

}
