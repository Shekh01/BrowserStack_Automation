package headerSectionTestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import resources.Base;

public class Check_contact_link_it_working_and_showing_contact_form extends Base{
	
	@Test
	public void Check_contact_link_it_working_and_showing_contact_form_Test() throws InterruptedException {
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Contact']")).click();
		
		Thread.sleep(3000);
	}

}
