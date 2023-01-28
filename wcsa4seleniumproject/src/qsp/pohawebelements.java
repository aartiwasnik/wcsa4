package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pohawebelements {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com/");
		driver.switchTo().activeElement().sendKeys("poha calories per 100g");
		Thread.sleep(4000);
		List<WebElement> s=driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		
		for (WebElement suggest : s)
		{
			System.out.println(suggest.getText());
			//System.out.println(poha);
			
			
			
		}
	
	}

}
