package homeWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class checkAssertions {

	WebDriver driver;
	@Test
	public void checkURL() {
		String actURL,expURL;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anjuc\\eclipse-workspace\\TestNGSample\\src\\main\\java\\Resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		actURL=driver.getCurrentUrl();
		expURL="https://www.amazon.in/";
		Assert.assertEquals(actURL, expURL);
	}
	@Test
	public void checkPageSource() {
		String actPgSource;
		actPgSource=driver.getPageSource();
		if(actPgSource.isEmpty()) {
		Assert.assertFalse(false);
		}
	}
	@Test
	public void navigateLoginPage() {
		driver.navigate().to("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		String actTitle;
		actTitle=driver.getTitle();
		if(actTitle.contains("Sign In")) {
			Assert.assertTrue(true);
		}
	}
}
