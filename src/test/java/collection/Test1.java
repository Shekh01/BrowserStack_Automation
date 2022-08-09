package collection;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import resources.Base;

public class Test1 extends Base {

	@Test
	public void click_on_collection() throws InterruptedException {
		driver.findElement(By.xpath("//a[@class='dropdown-toggle collection']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='SHOP THE COLLECTION']")).click();

	}

}
