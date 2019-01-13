package Restudio;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class gmailcom2018 {

	public void gmail(WebDriver driver) throws InterruptedException {

		String url = "https://www.youtube.com/";

		driver.get(url);

		WebDriverWait wait = new WebDriverWait(driver, 60);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Sign in']")));

		driver.findElement(By.xpath("//*[text()='Sign in']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("identifierId")));

		driver.findElement(By.id("identifierId")).sendKeys("");

		driver.findElement(By.xpath("//*[@class='CwaK9']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@aria-label='Enter your password']")));

		driver.findElement(By.xpath("//*[@aria-label='Enter your password']")).sendKeys("");

		driver.findElement(By.xpath("//*[@class='CwaK9']")).click();
		
		

	}

}
