package PopUP;

import java.time.Duration;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/Users/awasn/OneDrive/Documents/PopUp.html");
		WebElement button = driver.findElement(By.xpath("//button[.='click me!']"));
		button.click();
		//now switch ur control to alert popup
		Alert a1 = driver.switchTo().alert();
		
		//accept the popup alert
		Thread.sleep(2000);
		//a1.accept();
		
		//dismiss the alert popup
		//a1.dismiss();
		
		//text of alert popup
		//String textofalert = a1.getText();
		//System.out.println(textofalert);
		
		//sendkeys the alert popup
		a1.sendKeys("admin");
	}

}
