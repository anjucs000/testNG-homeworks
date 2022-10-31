package com.obsqura.selenium.TestNGSample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Base {
	public WebDriver driver;
	@Test
	public void initialiseBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\anjuc\\eclipse-workspace\\JUnitSample\\src\\main\\java\\Resources\\chromedriver.exe");	
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize(); //to maximise the window size
	}
	public void browserClose() {
		driver.close();
	}
	public void driverQuit() {
		driver.quit();
	}
	}

