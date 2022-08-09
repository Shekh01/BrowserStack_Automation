package checkOutPageSectionTestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import resources.Base;

public class Checkout_page_Street_address extends Base{
	@Test
	public void Check_And_Verify_To_Pass_Data_In_Street_Address_Textbox_Checkout_page_Street_address_Test() throws InterruptedException{
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
		driver.findElement(By.xpath("(//input[@id='shipping_address_0'])[1]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping_address_0'])[1]")).sendKeys("LondonUnitedKingdomsLondonUnitedKingdomsLondonUnitedKingdomsLondonUnitedKingdomsLondonUnitedKingdomsLondonUnitedKingdomsLondonUnitedKingdomsLondonUnitedKingdomsLondonUnitedKingdomsLondonUnitedKingdoms");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='shipping[company_name]'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping_address_0'])[1]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping_address_0'])[1]")).sendKeys("LondonUnitedKingdomsLondonUnitedKingdomsLondonUnitedKingdomsLondonUnitedKingdomsLondonUnitedKingdomsLondonUnitedKingdomsLondonUnitedKingdomsLondonUnitedKingdomsLondonUnitedKingdomsLondonUnitedKingdomsLondon");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='shipping[company_name]'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='shipping[company_name]'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping_address_0'])[1]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping_address_0'])[1]")).sendKeys("LondonUnitedKingdomsLondonUnitedKingdomsLondonUnitedKingdomsLondonUnitedKingdomsLondonUnitedKingdomsLondonUnitedKingdomsLondonUnitedKingdomsLondonUnitedKingdomsLondonUnitedKingdomsLondon");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='shipping[company_name]'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='shipping[company_name]'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping_address_0'])[1]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping_address_0'])[1]")).sendKeys("000000000000000000000000000000000000000000000000000000000000000000");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='shipping[company_name]'])[1]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping_address_0'])[1]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping_address_0'])[1]")).sendKeys(" ^[#.0-9a-zA-Z\\ , - ]+$)");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='shipping[company_name]'])[1]")).click();
		

		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping_address_0'])[1]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='shipping_address_0'])[1]")).sendKeys(" ^[#.0-9a-zA-Z\\ , - ]+$)");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='shipping[company_name]'])[1]")).click();
	}

}
