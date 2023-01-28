package PageObjectModel;

import java.io.IOException;

public class ActitimeValidlogin extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		flib flib = new flib();
		LoginPage lp = new LoginPage(driver);
		lp.actiTimeValidLogin(flib.readPropertyData(PROP_PATH, "Username"),flib.readPropertyData(PROP_PATH, "Password"));
	}

}
