package com.obsqura.selenium.TestNGSample;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Locators extends Base {
	@Test(description="Locating by ID")
	public void locatingByID() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 12");
		driver.findElement(By.id("nav-search-submit-button")).click();
	}
}
