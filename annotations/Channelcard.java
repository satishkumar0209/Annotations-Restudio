package annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Channelcard {

	public void ccard(WebDriver driver) throws InterruptedException {

		driver.get("https://www.youtube.com/my_videos?o=U");

		WebDriverWait wait = new WebDriverWait(driver, 60);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Edit'])[1]")));

		driver.findElement(By.xpath("(//*[text()='Edit'])[1]")).click();

		driver.findElement(By.xpath("//*[text()='Add card']")).click();

		driver.findElement(By.xpath("(//*[@class='annotator-clickcard-right'])[2]")).click();

		driver.findElement(By.name("channel_url")).sendKeys("https://www.youtube.com/user/tv9telugulive");

		driver.findElement(By.xpath("//*[@placeholder='e.g. “Special thanks to Liam”']")).sendKeys("Hai");

		driver.findElement(By.xpath("//*[@placeholder='e.g. “Check out Liam’s channel”']")).sendKeys("Hello");

		driver.findElement(By.xpath("//*[text()='Create card']")).click();

		WebElement link = driver.findElement(By.id("creator-editor-title-link"));

		String keysPressed = Keys.chord(Keys.CONTROL, Keys.RETURN);

		link.sendKeys(keysPressed);

	}

}
