package PDPSectionTestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import resources.Base;

public class Testing_color_sample_box_to_if_sample_can_be_selected_placed_basket_if_correctly extends Base {

	@Test
	public void Testing_color_sample_box_to_if_sample_can_be_selected_placed_basket_if_correctly_Test()
			throws InterruptedException {
		driver.findElement(By.xpath("//a[@class='dropdown-toggle collection']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[normalize-space()='SHOP THE COLLECTION']")).click();

		/*Thread.sleep(3000);

		driver.findElement(By.xpath(
				"//div[@class='product-name']//a[@href='https://www.rugartisan.co.uk/handtufted-rectangle-purewool-splosh.html']"))
				.click();

		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Order Samples']")).click();
		
		Thread.sleep(3000);
		
		/*driver.findElement(By.xpath("//span[contains(@class,'selected')]//span[@id='1-RA-AA01']")).click();
		
		driver.findElement(By.xpath("//span[@id='26-RA-AC02']")).click();
		
		driver.findElement(By.xpath("//span[@id='40-RA-AD04']")).click();
		
		driver.findElement(By.xpath("//span[@id='42-RA-AD06']")).click();
		
		driver.findElement(By.xpath("//span[@id='138-RA-AL06']")).click();
		
		driver.findElement(By.xpath("//button[contains(@class,'close action-close')]//span[contains(@aria-hidden,'true')][normalize-space()='×']")).click();*/
		
		
	}

}
