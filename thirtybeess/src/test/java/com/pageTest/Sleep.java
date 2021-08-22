package com.pageTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sleep {
	
	
 @Test
 public void slelctone() {
	 System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
	 WebDriver	driver = new ChromeDriver();
	 driver.get("https://javabykiran.in/Other/thbees/");
	 driver.manage().window().maximize();
		//Thread.sleep(5000);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a")).click();
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("dhitaj@gmail.com");
		driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
		driver.findElement(By.xpath("//label/span")).click();
		
		//label/span

	 
 }

}
