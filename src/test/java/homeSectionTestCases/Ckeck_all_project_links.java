package homeSectionTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import resources.Base;

public class Ckeck_all_project_links extends Base{
	
	@Test
	public void Ckeck_all_project_links_Test() throws InterruptedException {
		Thread.sleep(3000);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='dropdown-toggle collection']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[normalize-space()='SHOP THE COLLECTION']")).click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		/*Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		
		driver.findElement(By.xpath("//span[normalize-space()='Monochrome']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath("//span[normalize-space()='Art']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath("//span[normalize-space()='Classics']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath("//span[normalize-space()='Distressed']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath("//span[normalize-space()='Florals']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		driver.findElement(By.xpath("//span[normalize-space()='Geometry']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		driver.findElement(By.xpath("//span[normalize-space()='Kids']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		driver.findElement(By.xpath("//span[normalize-space()='Nature']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath("//span[normalize-space()='Shapes']")).click();
		
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@class='category-slider columns-w mt-lg-4']//div[@class='owl-nav']//button[2]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Stripes']")).click();
		Thread.sleep(3000);
		
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@class='category-slider columns-w mt-lg-4']//div[@class='owl-nav']//button[2]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Summer']")).click();
		
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@class='category-slider columns-w mt-lg-4']//div[@class='owl-nav']//button[2]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Brights']")).click();
		
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath("//span[normalize-space()='Motifs']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath("//span[normalize-space()='Borders']")).click();
		Thread.sleep(3000);*/
		
	}

}
