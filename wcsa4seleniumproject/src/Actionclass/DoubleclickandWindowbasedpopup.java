package Actionclass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleclickandWindowbasedpopup {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://hp/login.jsp");
	     Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("//a[contains(@class,'content administration')]")).click();
		driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
		driver.findElement(By.xpath("//input[contains(@id,'uploadNewLogoOption')]")).click();
		Thread.sleep(2000);
		WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.doubleClick(target).perform();
		File file = new File("./autoIt/auto.exe");
		String abs = file.getAbsolutePath();
		Thread.sleep(2000);
		Runtime.getRuntime().exec(abs);
		
		Thread.sleep(2000);
		Runtime.getRuntime().exec(abs);
	}

}
