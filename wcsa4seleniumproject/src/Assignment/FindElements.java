package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		List<WebElement> img = driver.findElements(By.tagName("//img"));
		int size = img.size();
		System.out.println(size);
		for(WebElement a:img)
		{
			System.out.println(img);
	 String text = a.getText();
		System.out.println(text );
		}
	}
}

//}
