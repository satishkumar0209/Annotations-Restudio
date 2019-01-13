package Restudio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Testcase64 {
	
	public static WebElement Video(WebDriver driver) {
		return driver.findElement(By.xpath("(//*[@class='nav-item-text style-scope ytcp-navigation-drawer'])[2]"));
		
	}

}
