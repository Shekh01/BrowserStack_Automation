package collectionSectionTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mouse_over_on_collection_link extends resources.Base{
	
	@Test
	public void Test_mouse_over_on_collection_link_and_check_all_collection_is_showing_or_not() throws InterruptedException {
		WebElement mouseover = driver.findElement(By.xpath("//a[@class='dropdown-toggle collection']"));
		Actions act = new Actions(driver);
		act.moveToElement(mouseover).perform();
		Thread.sleep(5000);
	}
	

}
