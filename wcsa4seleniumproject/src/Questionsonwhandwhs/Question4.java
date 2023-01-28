package Questionsonwhandwhs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question4 {
	public static void main(String[] args) throws InterruptedException {
		
	//how to close child browser
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://omayo.blogspot.com/");
	driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
	Thread.sleep(2000);
	String parenthandle = driver.getWindowHandle();
	System.out.println(parenthandle);
	System.out.println("-------------------------------");
	
	Set<String> allhandle = driver.getWindowHandles();
	for(String wh:allhandle)
	{
		System.out.println(wh);
		if(!parenthandle.equals(wh))
		{
			driver.switchTo().window(wh).close();
		}
		else
		{
		}
		}
	}
	

}
