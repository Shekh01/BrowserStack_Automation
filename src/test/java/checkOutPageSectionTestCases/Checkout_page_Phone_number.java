package checkOutPageSectionTestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import resources.Base;

public class Checkout_page_Phone_number extends Base{
	@Test
	public void Check_And_Verify_To_Pass_Data_In_Phone_Number_Textbox_Checkout_page_Phone_number_Test() throws InterruptedException{
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
		driver.findElement(By.xpath("(//button[normalize-space()='+ New Address'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[phone]'])[1]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[phone]'])[1]")).sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[company_name]'])[1]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@id='shipping[company_name]'])[1]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[phone]'])[1]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[phone]'])[1]")).sendKeys("01632 960864");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[company_name]'])[1]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@id='shipping[company_name]'])[1]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[phone]'])[1]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[phone]'])[1]")).sendKeys("01632 960864");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[company_name]'])[1]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@id='shipping[company_name]'])[1]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[phone]'])[1]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[phone]'])[1]")).sendKeys("3131@#!#!#$");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[company_name]'])[1]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@id='shipping[company_name]'])[1]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[phone]'])[1]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[phone]'])[1]")).sendKeys("23123424431231313452343134123214123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[company_name]'])[1]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@id='shipping[company_name]'])[1]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[phone]'])[1]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[phone]'])[1]")).sendKeys("0#163 -608$64");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[company_name]'])[1]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@id='shipping[company_name]'])[1]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[phone]'])[1]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[phone]'])[1]")).sendKeys(".,-_");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[company_name]'])[1]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@id='shipping[company_name]'])[1]")).clear();
		Thread.sleep(5000);
	}

}
