package resources;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	public WebDriver driver;

	public static final String AUTOMATE_USERNAME = "sajidshekh_0hOqSv";
	public static final String AUTOMATE_ACCESS_KEY = "87szPzwPLssSEsk5K2ZB";
	public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY
			+ "@hub-cloud.browserstack.com/wd/hub";

	@BeforeMethod
	public void launchBrowser() throws InterruptedException, MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();

		//caps.setPlatform(Platform.WINDOWS);
		caps.setCapability("os_version", "10");
		caps.setBrowserName("Chrome");
		caps.setVersion("99.0");

		URL browserStackURL = new URL(URL);

		driver = new RemoteWebDriver(browserStackURL, caps);

		driver.get("https://www.rugartisan.co.uk/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[2]/butoon")).click();
		driver.findElement(By.xpath("//*[@id=\"action-allow-cookies\"]/button")).click();

		Thread.sleep(3000);

		

	}
	@AfterMethod
	public void closeBrowser() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.quit();
	}
	

}
