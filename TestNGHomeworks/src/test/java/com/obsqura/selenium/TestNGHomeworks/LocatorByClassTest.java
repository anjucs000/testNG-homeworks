package com.obsqura.selenium.TestNGHomeworks;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LocatorByClassTest extends LocatorByClassBase {
	@Test
	public void locateByClass() {
		driver.findElement(By.className("DocSearch-Button-Placeholder")).click();
		Assert.assertTrue(true);
	}

}
