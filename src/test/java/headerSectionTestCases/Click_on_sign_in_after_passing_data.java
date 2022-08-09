package headerSectionTestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import resources.Base;

public class Click_on_sign_in_after_passing_data extends Base{
	
	@Test
	public void Click_on_sign_in_after_passing_data_Test() throws InterruptedException {
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//ul[@class='links']//a[contains(text(),'Sign in')]")).click();
		
	}

}
