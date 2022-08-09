package headerSectionTestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import resources.Base;

public class Checking_wishlist_link_it_is_showing_all_save_to_wishlist_rug extends Base{
	
	@Test
	public void Checking_wishlist_link_it_is_showing_all_save_to_wishlist_rug_Test() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@class='links']//a[@class='top-link-wishlist login_link'][normalize-space()='My Wishlist']")).click();
		
		Thread.sleep(3000);
		
	}

}
