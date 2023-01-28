package Pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class poha {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.switchTo().activeElement().sendKeys("poha");
		List<WebElement> Suggestions = driver.findElements(By.xpath("//div[@class='sbic sb43']"));
		System.out.println(Suggestions.size());
		{
			for(WebElement s:Suggestions)
			{
				System.out.println(s.getText());
			}
		}
}
}