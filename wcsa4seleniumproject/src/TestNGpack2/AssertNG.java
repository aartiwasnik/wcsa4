package TestNGpack2;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNG {
  @Test
  public void m1() {
	  Assert.fail();
	  Reporter.log("m1 method",true);
  }
  @Test(dependsOnMethods = "m1",alwaysRun = true)
  public void method2()
  {
	  Reporter.log("this is method2",true);
  }
}
