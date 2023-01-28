package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelementsmethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		List<WebElement>Suggestions=driver.findElements(By.xpath("//div[@class='ytd-searchbox']"));
		for(int i=0;i<Suggestions.size();i++)
		{
			WebElement options=Suggestions.get(i);
			String opt = options.getText();
			Thread.sleep(2000);
			System.out.println(opt);
		}
		
		
		
		
		
	}

}
