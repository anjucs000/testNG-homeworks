package com.obsqura.selenium.TestNGSample;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CheckBackgroundColor extends Base {
	@Test
	public void checkBgColor() {
		String backGroundColor,expBgColor="rgba(0, 123, 255, 1)";
		backGroundColor=driver.findElement(By.xpath("//button[@id='button-one']")).getCssValue("background-color");
		Assert.assertEquals(expBgColor, backGroundColor);
	}
	@Test
	public void checkTextColor() {
	String color,expColor="rgba(255, 255, 255, 1)";
	color=driver.findElement(By.xpath("//button[@id='button-one']")).getCssValue("color");
	if(expColor==color) {
		Assert.assertTrue(true);
	}
	else {
		Assert.assertFalse(false, "Actual and expected colors are different");
	}
	}
	/*@Test
	public void checkLocation() {
	Point location;
	int locationX,locationY;
	location=driver.findElement(By.xpath("//button[@id='button-one']")).getLocation();
	locationX=location.getX();
	locationY=location.getY();
	
	}*/
	@Test
	public void compareLocation() {
		Point locationA,locationB;
		int locationAY,locationBY;
		locationA= driver.findElement(By.xpath("//button[@id='button-one']")).getLocation();
		locationAY=locationA.getY();
		locationB=driver.findElement(By.xpath("//div[@id='message-one']")).getLocation();
		locationBY=locationB.getY();
		if(locationBY>locationAY) {
			Assert.assertTrue(true,"Show message button is located above Your Message field");
		}
		
	}
}
