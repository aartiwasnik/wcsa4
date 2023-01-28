package TestNGpack2;


import java.time.Duration;

import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

 class BaseTest {
	 static WebDriver driver;
  @BeforeMethod

  public void setUp() {
	  
	  
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  driver.get("http://hp/login.do");
	  }
	  
	@Test
	public void validLogin() {
		
	}
		  
	  
  }

