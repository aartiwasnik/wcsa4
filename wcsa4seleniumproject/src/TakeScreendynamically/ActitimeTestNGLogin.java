package TakeScreendynamically;

import static org.junit.Assert.assertArrayEquals;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(CustmeListner.class)

public class ActitimeTestNGLogin extends BaseTest {
	@BeforeMethod
	public void setUp()
	{
		initialization();
	}
  @Test(priority = 1)
  public void LogInPage() throws InterruptedException {
	  SoftAssert sa = new SoftAssert();
	String actualLoginPageTitle = driver.getTitle();
	sa.assertEquals(actualLoginPageTitle,"actiTime - Login");
	 driver.findElement(By.name("username")).sendKeys("admin");
	  Thread.sleep(2000);
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  Thread.sleep(2000);
	  driver.findElement(By.id("loginButton")).click();
	  sa.assertAll();
  }
	  
	  
	  
	  @Test(priority = 1)
	  public void HomePage(){
		  SoftAssert sa = new SoftAssert();
		String actualHomePage=driver.getTitle();
		sa.assertEquals(actualHomePage,"actiTime-Home");
		 driver.findElement(By.name("username")).sendKeys("admin");
		  Thread.sleep(2000);
		  driver.findElement(By.name("pwd")).sendKeys("manager");
		  Thread.sleep(2000);
		  driver.findElement(By.id("loginButton")).click();
	  Thread.sleep(2000);
	  
String actualHomePageTitle = driver.getTitle();
Assert.assertEquals(actualHomePageTitle, "actiTIME - Enter Time-Track");
Thread.sleep(2000);
driver.findElement(By.id("SubmitButton").click();
 
	  }
  @AfterMethod
  public void tearDown()
  {
	  driver.quit();
  }
  
  
  
  
}
