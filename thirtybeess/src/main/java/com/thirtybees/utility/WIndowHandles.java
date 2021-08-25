package com.thirtybees.utility;

import java.util.Set;

import com.base.TestBase;

public class WIndowHandles extends TestBase {

	public  static void switchtoNextWindows(String mainWindows) {
		Set<String> windows = driver.getWindowHandles();
		for (String window : windows) {
			if (!window.equals(mainWindows)) {
				driver.switchTo().window(window);
			}
		}
	}

	
	public static void switchtoMainWindows(String mainWindows) {
		Set<String> windows = driver.getWindowHandles();
		for (String window : windows) {
			if (window.equals(mainWindows)) {
				driver.switchTo().window(window);
			}
		}
	}

	
	
}
