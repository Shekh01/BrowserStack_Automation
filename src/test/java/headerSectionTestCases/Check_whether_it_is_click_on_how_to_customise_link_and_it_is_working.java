package headerSectionTestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import resources.Base;

public class Check_whether_it_is_click_on_how_to_customise_link_and_it_is_working extends Base{
	
	@Test
	public void Check_whether_it_is_click_on_how_to_customise_link_and_it_is_working_Test() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='How to Customise']")).click();
		
		Thread.sleep(3000);
	}

}
