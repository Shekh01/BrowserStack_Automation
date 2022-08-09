package headerSectionTestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import resources.Base;

public class Check_the_bespoke_link_it_is_working_and_form_showing extends Base{
	
	@Test
	public void Check_the_bespoke_link_it_is_working_and_form_showing_Test() throws InterruptedException {
		
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//a[normalize-space()='Bespoke']")).click();
	}

}
