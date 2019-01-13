package locomotive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class myvideos {
	
	public void videos(WebDriver driver) {
		driver.get("https://www.youtube.com/my_videos?o=U");
	
		driver.findElement(By.xpath("//*[@placeholder='Search videos']")).sendKeys("premiere_nov29th");
		driver.findElement(By.xpath("//*[@aria-label='Expand edit options']")).click();
		driver.findElement(By.xpath("//*[@class='vm-video-captions yt-uix-button-menu-item']")).click();
		
		
	}

}
