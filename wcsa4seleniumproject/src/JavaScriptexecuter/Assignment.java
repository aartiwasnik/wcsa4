package JavaScriptexecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/Users/awasn/OneDrive/Desktop/username&pwd.html");
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.id("i2"));
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		if(username.isEnabled())
		{
			username.sendKeys("admin");
			System.out.println("if block is executed");
		}
		else
		{
			js.executeScript("document.getElementById('i2').value='admin'");
			System.out.println("Else block is executed");
			
		}
			Thread.sleep(2000);
			WebElement password = driver.findElement(By.id("pi"));
			
			if(password.isEnabled())
			{
				password.sendKeys("admin123");
				System.out.println("if block is executed");
			}
			else
			{
				js.executeScript("document.getElementById('pi').value='admin123'");
				System.out.println("Else block is executed");
			}
		
		
	}

}
