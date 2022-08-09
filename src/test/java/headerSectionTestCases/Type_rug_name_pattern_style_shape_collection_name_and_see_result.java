package headerSectionTestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import resources.Base;

public class Type_rug_name_pattern_style_shape_collection_name_and_see_result extends Base{
	
	@Test
	public void Type_rug_name_pattern_style_shape_collection_name_and_see_result_Test() throws InterruptedException {
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class='cd-search-trigger']//i[@class='fa fa-search']")).click();
		
	}

}
