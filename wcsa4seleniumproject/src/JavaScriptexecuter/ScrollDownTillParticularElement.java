package JavaScriptexecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownTillParticularElement {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.get("https://www.selenium.dev/downloads/");
			WebElement rubyelement = driver.findElement(By.xpath("//p[.='Ruby']"));
			Point point = rubyelement.getLocation();
			int xaxis = point.getX();
			int yaxis = point.getY();
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			System.out.println(xaxis);
			System.out.println(yaxis);
			jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-200)+")");
			
		
		} 
			
		 

}
