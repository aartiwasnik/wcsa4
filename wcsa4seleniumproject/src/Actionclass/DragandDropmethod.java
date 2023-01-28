package Actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropmethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(4000);
		WebElement srs = driver.findElement(By.xpath("//a[.=' SALES ']"));
        WebElement target = driver.findElement(By.xpath("//li[@class='placeholder'])[li]"));
	        Actions act = new Actions(driver);
	        act.dragAndDrop(srs, target).perform();
		
	}
		
	}
	


