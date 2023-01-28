package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Csslocator {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=100");
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("awasnik57@gmail.coo");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("8806aarti");
		driver.findElement(By.cssSelector("button[id='loginbutton']")).click();
		}

}
