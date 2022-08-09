package shoppingCardSectionTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import resources.Base;

public class Shopping_cart_page_link extends Base{
	@Test
	public void Check_And_Validate_All_Details_Of_Shopping_Cart_Page_Link_Shopping_cart_page_link_Test() throws InterruptedException{
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
	}

}
