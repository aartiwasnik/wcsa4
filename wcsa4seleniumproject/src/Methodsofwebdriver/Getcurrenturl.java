package Methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getcurrenturl {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/awasn/OneDrive/Documents/checkbox.html");
		String currenturl=driver.getCurrentUrl();
		Thread.sleep(2000);
		System.out.println(currenturl);
	}

}
