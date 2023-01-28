package TestNGpack2;

import java.time.Duration;

import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestValidLogin2 {
	static WebDriver driver;
  @Test
  @Parameters({"browser","url","usn","pass"})
  public void method1(String browserValue, String url, String username, String password) {
	  if(browserValue.equals("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get(url);
		  driver.findElement(By.name("username")).sendKeys(username);
		  Thread.sleep(2000);
		  driver.findElement(By.name("pwd")).sendKeys(password);
		  Thread.sleep(2000);
		  driver.findElement(By.id("loginButton")).click();
	  }
	  else if(browserValue.equals("edge"))
	  {
		  System.setProperty("webdriver.cedge.driver","./drivers/edgedriver.exe");
		  driver=new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get(url);
		  driver.findElement(By.name("username")).sendKeys(username);
		  Thread.sleep(2000);
		  driver.findElement(By.name("pwd")).sendKeys(password);
		  Thread.sleep(2000);
		  driver.findElement(By.id("loginButton")).click();

		   }
	  else
	  {
		  Reporter.log("enter valid browser value",true);
	  }
  }
}
