package Mock;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;



public class getselectedalloptions1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/awasn/OneDrive/Documents/multiselectdropdown.html");
		WebElement dropdownelement = driver.findElement(By.id("menu"));
	    Select sel=new Select(dropdownelement);
	    for(int i=0;i<5;i++)
	    {
	    	sel.selectByIndex(i);
	    }
	    List<WebElement> alloptions = sel.getAllSelectedOptions();
	  
	    for(WebElement opt:alloptions)
		{
		
			System.out.println(opt.getText());
		}
		{
		
		
	}

	
	}

}

	
