package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classname {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=	new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
     driver.switchTo().activeElement().sendKeys("sharukhan",Keys.ENTER);
     driver.findElement(By.className("kAOS0")).click();
     Thread.sleep(2000);
     driver.close();
	}

}
