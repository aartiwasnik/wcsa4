package TestNGpack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testNG4 {
  @Test
  public void today() {
	  long threadID= Thread.currentThread().getId();
	  Reporter.log("today method"+"is the thread",true);
  }
  @Test
  public void Tomorrow() {
  long threadID= Thread.currentThread().getId();
  Reporter.log("tomorrow method"+"is the thread",true);
}
}
