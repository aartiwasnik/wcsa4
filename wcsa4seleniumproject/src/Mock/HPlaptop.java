package Mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HPlaptop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("hp laptop");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Core i5']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Brand']")).click();
		driver.findElement(By.xpath("//div[.='HP']"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Hard Disk Capacity']")).click();
		driver.findElement(By.xpath("//div[.='1 TB']")).click();
		driver.findElement(By.xpath("//div[.='4★ & above']")).click();
		Thread.sleep(2000);
		String price = driver.findElement(By.xpath("//div[text()='HP Core i7 12th Gen - (16 GB/1 TB SSD/Windows 11 Home) 14-DV2015TU Laptop']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
		System.out.println(price+ " is the price of the laptop ");
	}

}
