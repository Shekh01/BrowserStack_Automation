package formValidationSectionTestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import resources.Base;

public class Sign_In_Form_Validation extends Base{
	@Test
	public void Test_And_Verify_to_Pass_All_Valid_Invalid_Details_in_Sign_in_Fprm_Validation() throws InterruptedException {
Thread.sleep(3000);
		
		driver.findElement(By.xpath("//ul[@class='links']//a[contains(text(),'Sign in')]")).click();
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btn-submit']")).click();
		
		
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ajsdjkkasbkjbkjasbjckjifhskcnkjxnckzckjsiohncknkcnshckjznxkc");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("asjfbjkcxbjkbsjkbjkbxjkcbjkzbckjbxcjbjlkcbljkxbcjklz");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btn-submit']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("jznxkc!@@!##!$%");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("jklz%@&*#%!*&%#*!%");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btn-submit']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btn-submit']")).click();
		
		
		
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sajid.shekh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("jklz%@&*#%!*&%#nskncklnzl*!%");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btn-submit']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btn-submit']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sajid.shekh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sajid01$");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btn-submit']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btn-submit']")).click();
		
		
		
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btn-submit']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sajid.shekh@");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sajid01$");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btn-submit']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btn-submit']")).click();
		
		
		
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btn-submit']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sajid.shekh@");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sajid01$");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btn-submit']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btn-submit']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btn-submit']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sajid.shekh@rugartisan");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sajid01$");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btn-submit']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btn-submit']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btn-submit']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sajid.shekh@rugartisan.");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sajid01$");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btn-submit']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btn-submit']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btn-submit']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sajid.shekh@rugartisan.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sajid01$$");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btn-submit']")).click();
	}

}
