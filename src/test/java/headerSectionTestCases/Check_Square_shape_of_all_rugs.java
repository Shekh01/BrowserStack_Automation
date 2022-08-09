package headerSectionTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import resources.Base;

public class Check_Square_shape_of_all_rugs extends Base{
	
	@Test
	public void Check_Square_shape_of_all_rugs_Test() throws InterruptedException {
		Thread.sleep(3000);
		WebElement shape = driver.findElement(By.xpath("//a[@class='dropdown-toggle shape']"));
		Actions act = new Actions(driver);
		act.moveToElement(shape).perform();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"navbar-menu\"]/ul[1]/li[4]/ul/div/div/div[9]/div/a/img")).click();
		Thread.sleep(3000);
	}

}
