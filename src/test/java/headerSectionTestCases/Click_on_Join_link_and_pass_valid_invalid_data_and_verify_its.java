package headerSectionTestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import resources.Base;

public class Click_on_Join_link_and_pass_valid_invalid_data_and_verify_its extends Base{
	
	@Test
	public void Click_on_Join_link_and_pass_valid_invalid_data_and_verify_its_Test() throws InterruptedException {
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//ul[@class='links']//a[contains(text(),'Join')]")).click();
		
		Thread.sleep(3000);
		
		
	}

}
