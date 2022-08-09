package headerSectionTestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import resources.Base;

public class Checking_all_to_bag_link_it_is_working_properly_after_click_on_link extends Base{
	
	@Test
	public void Checking_all_to_bag_link_it_is_working_properly_after_click_on_link_Test() throws InterruptedException {
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//img[@alt='shopping bag']")).click();
		
	}

}
