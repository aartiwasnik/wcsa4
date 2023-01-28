package DataDrivenFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeValidkogin {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hp/login.do");
        Flib flib = new Flib();
       String username = flib.readExcelData("./data/ActitimeTestData.xlsx", "validcreds", 1,0);
      String password = flib.readExcelData("./data/ActitimeTestData.xlsx", "validcreds", 1,1); 
       
       driver.findElement(By.name("username")).sendKeys(username);
       Thread.sleep(2000);
       driver.findElement(By.name("pwd")).sendKeys(password);
       Thread.sleep(2000);
       driver.findElement(By.id("loginButton")).click();
       

       
       
	}

}
