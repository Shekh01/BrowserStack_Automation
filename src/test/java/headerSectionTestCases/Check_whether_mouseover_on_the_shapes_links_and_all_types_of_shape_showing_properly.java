package headerSectionTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import resources.Base;

public class Check_whether_mouseover_on_the_shapes_links_and_all_types_of_shape_showing_properly extends Base{
	
	@Test
	public void Check_whether_mouseover_on_the_shapes_links_and_all_types_of_shape_showing_properly_Test() throws InterruptedException {
		
		Thread.sleep(3000);
		WebElement shape = driver.findElement(By.xpath("//a[@class='dropdown-toggle shape']"));
		Actions act = new Actions(driver);
		act.moveToElement(shape).perform();
		Thread.sleep(3000);

	}

}
