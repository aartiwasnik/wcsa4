package PageObjectModel;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import KeywordDrivenFramework.flib;

public class BaseTest implements IAutoconstant {
	static WebDriver driver;
	public void openBrowser() throws IOException
	{
	flib flib = new flib();
	String browserValue = flib.readPropertyData(PROP_PATH, "Browser");
	String url = flib.readPropertyData(PROP_PATH, "Url");
	
	if(browserValue.endsWith("chrome"))
	{
		System.setProperty(CHROME_Value, EDGE_KEY);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
	}
	else if(browserValue.equals("Edge"))
	{
		System.setProperty(EDGE_VALUE, EDGE_KEY);
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
	
	}
	else
	{
		System.out.println("enter valid browser value");
	}
	}
	public void closeBrowser()
	{
	driver.quit();
	


}
}