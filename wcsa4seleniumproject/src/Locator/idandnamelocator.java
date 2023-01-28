package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class idandnamelocator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/login/");
	Thread.sleep(2000);
	driver.findElement(By.id("email")).sendKeys("awasnik57@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("8806aarti");
	driver.findElement(By.name("login")).click();
	}

}
