package TestNGpack2;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestValidLoging extends BaseTest{

  @Test
  
  public void validlogin() throws InterruptedException {
	  driver.findElement(By.name("username")).sendKeys("admin");
	  Thread.sleep(2000);
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  Thread.sleep(2000);
	  driver.findElement(By.id("loginButton")).click();
  }
}
