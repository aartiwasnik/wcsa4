package KeywordDrivenFramework;

import java.io.IOException;

public class ActiTimeInvalidLogin extends BaseTest {
public static void main (String[]args) throws IOException
{
	BaseTest bt = new BaseTest();
	bt.openBrowser();
	
	flib flib = new flib();
	int rc = flib.rowCount(EXCEL_PATH, "invalidcreds");
	for(int i=1;i<=rc;i++)
		flib.re
	{
	
	}
	
	
}
}
