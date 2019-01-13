package locomotive;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Logintogmail {

	public void gmail(WebDriver driver) throws InterruptedException {

		String url = "https://www.youtube.com/";

		driver.get(url);

		driver.findElement(By.xpath("//*[text()='Sign in']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("identifierId")).sendKeys("peloteando2@gmail.com");

		driver.findElement(By.xpath("//*[@class='CwaK9']")).click();

		WebDriverWait wait = new WebDriverWait(driver, 60);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@aria-label='Enter your password']")));

		driver.findElement(By.xpath("//*[@aria-label='Enter your password']")).sendKeys("peloteando");

		driver.findElement(By.xpath("//*[@class='CwaK9']")).click();

	}

}
