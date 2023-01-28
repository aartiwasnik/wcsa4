package WebdriverElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeysmethods {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement usernameTextBox = driver.findElement(By.name("username"));
		usernameTextBox.sendKeys("admin");
		WebElement passwordTextBox = driver.findElement(By.name("password"));
		passwordTextBox.sendKeys("admin123");
	    driver.findElement(By.xpath("//button[.=' Login ']")).click();
		
		
	}

}

