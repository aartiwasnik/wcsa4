package Assignment;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EleminateLinkedlist {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/awasn/OneDrive/Documents/multiselectdropdown.html");
		WebElement dropdownelement = driver.findElement(By.id("menu"));
		Select sel = new Select(dropdownelement);
		List<WebElement> alloptions = sel.getOptions();
		LinkedList<String>S=new LinkedList<String>();
		for(int i=0;i<alloptions.size();i++)
		{
			 
			  WebElement opts = alloptions.get(i);
			  String values = opts.getText();
			  S.add(values);
		}
		for(String options:S)
		{
			System.out.println(options);
		}
	}

}
