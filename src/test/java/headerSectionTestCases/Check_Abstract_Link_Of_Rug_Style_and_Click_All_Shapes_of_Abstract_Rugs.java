package headerSectionTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import resources.Base;

public class Check_Abstract_Link_Of_Rug_Style_and_Click_All_Shapes_of_Abstract_Rugs extends Base{
	
	@Test
	public void Check_Abstract_Link_Of_Rug_Style_and_Click_All_Shapes_of_Abstract_Rugs_Test() throws InterruptedException {
		
		WebElement rugsty = driver.findElement(By.xpath("//a[normalize-space()='Rug Style']"));
		Actions act = new Actions(driver);
		act.moveToElement(rugsty).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Abstract']")).click();
		Thread.sleep(3000);
	}

}
