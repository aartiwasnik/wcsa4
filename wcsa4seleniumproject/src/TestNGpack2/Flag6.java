package TestNGpack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6 {
  @Test(groups = "FUNCTIONAL")
  public void ft1() {
	  Reporter.log("Functional Testing",true);
  }
  @Test(groups = "INTEGRATION")
  public void it1()
  {
	  Reporter.log("Integration Testing1",true);
  }
  @Test(groups = "SYSTEM")
  public void st1()
  {
	  Reporter.log("System Testing",true);
  }

//----------------------------------------------------------------------------------------------------

	  @Test(groups = "FUNCTIONAL")
	  public void ft2() {
		  Reporter.log("Functional Testing",true);
	  }
	  @Test(groups = "INTEGRATION")
	  public void it2()
	  {
		  Reporter.log("Integration Testing1",true);
	  }
	  @Test(groups = "SYSTEM")
	  public void st2()
	  {
		  Reporter.log("System Testing",true);
	  }
//----------------------------------------------------------------------------------------------
	  
		  @Test(groups = "FUNCTIONAL")
		  public void ft3() {
			  Reporter.log("Functional Testing",true);
		  }
		  @Test(groups = "INTEGRATION")
		  public void it3()
		  {
			  Reporter.log("Integration Testing1",true);
		  }
		  @Test(groups = "SYATEM")
		  public void st3()
		  {
			  Reporter.log("System Testing",true);
		  }
		  //-------------------------------------------------------------------------------------------------
		  
			  @Test(groups = "FUNCTIONAL")
			  public void ft4() {
				  Reporter.log("Functional Testing",true);
			  }
			  @Test(groups = "INTEGRATION")
			  public void it4()
			  {
				  Reporter.log("Integration Testing1",true);
			  }
			  @Test(groups = "SYSTEM")
			  public void st4()
			  {
				  Reporter.log("System Testing",true);
			  }
			  //-----------------------------------------------------------
			
				  @Test(groups = "FUNCTIONAL")
				  public void ft5() {
					  Reporter.log("Functional Testing",true);
				  }
				  @Test(groups = "INTEGRATION")
				  public void it5()
				  {
					  Reporter.log("Integration Testing1",true);
				  }
				  @Test(groups ="SYSTEM")
				  public void st5()
				  {
					  Reporter.log("System Testing",true);
				  }
}