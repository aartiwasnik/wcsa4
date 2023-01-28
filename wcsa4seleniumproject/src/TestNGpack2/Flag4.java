package TestNGpack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4 {
  @Test
  public void LogInMethod() {
	  Reporter.log("Log IN is Done!!",true);
  }
  @Test(dependsOnMethods = "LogInmethod")
  public void createUser()
  {
	  Reporter.log("user created!!",true);
  }
  @Test(dependsOnMethods = "CreateUser")
  public void LogoutMethod()
  {
	  Reporter.log("log out done!!",true);
  
}
}
