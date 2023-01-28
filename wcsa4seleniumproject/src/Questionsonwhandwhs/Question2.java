package Questionsonwhandwhs;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// how to close parent & child window without using quit()
public class Question2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		Thread.sleep(2000);
		String parenthandle = driver.getWindowHandle();
		System.out.println(parenthandle);
		
		Set<String> allhandle = driver.getWindowHandles();
		for(String wh:allhandle)
		{
			System.out.println(wh);
		
		
		driver.switchTo().window(wh).close();
		}
	}

}
