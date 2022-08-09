package headerSectionTestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import resources.Base;

public class Check_press_link_it_is_working extends Base{
	
	@Test
	public void Check_press_link_it_is_working_Test() {
		
		driver.findElement(By.xpath("//a[contains(text(),'Press')]")).click();
	}

}
