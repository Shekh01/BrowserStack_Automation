package PDPSectionTestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import resources.Base;

public class Testing_to_see_if_all_defualt_screen_placement_colors_drop_down_bar extends Base{
	
	@Test
	public void Testing_to_see_if_all_defualt_screen_placement_colors_drop_down_bar_Test() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='dropdown-toggle collection']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[normalize-space()='SHOP THE COLLECTION']")).click();
		
		/*Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='product-name']//a[@href='https://www.rugartisan.co.uk/handtufted-rectangle-purewool-jack.html']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='suggestions-menu']")).click();
		
		Thread.sleep(3000);*/
		
		
		
	}

}
