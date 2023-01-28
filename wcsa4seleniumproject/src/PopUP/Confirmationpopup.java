package PopUP;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirmationpopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/Users/awasn/OneDrive/Documents/confirmpopup.html");
		driver.findElement(By.xpath("//button[.='click me!']")).click();
		Alert a1 = driver.switchTo().alert();
		//accept the popup alert
		a1.accept();
		Thread.sleep(2000);
		//dismis the popup alert
		a1.dismiss();
		
				
	}

}
