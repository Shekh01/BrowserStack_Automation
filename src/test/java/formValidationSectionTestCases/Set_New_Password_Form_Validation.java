package formValidationSectionTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import resources.Base;

public class Set_New_Password_Form_Validation extends Base{
	@Test
	public void Test_And_Verify_To_Pass_Valid_And_InValid_value_in_Set_New_Password_Form_Validation() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
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
		driver.findElement(By.xpath("//a[normalize-space()='sajid']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[normalize-space()='Change Password']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='email'])[1]")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='oldpassword'])[1]")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='password'])[1]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='password_confirmation'])[1]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='personal-info-submit']")).click();
		
		
		driver.findElement(By.xpath("(//input[@id='email'])[1]")).sendKeys("sajid.shekh");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='oldpassword'])[1]")).sendKeys("Sajid01$");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys("Sajid01$Sajid01$");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='password_confirmation'])[1]")).sendKeys("Sajid01$Sajid01$Sajid01$");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='personal-info-submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='email'])[1]")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='oldpassword'])[1]")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='password'])[1]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='password_confirmation'])[1]")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@id='email'])[1]")).sendKeys("sajid.shekh@rugartisan.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='oldpassword'])[1]")).sendKeys("Sajid01$Sajid01$");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys("Sajid01$$$$$$$$");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='password_confirmation'])[1]")).sendKeys("Sajid01$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='personal-info-submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='email'])[1]")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='oldpassword'])[1]")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='password'])[1]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='password_confirmation'])[1]")).clear();
		Thread.sleep(2000);
		
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='email'])[1]")).sendKeys("sajid.sajid@rugartisan.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='oldpassword'])[1]")).sendKeys("Sajid01$");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys("Sajid01$$");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='password_confirmation'])[1]")).sendKeys("Sajid0100$$");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='personal-info-submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='email'])[1]")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='oldpassword'])[1]")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='password'])[1]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='password_confirmation'])[1]")).clear();
		Thread.sleep(2000);
	}

}
