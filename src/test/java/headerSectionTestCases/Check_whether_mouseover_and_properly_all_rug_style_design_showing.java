package headerSectionTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import resources.Base;

public class Check_whether_mouseover_and_properly_all_rug_style_design_showing extends Base{
	
	@Test
	public void Check_whether_mouseover_and_properly_all_rug_style_design_showing_Test() throws InterruptedException {
		WebElement rugsty = driver.findElement(By.xpath("//a[normalize-space()='Rug Style']"));
		Actions act = new Actions(driver);
		act.moveToElement(rugsty).perform();
		Thread.sleep(3000);
	}

}
