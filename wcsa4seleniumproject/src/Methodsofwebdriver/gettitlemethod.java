package Methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettitlemethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		String titleOfwebpage = driver.getTitle();
		System.out.println(titleOfwebpage);
		
	}

}
