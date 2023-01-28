package Mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitimemethod1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://hp/login.do");
		WebElement usernameTextBox = driver.findElement(By.name("username"));
		usernameTextBox.sendKeys("admin");
		if(usernameTextBox.isDisplayed())
		{
			System.out.println("username is wrong");
		}
		Thread.sleep(2000);
		
		WebElement passwordTextBox = driver.findElement(By.name("pwd"));
		passwordTextBox.sendKeys("manager");
		 if(passwordTextBox.isDisplayed())
		{
			System.out.println("password is wrong");
		}
		Thread.sleep(2000);
		usernameTextBox.clear();
		Thread.sleep(2000);
		passwordTextBox.clear();
		
		
	}

}
