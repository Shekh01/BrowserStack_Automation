package headerSectionTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import resources.Base;

public class Check_Stripe_pattern_link_and_click_all_shapes_of_Stripe_pattern_rug_showing extends Base{
	
	@Test
	public void Check_Stripe_pattern_link_and_click_all_shapes_of_Stripe_pattern_rug_showing_Test() throws InterruptedException {
		Thread.sleep(3000);
		WebElement rugpatt = driver.findElement(By.xpath("//a[normalize-space()='Pattern']"));
		Actions act = new Actions(driver);
		act.moveToElement(rugpatt).perform();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"navbar-menu\"]/ul[1]/li[3]/ul/li[1]/div/div/div[9]/a")).click();
		
		Thread.sleep(3000);
	}

}
