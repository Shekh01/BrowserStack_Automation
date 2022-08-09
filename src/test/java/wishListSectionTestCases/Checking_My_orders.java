package wishListSectionTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import resources.Base;

public class Checking_My_orders extends Base{
	@Test
	public void Checking_My_Order_Link_Test_Verify_All_Link_Checking_My_orders_Test() throws InterruptedException{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		driver.findElement(By.xpath("//ul[@class='links']//a[contains(text(),'Sign in')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sajid.shekh@rugartisan.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sajid01$");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btn-submit']//span[contains(text(),'Login')]")).click();
		Thread.sleep(2000);
		/*driver.findElement(By.xpath("//a[normalize-space()='sajid']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='nav-MyOrders-tab']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//img[@alt='shopping bag'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@title='Remove This Item'])[1]")).click();
		Thread.sleep(3000);*/
	}

}
