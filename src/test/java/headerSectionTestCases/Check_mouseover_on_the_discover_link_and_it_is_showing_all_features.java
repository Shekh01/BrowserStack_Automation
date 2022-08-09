package headerSectionTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import resources.Base;

public class Check_mouseover_on_the_discover_link_and_it_is_showing_all_features extends Base{
	
	@Test
	public void Check_mouseover_on_the_discover_link_and_it_is_showing_all_features_Test() throws InterruptedException {
		
		WebElement disc = driver.findElement(By.xpath("//a[normalize-space()='DISCOVER']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(disc).perform();
		Thread.sleep(5000);
	}

}
