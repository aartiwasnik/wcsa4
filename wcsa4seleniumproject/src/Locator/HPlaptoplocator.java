package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HPlaptoplocator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("hp laptop");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Core i5']/preceding-sibling::div[@class='_24_Dny']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Brand' and (@class='_2gmUFU _3V8rao')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='HP']/preceding-sibling::div[@class='_24_Dny']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Operating System' and (@class='_2gmUFU _3V8rao')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Windows 11']/preceding-sibling::div[@class='_24_Dny']")).click();
		Thread.sleep(2000);

	 
	 
	 
	 driver.findElement(By.xpath("//div[.='Customer Ratings' and (@class='_213eRC _2ssEMF')]")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//div[.='4★ & above']/preceding-sibling::div[@class='_24_Dny']")).click();
	 Thread.sleep(2000);
	 String priceOflaptop = driver.findElement(By.xpath("//div[.='HP Pavilion Ryzen 5 Hexa Core AMD R5-5600H - (8 GB/512 GB SSD/Windows 10/4 GB Graphics/NVIDIA GeForce ...']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
	System.out.println(priceOflaptop);
	}
}
//button[@class='L0Z3Pu']