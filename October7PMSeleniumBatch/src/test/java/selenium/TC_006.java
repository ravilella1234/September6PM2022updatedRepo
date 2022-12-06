package selenium;

import com.aventstack.extentreports.Status;

public class TC_006 extends BaseTest
{
		
	public static void main(String[] args) throws Exception 
	{
		init();
		test = rep.createTest("TC_006");
		test.log(Status.INFO, "Init the properties files....");
		
		launch("chromebrowser");
		test.log(Status.PASS, "Opening the Browser : " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(Status.INFO, "Navigating to Url : " + childProp.getProperty("amazonurl"));
		
		selectOption("amazonsearchdropbox_id","Books");
		test.log(Status.INFO, "Selecting the option Books By using the locator : " + orProp.getProperty("amazonsearchdropbox_id"));
				
		typeText("amazonsearchtextbox_id","Harry Potter");
		test.log(Status.FAIL,"Entering Text Harry Potter By using locator : " + orProp.getProperty("amazonsearchtextbox_id"));
		
		clickElement("amazonsearchbutton_xpath");
		test.log(Status.INFO, "Clicked on Element By using locator : " + orProp.getProperty("amazonsearchbutton_xpath"));
		
		rep.flush();
	}
}
