package shoppingCardSectionTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import resources.Base;

public class Shopping_cart_adding_items extends Base{
	@Test
	public void Add_Items_Into_The_Shopping_Cart_And_Check_Them_Shopping_cart_adding_items_Test() throws InterruptedException{
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		WebElement colle = driver.findElement(By.xpath("//a[@class='dropdown-toggle collection']"));
		Actions coll = new Actions(driver);
		coll.moveToElement(colle).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"navbar-menu\"]/ul[1]/li[1]/ul/li/div/div[1]/a/img")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@class='product-name']//a[@href='https://www.rugartisan.com/handtufted-rectangle-purewool-splosh.html']")).click();
		Thread.sleep(2000);
		/*driver.findElement(By.xpath("//*[@id=\"nav-personalise\"]/ul[1]/li/div/div/div[1]/div/div[1]/a/img")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='widthCmRug']")).sendKeys("350");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='lengthCmRug']")).sendKeys("360");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@id='increase']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='stain-protection']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@title='Buy Now']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt='shopping bag']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		WebElement colle1 = driver.findElement(By.xpath("//a[normalize-space()='Collection']"));
		Actions coll1 = new Actions(driver);
		coll1.moveToElement(colle1).perform();
		driver.findElement(By.xpath("//*[@id=\"navbar-menu\"]/ul[1]/li[1]/ul/li/div/div[2]/a/img")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Yoso']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"nav-personalise\"]/ul[1]/li/div/div/div[1]/div/div[1]/a/img")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='widthCmRug']")).sendKeys("350");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='lengthCmRug']")).sendKeys("360");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@id='increase']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='stain-protection']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@title='Buy Now']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt='shopping bag']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		
		WebElement colle2 = driver.findElement(By.xpath("//a[normalize-space()='Collection']"));
		Actions coll2 = new Actions(driver);
		coll2.moveToElement(colle2).perform();
		driver.findElement(By.xpath("//*[@id=\"navbar-menu\"]/ul[1]/li[1]/ul/li/div/div[2]/a/img")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Abaca']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"nav-personalise\"]/ul[1]/li/div/div/div[1]/div/div[1]/a/img")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='widthCmRug']")).sendKeys("350");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='lengthCmRug']")).sendKeys("360");
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//a[@id='increase']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='stain-protection']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@title='Buy Now']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt='shopping bag']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		
		WebElement colle3 = driver.findElement(By.xpath("//a[normalize-space()='Collection']"));
		Actions coll3 = new Actions(driver);
		coll3.moveToElement(colle3).perform();
		driver.findElement(By.xpath("//*[@id=\"navbar-menu\"]/ul[1]/li[1]/ul/li/div/div[2]/a/img")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Ato']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"nav-personalise\"]/ul[1]/li/div/div/div[1]/div/div[1]/a/img")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='widthCmRug']")).sendKeys("350");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='lengthCmRug']")).sendKeys("360");
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//a[@id='increase']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='stain-protection']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@title='Buy Now']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt='shopping bag']")).click();
		Thread.sleep(3000);*/
		driver.navigate().back();
		Thread.sleep(3000);
	}

}
