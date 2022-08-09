package checkOutPageSectionTestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class Checkout_page_City extends resources.Base{
	@Test
	public void Test_And_Verify_is_able_to_Pass_city_is_Name_in_checkoutPage() throws InterruptedException {
Thread.sleep(3000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		driver.findElement(By.xpath("//ul[@class='links']//a[contains(text(),'Sign in')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sajid.shekh@rugartisan.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sajid01$");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//button[@id='btn-submit']//span[contains(text(),'Login')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		/*driver.findElement(By.xpath("//img[@alt='shopping bag']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		//driver.findElement(By.xpath("//a[@title='Remove This Item']")).click();
		driver.findElement(By.xpath("//*[@id=\"navbarResponsive\"]/div/div[1]/div/div[2]/ul/li/div/a")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//button[normalize-space()='+ New Address']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("(//input[@id='shipping[first_name]'])[1]")).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("(//input[@id='shipping[last_name]'])[1]")).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("(//input[@id='shipping[phone]'])[1]")).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("(//input[@id='shipping[company_name]'])[1]")).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("(//input[@id='shipping_address_0'])[1]")).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("(//input[@id='shipping_address_1'])[1]")).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("(//input[@id='shipping[city]'])[1]")).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("(//input[@id='shipping[city]'])[1]")).sendKeys("LondonLondonLondonLondonLondonLondon");
		driver.findElement(By.xpath("(//input[@id='shipping_address_1'])[1]")).sendKeys("123");
		driver.findElement(By.xpath("(//input[@id='shipping_address_1'])[1]")).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("(//input[@id='shipping[city]'])[1]")).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("(//input[@id='shipping[city]'])[1]")).sendKeys("@#@@#!$");
		driver.findElement(By.xpath("(//input[@id='shipping_address_1'])[1]")).sendKeys("123");
		driver.findElement(By.xpath("(//input[@id='shipping_address_1'])[1]")).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("(//input[@id='shipping[city]'])[1]")).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("(//input[@id='shipping[city]'])[1]")).sendKeys("12131212");
		driver.findElement(By.xpath("(//input[@id='shipping_address_1'])[1]")).sendKeys("123");
		driver.findElement(By.xpath("(//input[@id='shipping_address_1'])[1]")).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("(//input[@id='shipping[city]'])[1]")).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("(//input[@id='shipping[city]'])[1]")).sendKeys("LondonLondonLondonLo");
		driver.findElement(By.xpath("(//input[@id='shipping_address_1'])[1]")).sendKeys("123");
		driver.findElement(By.xpath("(//input[@id='shipping_address_1'])[1]")).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("(//input[@id='shipping[city]'])[1]")).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("(//input[@id='shipping[city]'])[1]")).sendKeys("adarebee1234532sajid");
		driver.findElement(By.xpath("(//input[@id='shipping_address_1'])[1]")).sendKeys("123");
		driver.findElement(By.xpath("(//input[@id='shipping_address_1'])[1]")).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("(//input[@id='shipping[city]'])[1]")).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("(//input[@id='shipping[city]'])[1]")).sendKeys("000000000");
		driver.findElement(By.xpath("(//input[@id='shipping_address_1'])[1]")).sendKeys("123");
		driver.findElement(By.xpath("(//input[@id='shipping_address_1'])[1]")).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("(//input[@id='shipping[city]'])[1]")).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("(//input[@id='shipping[city]'])[1]")).sendKeys("00000000000000000000");
		driver.findElement(By.xpath("(//input[@id='shipping_address_1'])[1]")).sendKeys("123");
		driver.findElement(By.xpath("(//input[@id='shipping_address_1'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@id='shipping[city]'])[1]")).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("(//input[@id='shipping[city]'])[1]")).sendKeys("London");
		driver.findElement(By.xpath("(//input[@id='shipping_address_1'])[1]")).sendKeys("123");
		driver.findElement(By.xpath("(//input[@id='shipping_address_1'])[1]")).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));*/
		
	}

}
