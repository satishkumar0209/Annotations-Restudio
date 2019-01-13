package Restudio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Testcase64Reference {
	
	public void Testcase(WebDriver driver) {
		
		
		
		WebElement videotab=Testcase64.Video(driver);
		Helpher.highLightElement(driver, videotab);
		videotab.click();
				
		
	}

}
