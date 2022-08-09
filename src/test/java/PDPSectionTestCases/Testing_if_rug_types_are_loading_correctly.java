package PDPSectionTestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import resources.Base;

public class Testing_if_rug_types_are_loading_correctly extends Base{
	
	@Test
	public void Testing_if_rug_types_are_loading_correctly_Test() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='dropdown-toggle collection']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[normalize-space()='SHOP THE COLLECTION']")).click();
		
		/*Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='product-name']//a[@href='https://www.rugartisan.co.uk/handtufted-rectangle-purewool-jack.html']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='select weavingtype']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//li[@id='HandTufted']")).click();
		
		Thread.sleep(3000);*/
		
	}

}
