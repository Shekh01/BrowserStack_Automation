package collectionSectionTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import resources.Base;

public class Click_on_Absract_collection_and_check_of_all_shapes_of_Abstract_collection extends Base {
	
	@Test
	public void Click_on_Absract_link_and_check_of_all_shapes_of_Abstract_collection() {
		
		WebElement mouseover = driver.findElement(By.xpath("//a[@class='dropdown-toggle collection']"));
		Actions act = new Actions(driver);
		act.moveToElement(mouseover).perform();
		//driver.findElement(By.xpath("/html/body/div[1]/div[1]/nav/div/div[2]/ul[1]/li[1]/ul/li/div/div[16]/a/img")).click();
		
		
		
		
		
	}

}

