package homeSectionTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import resources.Base;

public class Check_all_trending_style_rug extends Base{
	
	@Test
	public void Check_all_trending_style_rug_Test() throws InterruptedException {
		Thread.sleep(3000);
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
		
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		
		driver.findElement(By.xpath("//a[normalize-space()='Batik']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='nav-link trending-styles-li'][normalize-space()='Vintage']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='nav-link trending-styles-li'][normalize-space()='Linear']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Origami']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Surface Art']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Modern Geometrics']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Cerulean']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='nav-link trending-styles-li'][normalize-space()='Borders']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='Trending-Styles-wrap columns-w trending-web mt-4']//div[@class='trendy-category']//button[2]")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Minimalist']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='Trending-Styles-wrap columns-w trending-web mt-4']//div[@class='trendy-category']//button[2]")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Brush Strokes']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='Trending-Styles-wrap columns-w trending-web mt-4']//div[@class='trendy-category']//button[2]")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Modern Art']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='Trending-Styles-wrap columns-w trending-web mt-4']//div[@class='trendy-category']//button[2]")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Gradation']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='Trending-Styles-wrap columns-w trending-web mt-4']//div[@class='trendy-category']//button[2]")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Patterns']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='nav-link trending-styles-li'][normalize-space()='Contemporary']")).click();
		Thread.sleep(3000);
		
	}

}
