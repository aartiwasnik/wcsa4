package Methodsofwebdriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetwindowhandleandHandles {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		String parentHandle = driver.getWindowHandle();
		System.out.println(parentHandle);
		
		//get window handles
		
		Set<String> allhandles = driver.getWindowHandles();
		for(String wh:allhandles)
		{
			System.out.println(wh);
		}
	}

}
