package PDPSectionTestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import resources.Base;

public class Testing_if_materials_are_loading_correctly extends Base{
	
	@Test
	public void Testing_if_materials_are_loading_correctly_Test() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='dropdown-toggle collection']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[normalize-space()='SHOP THE COLLECTION']")).click();
		
		/*Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='product-name']//a[@href='https://www.rugartisan.co.uk/handtufted-rectangle-purewool-jack.html']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//body[1]/div[1]/div[6]/div[3]/form[1]/div[1]/div[2]/div[1]/ul[3]/li[1]/div[1]/div[1]/div[2]/div[1]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@id='colors-row-wrap']//div[1]//div[2]//ul[1]//li[1]")).click();
		
		Thread.sleep(4000);*/
	}

}
