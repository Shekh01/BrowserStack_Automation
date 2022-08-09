package headerSectionTestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import resources.Base;

public class Check_about_us_link extends Base{
	
	@Test
	public void Check_about_us_link_Test() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='top-left-menu']//a[contains(text(),'About')]")).click();
		
	}

}
