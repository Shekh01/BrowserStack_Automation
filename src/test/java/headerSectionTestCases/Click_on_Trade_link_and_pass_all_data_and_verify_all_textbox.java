package headerSectionTestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import resources.Base;

public class Click_on_Trade_link_and_pass_all_data_and_verify_all_textbox extends Base{
	
	@Test
	public void Click_on_Trade_link_and_pass_all_data_and_verify_all_textbox_Test() throws InterruptedException {
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//ul[@class='links']//a[normalize-space()='Trade']")).click();
		
		Thread.sleep(3000);
	}

}
