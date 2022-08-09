package formValidationSectionTestCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import resources.Base;

public class Contact_Form_Validation extends Base{
	
	@Test
	public void Test_and_verify_to_pass_all_Valid_and_invalid_data_in_contact_form_textbox_test() throws InterruptedException, AWTException {
		
		
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		driver.findElement(By.xpath("//a[normalize-space()='Contact']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//div[@class='upload-text']")).click();
		Thread.sleep(5000);
		/*Robot rb = new Robot();
		rb.delay(2000);
		StringSelection ss = new StringSelection("C:\\Users\\SAGA\\Documents\\1.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);*/
		driver.findElement(By.xpath("(//input[@id='name'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@id='name'])[1]")).sendKeys("clknalkndlnfbkjbcjkbiuejbxkjbcascfcbvb jhb jsnckn");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@id='email1'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@id='email1'])[1]")).sendKeys("fbcjksbiuw@cjk.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@id='phone'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@id='phone'])[1]")).sendKeys("8390057538");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@id='subject'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@id='subject'])[1]")).sendKeys("kasnjjjjjjjjjjjjjjjjjjjjjjjjjjncihfaiohncinnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnshiOHIO");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//textarea[@id='message'])[1]")).clear();
		driver.findElement(By.xpath("(//textarea[@id='message'])[1]")).sendKeys("I am sajid want to online booking from here I am going to download ");
		driver.findElement(By.xpath("(//button[@id='contact-submit'])[1]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//input[@id='name'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@id='name'])[1]")).sendKeys("!@#&#&#(&&)&)#&!)#&)!#&)#)#&)#&#");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@id='email1'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@id='email1'])[1]")).sendKeys("@$&*@%&**!*(!(");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@id='phone'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@id='phone'])[1]")).sendKeys("@&**&#&!#!#");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@id='subject'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@id='subject'])[1]")).sendKeys("%#&%@*&!%@*%!@$^@$&@$&");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//textarea[@id='message'])[1]")).clear();
		driver.findElement(By.xpath("(//textarea[@id='message'])[1]")).sendKeys("!&*^*&@^^@(!@(*^!@");
		driver.findElement(By.xpath("(//button[@id='contact-submit'])[1]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//input[@id='name'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@id='name'])[1]")).sendKeys("3157816398323");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@id='email1'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@id='email1'])[1]")).sendKeys("281776649");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@id='phone'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@id='phone'])[1]")).sendKeys("8390057538");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@id='subject'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@id='subject'])[1]")).sendKeys("2468698263961");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//textarea[@id='message'])[1]")).clear();
		driver.findElement(By.xpath("(//textarea[@id='message'])[1]")).sendKeys("4287518291");
		driver.findElement(By.xpath("(//button[@id='contact-submit'])[1]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//input[@id='name'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@id='name'])[1]")).sendKeys("shekh sajid %#!%*!&%#");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@id='email1'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@id='email1'])[1]")).sendKeys("fbcjk#!%#sbiuw@cjk.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@id='phone'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@id='phone'])[1]")).sendKeys("8390057538");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@id='subject'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@id='subject'])[1]")).sendKeys("kasnjjjjjjjjjjjjjjjjjjjjj#%#%#*!%#*nnnshiOHIO");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//textarea[@id='message'])[1]")).clear();
		driver.findElement(By.xpath("(//textarea[@id='message'])[1]")).sendKeys("I am sajid want to online booking from here I am going to download ^@(#^@(#^(!#^(");
		driver.findElement(By.xpath("(//button[@id='contact-submit'])[1]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//input[@id='name'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@id='name'])[1]")).sendKeys("shekh sajid 1283 !#*#");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@id='email1'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@id='email1'])[1]")).sendKeys("fbcjksbiuw@cjk");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@id='phone'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@id='phone'])[1]")).sendKeys("8390057538");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@id='subject'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@id='subject'])[1]")).sendKeys("kasHIO1781873!%#%*!!*");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//textarea[@id='message'])[1]")).clear();
		driver.findElement(By.xpath("(//textarea[@id='message'])[1]")).sendKeys("I am sajid want to online booking from here I am going to download 2351837 %#*!&#*! ");
		driver.findElement(By.xpath("(//button[@id='contact-submit'])[1]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//input[@id='name'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@id='name'])[1]")).sendKeys("");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@id='email1'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@id='email1'])[1]")).sendKeys("");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@id='phone'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@id='phone'])[1]")).sendKeys("");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@id='subject'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@id='subject'])[1]")).sendKeys("");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//textarea[@id='message'])[1]")).clear();
		driver.findElement(By.xpath("(//textarea[@id='message'])[1]")).sendKeys("");
		driver.findElement(By.xpath("(//button[@id='contact-submit'])[1]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//input[@id='name'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@id='name'])[1]")).sendKeys("shekh sajid");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@id='email1'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@id='email1'])[1]")).sendKeys("sajid.shekh@rugartisan.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@id='phone'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@id='phone'])[1]")).sendKeys("8390057538");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@id='subject'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@id='subject'])[1]")).sendKeys("send rug requirements to rug");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//textarea[@id='message'])[1]")).clear();
		driver.findElement(By.xpath("(//textarea[@id='message'])[1]")).sendKeys("I am sajid want to online booking from here I am going to download ");
		driver.findElement(By.xpath("(//button[@id='contact-submit'])[1]")).click();
		Thread.sleep(5000);
	}

}
