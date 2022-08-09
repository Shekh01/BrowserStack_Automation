package checkOutPageSectionTestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import resources.Base;

public class Checkout_page_Mandatory_field extends Base{
	@Test
	public void Check_And_Pass_Data_In_All_Mandatory_FieldCheckout_page_Mandatory_field_Test() throws InterruptedException{
		Thread.sleep(3000);
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
		driver.findElement(By.xpath("//img[@alt='shopping bag']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[@title='Remove This Item']")).click();
		driver.findElement(By.xpath("//*[@id=\"navbarResponsive\"]/div/div[1]/div/div[2]/ul/li/div/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='+ New Address']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[first_name]'])[1]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='shipping[first_name]'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='shipping[last_name]'])[1]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='shipping[last_name]'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='shipping[phone]'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='shipping_address_0'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='shipping[city]'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='shipping[postcode]'])[1]")).click();
		Thread.sleep(3000);
	}

}
