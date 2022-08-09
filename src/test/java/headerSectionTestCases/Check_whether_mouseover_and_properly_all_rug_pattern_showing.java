package headerSectionTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import resources.Base;

public class Check_whether_mouseover_and_properly_all_rug_pattern_showing extends Base{
	
	@Test
	public void Check_whether_mouseover_and_properly_all_rug_pattern_showing_Test() throws InterruptedException {
		Thread.sleep(3000);
		WebElement rugpatt = driver.findElement(By.xpath("//a[normalize-space()='Pattern']"));
		Actions act = new Actions(driver);
		act.moveToElement(rugpatt).perform();
		Thread.sleep(3000);
	}

}
