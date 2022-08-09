package formValidationSectionTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import resources.Base;

public class Trade_Form_Validation extends Base{
	@Test
	public void Test_And_Verify_To_Pass_All_Details_in_Trade_form_Validation() throws InterruptedException {
Thread.sleep(3000);
		
		driver.findElement(By.xpath("//ul[@class='links']//a[normalize-space()='Trade']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Join as Trade Account']")).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//input[@id='tfirst_name']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='tlast_name']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='temail']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='tphone']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='company_name']")).clear();
		Thread.sleep(3000);
		WebElement sel =  driver.findElement(By.id("company_type"));
		Select selc = new Select(sel);
		selc.selectByIndex(1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='RESIDENTIAL']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[normalize-space()='COMMERCIAL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='HOTEL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='RETAIL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='OFFICE']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='COMMERCIAL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='tpassword'])[1]")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='tpassword_confirmation'])[1]")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='tis_subscribed'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='tis_subscribed'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[contains(text(),'Join')])[1]")).click();
		
		
		
		driver.findElement(By.xpath("//input[@id='tfirst_name']")).sendKeys("dagjgajgjagdkjxbmnbgsudjhxbzjxbugjxBZJXJZXxZXzxzx");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='tlast_name']")).sendKeys("jcknxkjcnishpfiknxkzncishinjknzciizxcoizho");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='temail']")).sendKeys("sajid.shekh");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='tphone']")).sendKeys("8390057538");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys("rugArtisan");
		Thread.sleep(3000);
		WebElement sel1 =  driver.findElement(By.id("company_type"));
		Select selc1 = new Select(sel1);
		selc1.selectByIndex(0);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='RESIDENTIAL']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[normalize-space()='COMMERCIAL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='HOTEL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='RETAIL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='OFFICE']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='COMMERCIAL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='tpassword'])[1]")).sendKeys("Sajid01$");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='tpassword_confirmation'])[1]")).sendKeys("Sajid01$$");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='tis_subscribed'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='tis_subscribed'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[contains(text(),'Join')])[1]")).click();
		Thread.sleep(10000);
		
		
		
		driver.findElement(By.xpath("//input[@id='tfirst_name']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='tlast_name']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='temail']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='tphone']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='company_name']")).clear();
		Thread.sleep(3000);
		WebElement sel2 =  driver.findElement(By.id("company_type"));
		Select selc2 = new Select(sel2);
		selc2.selectByIndex(2);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='RESIDENTIAL']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[normalize-space()='COMMERCIAL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='HOTEL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='RETAIL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='OFFICE']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='COMMERCIAL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='tpassword'])[1]")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='tpassword_confirmation'])[1]")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='tis_subscribed'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='tis_subscribed'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[contains(text(),'Join')])[1]")).click();
		Thread.sleep(10000);
		
		
		
		driver.findElement(By.xpath("//input[@id='tfirst_name']")).sendKeys("Sajid1233");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='tlast_name']")).sendKeys("Shekh2131");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='temail']")).sendKeys("sajid.shekh@");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='tphone']")).sendKeys("8390057538");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys("361873813");
		Thread.sleep(3000);
		WebElement sel3 =  driver.findElement(By.id("company_type"));
		Select selc3 = new Select(sel3);
		selc3.selectByIndex(1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='RESIDENTIAL']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[normalize-space()='COMMERCIAL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='HOTEL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='RETAIL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='OFFICE']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='COMMERCIAL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='tpassword'])[1]")).sendKeys("Sajid01$");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='tpassword_confirmation'])[1]")).sendKeys("Sajid01$$$");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='tis_subscribed'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='tis_subscribed'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[contains(text(),'Join')])[1]")).click();
		Thread.sleep(10000);
		
		
		driver.findElement(By.xpath("//input[@id='tfirst_name']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='tlast_name']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='temail']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='tphone']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='company_name']")).clear();
		Thread.sleep(3000);
		WebElement sel4 =  driver.findElement(By.id("company_type"));
		Select selc4 = new Select(sel4);
		selc4.selectByIndex(1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='RESIDENTIAL']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[normalize-space()='COMMERCIAL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='HOTEL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='RETAIL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='OFFICE']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='COMMERCIAL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='tpassword'])[1]")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='tpassword_confirmation'])[1]")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='tis_subscribed'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='tis_subscribed'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[contains(text(),'Join')])[1]")).click();
		Thread.sleep(10000);
		
		
		
		
		driver.findElement(By.xpath("//input[@id='tfirst_name']")).sendKeys("Sajid@$@$$#!");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='tlast_name']")).sendKeys("Shekh#!#!#$@");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='temail']")).sendKeys("sajid.shekh@rugartisan");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='tphone']")).sendKeys("8390057538");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys("#!#!$#!@!!#!@");
		Thread.sleep(3000);
		WebElement sel5 =  driver.findElement(By.id("company_type"));
		Select selc5 = new Select(sel5);
		selc5.selectByIndex(1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='RESIDENTIAL']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[normalize-space()='COMMERCIAL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='HOTEL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='RETAIL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='OFFICE']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='COMMERCIAL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='tpassword'])[1]")).sendKeys("Sajid01$");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='tpassword_confirmation'])[1]")).sendKeys("Sajid01$$$");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='tis_subscribed'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='tis_subscribed'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[contains(text(),'Join')])[1]")).click();
		Thread.sleep(10000);
		
		
		
		
		driver.findElement(By.xpath("//input[@id='tfirst_name']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='tlast_name']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='temail']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='tphone']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='company_name']")).clear();
		Thread.sleep(3000);
		WebElement sel7 =  driver.findElement(By.id("company_type"));
		Select selc7 = new Select(sel7);
		selc7.selectByIndex(1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='RESIDENTIAL']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[normalize-space()='COMMERCIAL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='HOTEL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='RETAIL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='OFFICE']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='COMMERCIAL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='tpassword'])[1]")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='tpassword_confirmation'])[1]")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='tis_subscribed'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='tis_subscribed'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[contains(text(),'Join')])[1]")).click();
		Thread.sleep(10000);
		
		
		
		driver.findElement(By.xpath("//input[@id='tfirst_name']")).sendKeys("Sajid323231@$@$$#!");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='tlast_name']")).sendKeys("Shekh43422#!#!#$@");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='temail']")).sendKeys("sajid.shekh@rugartisan.");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='tphone']")).sendKeys("8390057538");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys("313214232#!#!$#!@!!#!@");
		Thread.sleep(3000);
		WebElement sel8 =  driver.findElement(By.id("company_type"));
		Select selc8 = new Select(sel8);
		selc8.selectByIndex(1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='RESIDENTIAL']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[normalize-space()='COMMERCIAL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='HOTEL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='RETAIL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='OFFICE']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='COMMERCIAL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='tpassword'])[1]")).sendKeys("Sajid01$");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='tpassword_confirmation'])[1]")).sendKeys("Sajid01$$$");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='tis_subscribed'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='tis_subscribed'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[contains(text(),'Join')])[1]")).click();
		Thread.sleep(10000);
		
		
		
		
		driver.findElement(By.xpath("//input[@id='tfirst_name']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='tlast_name']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='temail']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='tphone']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='company_name']")).clear();
		Thread.sleep(3000);
		WebElement sel9 =  driver.findElement(By.id("company_type"));
		Select selc9 = new Select(sel9);
		selc9.selectByIndex(1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='RESIDENTIAL']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[normalize-space()='COMMERCIAL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='HOTEL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='RETAIL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='OFFICE']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='COMMERCIAL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='tpassword'])[1]")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='tpassword_confirmation'])[1]")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='tis_subscribed'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='tis_subscribed'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[contains(text(),'Join')])[1]")).click();
		Thread.sleep(10000);
		
		
		
		
		driver.findElement(By.xpath("//input[@id='tfirst_name']")).sendKeys("000000000000");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='tlast_name']")).sendKeys("00000000000");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='temail']")).sendKeys("0000000000000");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='tphone']")).sendKeys("00000000000000");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys("00000000000000");
		Thread.sleep(3000);
		WebElement sel11 =  driver.findElement(By.id("company_type"));
		Select selc11 = new Select(sel11);
		selc11.selectByIndex(1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='RESIDENTIAL']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[normalize-space()='COMMERCIAL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='HOTEL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='RETAIL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='OFFICE']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='COMMERCIAL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='tpassword'])[1]")).sendKeys("00000000000");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='tpassword_confirmation'])[1]")).sendKeys("000000000000");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='tis_subscribed'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='tis_subscribed'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[contains(text(),'Join')])[1]")).click();
		Thread.sleep(10000);
		
		
		
		
		driver.findElement(By.xpath("//input[@id='tfirst_name']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='tlast_name']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='temail']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='tphone']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='company_name']")).clear();
		Thread.sleep(3000);
		WebElement sel10 =  driver.findElement(By.id("company_type"));
		Select selc10 = new Select(sel10);
		selc10.selectByIndex(1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='RESIDENTIAL']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[normalize-space()='COMMERCIAL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='HOTEL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='RETAIL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='OFFICE']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='COMMERCIAL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='tpassword'])[1]")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='tpassword_confirmation'])[1]")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='tis_subscribed'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='tis_subscribed'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[contains(text(),'Join')])[1]")).click();
		Thread.sleep(10000);
		
		
		
		driver.findElement(By.xpath("//input[@id='tfirst_name']")).sendKeys("");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='tlast_name']")).sendKeys("");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='temail']")).sendKeys("");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='tphone']")).sendKeys("");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys("");
		Thread.sleep(3000);
		WebElement sel12 =  driver.findElement(By.id("company_type"));
		Select selc12 = new Select(sel12);
		selc12.selectByIndex(1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='RESIDENTIAL']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[normalize-space()='COMMERCIAL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='HOTEL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='RETAIL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='OFFICE']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='COMMERCIAL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='tpassword'])[1]")).sendKeys("");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='tpassword_confirmation'])[1]")).sendKeys("");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='tis_subscribed'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='tis_subscribed'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[contains(text(),'Join')])[1]")).click();
		Thread.sleep(10000);
		
		
		
		
		driver.findElement(By.xpath("//input[@id='tfirst_name']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='tlast_name']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='temail']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='tphone']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='company_name']")).clear();
		Thread.sleep(3000);
		WebElement sel13 =  driver.findElement(By.id("company_type"));
		Select selc13 = new Select(sel13);
		selc13.selectByIndex(1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='RESIDENTIAL']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[normalize-space()='COMMERCIAL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='HOTEL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='RETAIL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='OFFICE']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='COMMERCIAL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='tpassword'])[1]")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='tpassword_confirmation'])[1]")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='tis_subscribed'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='tis_subscribed'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[contains(text(),'Join')])[1]")).click();
		
		
		
		
		driver.findElement(By.xpath("//input[@id='tfirst_name']")).sendKeys("sajid");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='tlast_name']")).sendKeys("shekh");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='temail']")).sendKeys("sajid.shekh@rugartisan.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='tphone']")).sendKeys("8390057538");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys("RugArtisan");
		Thread.sleep(3000);
		WebElement sel16 =  driver.findElement(By.id("company_type"));
		Select selc16 = new Select(sel16);
		selc16.selectByIndex(1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='RESIDENTIAL']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[normalize-space()='COMMERCIAL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='HOTEL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='RETAIL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='OFFICE']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='COMMERCIAL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='tpassword'])[1]")).sendKeys("Sajid01$");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='tpassword_confirmation'])[1]")).sendKeys("Sajid01$");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='tis_subscribed'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='tis_subscribed'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[contains(text(),'Join')])[1]")).click();
		Thread.sleep(10000);
		
		
		
		
		driver.findElement(By.xpath("//input[@id='tfirst_name']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='tlast_name']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='temail']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='tphone']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='company_name']")).clear();
		Thread.sleep(3000);
		WebElement sel15 =  driver.findElement(By.id("company_type"));
		Select selc15 = new Select(sel15);
		selc15.selectByIndex(1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='RESIDENTIAL']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[normalize-space()='COMMERCIAL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='HOTEL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='RETAIL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='OFFICE']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='COMMERCIAL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='tpassword'])[1]")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='tpassword_confirmation'])[1]")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='tis_subscribed'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='tis_subscribed'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[contains(text(),'Join')])[1]")).click();
		
	}

}
