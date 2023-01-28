package Locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Andlocatorcase4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.puma.com/in/en?utm_aud=OTH&utm_campaign=BS_GGL_SEA_TXT_OTH_Brand_New&utm_medium=BS&utm_obj=OLC&utm_source=GGL");
		Thread.sleep(2000);
	}

}
