package Questionsonwhandwhs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//perform (maximize) operation child browser..
public class Question5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriv.chromr.driver","./driver.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		
		String parentTitle = driver.getTitle();
		Set<String> allhandle = driver.getWindowHandles();
		
		for(String wh:allhandle)
		{
			String currentTitle = driver.switchTo().window(wh).getTitle();
			System.out.println(currentTitle);
			if(!parentTitle.equals(currentTitle))
			{
				driver.manage().window().maximize();
			}
			else
			{
				driver.close();
			}
		}
	}

}
