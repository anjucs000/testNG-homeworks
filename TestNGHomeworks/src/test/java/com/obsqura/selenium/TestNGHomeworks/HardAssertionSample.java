package com.obsqura.selenium.TestNGHomeworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionSample extends DriverLoading {
	
	@Test(description="verify title of the page")
	public void verifyTitle() {
		String actualTitle,expectedTitle="Grocerystore";
		actualTitle=driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	@Test
	public void checkDriverNullOrNot() {
		Assert.assertNotNull(driver);
		//Assert.assertTrue(true);
	}
	
}
