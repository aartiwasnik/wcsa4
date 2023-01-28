package TestNGpack2;

import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SelectBrowser {
	WebDriver driver;
		
	
  @Test
  @Parameters("browserValue","Url")
  public void openBrowser(String browserValue) {
	  if(browserValue.equals("chrome"))
	  {
	  System.setProperty("webdriver.chrome","./drivers/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get(Url);
  }
  else
  {
	  Reporter.log("enter valid browser value");
  
	  
  }
}
}
