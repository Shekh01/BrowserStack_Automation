package PDPSectionTestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import resources.Base;

public class Testing_to_see_if_all_default_options_have_been_selected_correctly extends Base{
	
	@Test
	public void Testing_to_see_if_all_default_options_have_been_selected_correctly_Test() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='dropdown-toggle collection']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[normalize-space()='SHOP THE COLLECTION']")).click();
		
		/*Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='product-name']//a[@href='https://www.rugartisan.co.uk/handtufted-rectangle-purewool-jack.html']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='widthCmRug']")).sendKeys("400");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='lengthCmRug']")).sendKeys("450");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//label[@for='feet']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='widthFeetRug']")).sendKeys("5");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='widthInchRug']")).sendKeys("3");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='lengthFeetRug']")).sendKeys("6");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='lengthInchRug']")).sendKeys("4");
		
		driver.findElement(By.xpath("//a[@id='increase']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='increase']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@id='increase']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='increase']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='increase']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='increase']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='increase']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='increase']")).click();
		Thread.sleep(3000);*/
	}

}
