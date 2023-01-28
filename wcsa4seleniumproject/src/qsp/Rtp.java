package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Rtp {
public static void main(String[] args) throws InterruptedException {
	
	Scanner Sc=new Scanner(System.in);
	System.out.println("which browser u want to open.....!");
	String browservalue=Sc.next();
	if(browservalue.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//to avoid illegalstateexception
		WebDriver driver=new ChromeDriver();//to launch chrome browser
		driver.manage().window().maximize();//max the browser
		driver.get("https://www.instagram.com");//launch the web application
		Thread.sleep(2000);//to provide delay for script
		driver.close();//to close browser
	}
	else if(browservalue.equalsIgnoreCase("Edge"))
	{
		System.setProperty("webdriver.Edge.driver","./drivers/Edgedriver.exe");
		WebDriver driver=new EdgeDriver();//to launch Edgedriver
		driver.manage().window().maximize();//to max the browser
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);//to provide delay for script
		driver.close();
	}
	else
	{
		System.out.println("enter the valid browser name..!");
		
		
		
		
		
		
		
		
		
	}
		
			
	
	
	
}
}
