package checkOutPageSectionTestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import resources.Base;

public class Checkout_page_Last_Name extends Base{
	@Test
	public void Check_Last__Name_Textbox_Field_Where_We_Pass_Valid_and_Invalid_Data_Checkout_page_Last_Name_Test() throws InterruptedException
	{
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
		driver.findElement(By.xpath("(//input[@id='shipping[last_name]'])[1]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='shipping[last_name]'])[1]")).sendKeys("adadadadadadadadadadadadad");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[first_name]'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@id='shipping[first_name]'])[1]")).sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[last_name]'])[1]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='shipping[last_name]'])[1]")).sendKeys("shekh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[first_name]'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@id='shipping[first_name]'])[1]")).sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[last_name]'])[1]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='shipping[last_name]'])[1]")).sendKeys("1313423241212");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[first_name]'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@id='shipping[first_name]'])[1]")).sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[last_name]'])[1]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='shipping[last_name]'])[1]")).sendKeys("jiodioj392idioiio56f");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[first_name]'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@id='shipping[first_name]'])[1]")).sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[last_name]'])[1]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='shipping[last_name]'])[1]")).sendKeys("fsdf472309409nc");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[first_name]'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@id='shipping[first_name]'])[1]")).sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[last_name]'])[1]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='shipping[last_name]'])[1]")).sendKeys("000000000000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[first_name]'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@id='shipping[first_name]'])[1]")).sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[last_name]'])[1]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='shipping[last_name]'])[1]")).sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[first_name]'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@id='shipping[first_name]'])[1]")).sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping[last_name]'])[1]")).clear();
		Thread.sleep(5000);
	}
}
