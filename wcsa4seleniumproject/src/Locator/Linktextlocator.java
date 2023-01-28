package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktextlocator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=100");
		driver.findElement(By.linkText("Forgotten account?")).click();
		driver.findElement(By.id("identify_email")).sendKeys("awasnik57@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("did_submit")).click();
	}

}
