package headerSectionTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import resources.Base;

public class Check_View_All_Design_Link_Of_Rug_Style_and_Click_All_Shapes_of_View_All_Design_Link_Rugs extends Base{
	
	@Test
	public void Check_View_All_Design_Link_Of_Rug_Style_and_Click_All_Shapes_of_View_All_Design_Link_Rugs_Test() throws InterruptedException {
		
		Thread.sleep(3000);
		WebElement rugpatt = driver.findElement(By.xpath("//a[normalize-space()='Pattern']"));
		Actions act = new Actions(driver);
		act.moveToElement(rugpatt).perform();
		Thread.sleep(3000);
		
		//driver.findElement(By.linkText("View all Designs")).click();
		
		Thread.sleep(3000);
	}

}
