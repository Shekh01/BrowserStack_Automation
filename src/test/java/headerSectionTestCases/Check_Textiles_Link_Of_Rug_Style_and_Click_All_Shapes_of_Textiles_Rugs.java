package headerSectionTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import resources.Base;

public class Check_Textiles_Link_Of_Rug_Style_and_Click_All_Shapes_of_Textiles_Rugs extends Base{
	
	@Test
	public void Check_Textiles_Link_Of_Rug_Style_and_Click_All_Shapes_of_Textiles_Rugs_Test() throws InterruptedException {
		Thread.sleep(3000);
		WebElement rugpatt = driver.findElement(By.xpath("//a[normalize-space()='Pattern']"));
		Actions act = new Actions(driver);
		act.moveToElement(rugpatt).perform();
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//*[@id=\"navbar-menu\"]/ul[1]/li[2]/ul/li[1]/div/div/div[9]/a")).click();
		
		Thread.sleep(3000);
	}

}
