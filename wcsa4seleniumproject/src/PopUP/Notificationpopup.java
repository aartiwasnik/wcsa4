package PopUP;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notificationpopup {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notification");
		//maxmize the browser without calling manage method
		WebDriver driver=new ChromeDriver();
		co.addArguments("-start-maxmized");
		
		driver.manage().window().maximize();
		driver.get("https://www.puma.com");
		
		
	
				
    
		
		
	}

}

