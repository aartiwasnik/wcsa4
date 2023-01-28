package DataDrivenFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeInvalidlogin {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://hp/login.do");
		Flib flib = new Flib();
		for(int i=1;i<=6;i++)
		{
		String username = flib.readExcelData("./data/ActitimeTestData.xlsx", "invalidcreds" ,i ,0 );
		String password = flib.readExcelData("./data/ActitimeTestData.xlsx", "invalidcreds" ,i ,1 );
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys(username);
		Thread.sleep(1000);
		driver.findElement(By.name("pwd")).sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).clear();
	

	}

}
}
