package checkOutPageSectionTestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class Checkout_page_Company_name extends resources.Base {
	@Test
	public void Test_Verify_whether_Company_Name_Pass_Or_Not_And_Pass_any_Name() throws InterruptedException {
		Thread.sleep(3000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
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
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@alt='shopping bag']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		// driver.findElement(By.xpath("//a[@title='Remove This Item']")).click();
		driver.findElement(By.xpath("//*[@id=\"navbarResponsive\"]/div/div[1]/div/div[2]/ul/li/div/a")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		//driver.findElement(By.xpath("//button[normalize-space()='+ New Address']")).click();
		//driver.findElement(By.className("button btn-continue")).click();
		//driver.findElement(By.xpath("//button[contains(text(),'+ New Address')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("(//input[@id='shipping[company_name]'])[1]")).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("(//input[@id='shipping[company_name]'])[1]"))
				.sendKeys("hinffhhinffhhinffhhinffhhinffhhinffh");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		driver.findElement(By.xpath("(//input[@id='shipping_address_0'])[1]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@id='shipping_address_0'])[1]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='shipping[company_name]'])[1]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='shipping[company_name]'])[1]")).sendKeys("RugArtisan");
		Thread.sleep(5000);

		driver.findElement(By.xpath("(//input[@id='shipping_address_0'])[1]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@id='shipping_address_0'])[1]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='shipping[company_name]'])[1]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='shipping[company_name]'])[1]")).sendKeys("@#$%^&$#");
		Thread.sleep(5000);

		driver.findElement(By.xpath("(//input[@id='shipping_address_0'])[1]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@id='shipping_address_0'])[1]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='shipping[company_name]'])[1]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='shipping[company_name]'])[1]")).sendKeys("213121212212");
		Thread.sleep(5000);

		driver.findElement(By.xpath("(//input[@id='shipping_address_0'])[1]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@id='shipping_address_0'])[1]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='shipping[company_name]'])[1]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='shipping[company_name]'])[1]"))
				.sendKeys("hinfashinfashinfashinfashinfasEWDSDD");
		Thread.sleep(5000);

		driver.findElement(By.xpath("(//input[@id='shipping_address_0'])[1]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@id='shipping_address_0'])[1]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='shipping[company_name]'])[1]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='shipping[company_name]'])[1]")).sendKeys("dsjdas2133322ddk");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		driver.findElement(By.xpath("(//input[@id='shipping_address_0'])[1]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@id='shipping_address_0'])[1]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='shipping[company_name]'])[1]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='shipping[company_name]'])[1]")).sendKeys("000000000000");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		driver.findElement(By.xpath("(//input[@id='shipping_address_0'])[1]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@id='shipping_address_0'])[1]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='shipping[company_name]'])[1]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='shipping[company_name]'])[1]")).sendKeys("");
		Thread.sleep(5000);

		driver.findElement(By.xpath("(//input[@id='shipping_address_0'])[1]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@id='shipping_address_0'])[1]")).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("(//input[@id='shipping[company_name]'])[1]")).clear();
		Thread.sleep(1000);
	}

}
