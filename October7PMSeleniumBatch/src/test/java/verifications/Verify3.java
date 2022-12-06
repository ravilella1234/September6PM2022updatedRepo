package verifications;

import com.aventstack.extentreports.Status;

import selenium.BaseTest;

public class Verify3 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		test = rep.createTest("Verify3");
		test.log(Status.INFO, "Init the properties files....");
		
		launch("chromebrowser");
		test.log(Status.PASS, "Opening the Browser : " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(Status.INFO, "Navigating to Url : " + childProp.getProperty("amazonurl"));
			
		String expectLink = "Customer Servi";
		
		
		if(!isLinksEqual(expectLink))
			//System.out.println("Both links are not equal...");
			reportFailure("Both links are not equal...");
		else
			//System.out.println("Both links are equal...");
			reportSuccess("Both links are equal...");
		
		rep.flush();
		
	}

}
