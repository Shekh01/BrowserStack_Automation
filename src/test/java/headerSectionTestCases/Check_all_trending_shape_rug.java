package headerSectionTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import resources.Base;

public class Check_all_trending_shape_rug extends Base{
	
	@Test
	public void Check_all_trending_shape_rug_Test() throws InterruptedException {
		
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
		jse.executeScript("window.scrollBy(0,-100)");
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
		jse.executeScript("window.scrollBy(0,-100)");
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
		
		driver.findElement(By.xpath("//a[normalize-space()='Rectangle']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Arch']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Runner']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Drop']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Round']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Hexagon']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Square']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='trending-shapes-ul']//span[@aria-label='Next'][contains(text(),'›')]")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Splash']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='trending-shapes-ul']//span[@aria-label='Next'][contains(text(),'›')]")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Halfmoon']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='trending-shapes-ul']//span[@aria-label='Next'][contains(text(),'›')]")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Diamond']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='trending-shapes-ul']//span[@aria-label='Next'][contains(text(),'›')]")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Oblong']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='trending-shapes-ul']//span[@aria-label='Next'][contains(text(),'›')]")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Capsule']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Eight']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Ogee']")).click();
		Thread.sleep(3000);
		
		
	}

}
