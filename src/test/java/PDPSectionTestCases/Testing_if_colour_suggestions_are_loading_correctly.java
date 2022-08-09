package PDPSectionTestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import resources.Base;

public class Testing_if_colour_suggestions_are_loading_correctly extends Base{
	
	@Test
	public void Testing_if_colour_suggestions_are_loading_correctly_Test() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='dropdown-toggle collection']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[normalize-space()='SHOP THE COLLECTION']")).click();
		
		/*Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='product-name']//a[@href='https://www.rugartisan.co.uk/handtufted-rectangle-purewool-jack.html']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"nav-personalise\"]/ul[1]/li/div/div/div[1]/div/div[1]/a/img")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"nav-personalise\"]/ul[1]/li/div/div/div[1]/div/div[2]/a/img")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"nav-personalise\"]/ul[1]/li/div/div/div[1]/div/div[3]/a/img")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"nav-personalise\"]/ul[1]/li/div/div/div[1]/div/div[4]/a/img")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"nav-personalise\"]/ul[1]/li/div/div/div[1]/div/div[6]/a/img")).click();
		Thread.sleep(3000);*/
		
		
	}

}
