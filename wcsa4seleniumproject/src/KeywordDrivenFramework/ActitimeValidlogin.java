package KeywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeValidlogin  {
	public static void main (String[]args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		flib flib = new flib();
		String url = flib.readPropertyData("./data/config.properties","url");
		String username = flib.readPropertyData(".data/config.properties","username");
		String password = flib.readPropertyData(".data/config.properties","password");
		driver.get(url);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
	}

}
