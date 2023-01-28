package TestNGpack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NoAannotation {
  @Test
  public void test() {
	  Reporter.log(null);
  }
}
