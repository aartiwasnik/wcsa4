package qsp;

import org.openqa.selenium.edge.EdgeDriver;

public class launchedgebrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.Edge.driver","./drivers/Edgedriver.exe");
		new EdgeDriver();
	}

}
