package checkOutPageSectionTestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import resources.Base;

public class Checkout_page_Search_address_by_zippostal_code extends Base{
	@Test
	public void Check_And_Verify_To_Pass_Data_In_Zip_Code_Textbox_Checkout_page_Search_address_by_zippostal_code_Test() throws InterruptedException{
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
		driver.findElement(By.xpath("(//input[@id='shipping[postcode]'])[1]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[postcode]'])[1]")).sendKeys("SW10 9EW");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[city]'])[1]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@id='shipping[city]'])[1]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[postcode]'])[1]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[postcode]'])[1]")).sendKeys("SW103 9EWET");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[city]'])[1]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@id='shipping[city]'])[1]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[postcode]'])[1]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[postcode]'])[1]")).sendKeys("!#!#!#@!@!@");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[city]'])[1]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@id='shipping[city]'])[1]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[postcode]'])[1]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[postcode]'])[1]")).sendKeys("21234353423");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[city]'])[1]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@id='shipping[city]'])[1]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[postcode]'])[1]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[postcode]'])[1]")).sendKeys("00000000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[city]'])[1]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@id='shipping[city]'])[1]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[postcode]'])[1]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[postcode]'])[1]")).sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[city]'])[1]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@id='shipping[city]'])[1]")).clear();
		Thread.sleep(2000);
	}

}
