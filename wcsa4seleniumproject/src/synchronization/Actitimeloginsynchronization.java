package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actitimeloginsynchronization {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.flipkart.com");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
				driver.findElement(By.xpath("//button[.='✕']")).click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
				driver.findElement(By.xpath("//span[.='Cart']")).click();
				driver.findElement(By.xpath("//button[@class='_2KpZ6l _1sbqEe _3AWRsL']")).click();
				
	}

}
