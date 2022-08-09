package myAccountInformationSectionTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import resources.Base;

public class Change_Email_Password_Form_Validation extends Base{
	
	@Test
	public void Check_to_Pass_Valid_And_All_type_of_Invalid_Data_in_the_change_email_password_textbox() throws InterruptedException {
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
		driver.findElement(By.xpath("(//label[normalize-space()='Change Email'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//label[normalize-space()='Change Password'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='emailField']//input[@id='email']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='emailField']//input[@id='email']")).sendKeys("sajid.shekh");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='oldpassword'])[1]")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='oldpassword'])[1]")).sendKeys("Sajid01$$$$");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='password'])[1]")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys("Sajid01$$$$@@@@");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='password_confirmation'])[1]")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='password_confirmation'])[1]")).sendKeys("Sajid01$$$$####@@@@");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[normalize-space()='Save'])[1]")).click();
		
		driver.findElement(By.xpath("//div[@id='emailField']//input[@id='email']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='emailField']//input[@id='email']")).sendKeys("sajid.shekh@");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='oldpassword'])[1]")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='oldpassword'])[1]")).sendKeys("Sajid01$");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='password'])[1]")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys("Sajid01$$$$@@@@");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='password_confirmation'])[1]")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='password_confirmation'])[1]")).sendKeys("Sajid01$$$$####@@@@");
		driver.findElement(By.xpath("(//button[normalize-space()='Save'])[1]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@id='emailField']//input[@id='email']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='emailField']//input[@id='email']")).sendKeys("sajid.shekh@rugartisan");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='oldpassword'])[1]")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='oldpassword'])[1]")).sendKeys("Sajid01$$");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='password'])[1]")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys("Sajid01$$$$@@@@");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='password_confirmation'])[1]")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='password_confirmation'])[1]")).sendKeys("Sajid01$$$$####@@@@");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[normalize-space()='Save'])[1]")).click();
		
		
		driver.findElement(By.xpath("//div[@id='emailField']//input[@id='email']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='emailField']//input[@id='email']")).sendKeys("sajid.shekh@ruartisan.");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='oldpassword'])[1]")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='oldpassword'])[1]")).sendKeys("Sajid01$$$$");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='password'])[1]")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys("Sajid01$$$$@@@@");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='password_confirmation'])[1]")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='password_confirmation'])[1]")).sendKeys("Sajid01$$$$####@@@@");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[normalize-space()='Save'])[1]")).click();
		
		driver.findElement(By.xpath("//div[@id='emailField']//input[@id='email']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='emailField']//input[@id='email']")).sendKeys("sajid.shekh@rugartisan.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='oldpassword'])[1]")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='oldpassword'])[1]")).sendKeys("Sajid01$");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='password'])[1]")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys("Sajid01$");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='password_confirmation'])[1]")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='password_confirmation'])[1]")).sendKeys("Sajid01$");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[normalize-space()='Save'])[1]")).click();
		
		Thread.sleep(1000);
	}

}
