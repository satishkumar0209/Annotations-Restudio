package locomotive;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mainrunningprogramme {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "/home/aj/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/watch?v=D-1rqpMONG0");
		
		WebElement ss=driver.findElement(By.cssSelector("#movie_player > div.ytp-chrome-bottom > div.ytp-chrome-controls > div.ytp-left-controls > div > button"));
		
		ss.getCssValue("background-color");
		System.out.println(ss);
//		driver.get("https://www.youtube.com/watch?v=QiuYjEXeZ3o");
//		Thread.sleep(4000);
//		
//		WebElement elem = driver.findElement(By.className("ytp-progress-bar"));
//
//	    int width = elem.getSize().getWidth();
//	    System.out.println(width);
//
//	    Actions act = new Actions(driver);
//	    act.moveToElement(elem).moveByOffset((width/2)-400, 0).click().perform();
//	    Thread.sleep(5000);
//	    Actions act1 = new Actions(driver);
//	    act1.moveToElement(elem).moveByOffset((width/-3)+200, -1).click().perform();
//
//	    System.out.println("1122");
	    
	    
//	    JavascriptExecutor js = (JavascriptExecutor) driver;
//	    js .executeScript("document.getElementById(\"video\").play()");
//		WebDriverWait wait = new WebDriverWait(driver, 30);
//		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("id123")));
//
//		Actions actions = new Actions(driver);
//		WebElement menuElement = driver.findElement(By.id("menu-element-id"));
//		actions.moveToElement(menuElement).moveToElement(driver.findElement(By.xpath("xpath-of-menu-item-element"))).click();
//
//		
//		driver.findElement(By.xpath("")).click();
//		
//		
//		
//		driver.findElement(By.xpath("")).click();
//		driver.findElement(By.xpath("")).click();
//		driver.findElement(By.xpath("")).click();
//		driver.findElement(By.xpath("")).click();
//		

		// Login into Gmail

//		Logintogmail gmail = new Logintogmail();
//		gmail.gmail(driver);
//		
//		
//		
//		

//		myvideos video=new myvideos();
//		video.videos(driver);
		
		
		
		// uploading a video

//		Thread.sleep(2000);
//		
//		driver.get("https://www.youtube.com/timedtext_video?v=VB4Xvxasya4&ar=1");
//		//driver.findElement(By.xpath("//*[text()=' Turn on ']")).click();
//		
//		
//		String s=driver.findElement(By.id("captions-fan-video-link")).getText();
//		System.out.println(s);
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[text()='234']")).click();
//		
//		windows w=new windows();
//		w.Handle(driver);
//		driver.get(s);
		
		
		
	}

}
