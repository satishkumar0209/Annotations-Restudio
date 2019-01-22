package Restudio;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mainrunningprogramme {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "/home/aj/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, 60);

		 driver.get("https://www.youtube.com");

		shruthiyttesting login = new shruthiyttesting();
		login.gmail(driver);

		//======================================================================================
		//Testcase24
		
		String Dashboard="";
		
		
		String Videolist="";
		
		String Comments="";
		
		String Channelanalyst="";
		
		driver.get(
				"https://studio.youtube.com/channel/UCMjBz-CTBTBc5LJXaXXi9Bw?apiary=release-youtubei.sandbox.googleapis.com");
		
		driver.get("");
		
		Thread.sleep(3000);
		
		driver.get("");
		
		Thread.sleep(3000);
		
		driver.get("");
		
		Thread.sleep(3000);
		
		driver.get("");
		
		//===========================================================================================
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Thread.sleep(2000);
//		driver.get(
//				"https://studio.youtube.com/channel/UCMjBz-CTBTBc5LJXaXXi9Bw?apiary=release-youtubei.sandbox.googleapis.com");
//		
//		Testcase64Reference check = new Testcase64Reference();
//		check.Testcase(driver);
//		
//		
//		
//		
//		
//			wait.until(ExpectedConditions
//					.visibilityOfElementLocated(By.xpath("(//*[@class='style-scope ytcp-paper-checkbox'])[1]")));
//			WebElement element=driver.findElement(By.xpath("//*[@class='style-scope ytcp-dropdown-trigger x-scope iron-icon-0']"));
//		JavascriptExecutor je = (JavascriptExecutor) driver;
//			
//		je.executeScript("arguments[0].scrollIntoView(true);",element);
//		 driver.findElement(By.xpath("//*[@class='style-scope ytcp-dropdown-trigger x-scope iron-icon-0']")).click();
//		 
//		 driver.findElement(By.xpath("//*[@test-id='10']")).click();
//		 
//		 driver.findElement(By.id("navigate-after")).click();
//		 
//		 WebElement Videotitle=driver.findElement(By.xpath("(//*[@class='remove-default-style  style-scope ytcp-video-list-cell-video'])[1]"));
//		
//		 
//		
//		 System.out.println(Videotitle);
//		 
//		 //String s=Videotitle;
//		 
//		 WebElement dots = driver.findElement(By.xpath("(//*[@class='remove-defaults style-scope ytcp-icon-button x-scope iron-icon-0'])[9]"));
//			Actions action1 = new Actions(driver);
//			action1.moveToElement(dots).click().build().perform();
//		
//			driver.findElement(By.xpath("//*[text()='Delete']")).click();
//			
//			wait.until(ExpectedConditions
//					.visibilityOfElementLocated(By.xpath("//*[@class='label style-scope ytcp-checkbox']")));
//			
//			driver.findElement(By.xpath("//*[@class='label style-scope ytcp-checkbox']")).click();
//			
//			driver.findElement(By.xpath("//*[text()='Delete Video']")).click();
//			
			//driver.findElement(By.xpath("//*[@placeholder='Search across your channel']")).sendKeys(Videotitle);
			
			
	
//=========================================================================================================================================================
		//Testcase 62
//		Testcase64Reference check = new Testcase64Reference();
//		check.Testcase(driver);
//		
//		wait.until(ExpectedConditions
//				.visibilityOfElementLocated(By.xpath("(//*[@class='style-scope ytcp-paper-checkbox'])[1]")));
//
//		WebElement youtubevideoicon = driver.findElement(
//				By.xpath("(//*[@class='remove-defaults style-scope ytcp-icon-button x-scope iron-icon-0'])[8]"));
//		Actions action = new Actions(driver);
//		action.moveToElement(youtubevideoicon).click().build().perform();

//*===========================================================================================================================================================
//tESTcase 64
		//		Testcase64Reference check1 = new Testcase64Reference();
//		check1.Testcase(driver);
//		wait.until(ExpectedConditions
//				.visibilityOfElementLocated(By.xpath("(//*[@class='style-scope ytcp-paper-checkbox'])[1]")));
//		WebElement dots = driver.findElement(By.xpath("(//*[@class='remove-defaults style-scope ytcp-icon-button x-scope iron-icon-0'])[9]"));
//		Actions action1 = new Actions(driver);
//		action1.moveToElement(dots).click().build().perform();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Download']")));
//
//		driver.findElement(By.xpath("//*[text()='Download']")).click();
//		
//		System.out.println("File download successfully Go to download paly the video");
//=========================================================================================================================================================

	}

}
