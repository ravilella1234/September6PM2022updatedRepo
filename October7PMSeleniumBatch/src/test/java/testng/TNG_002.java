package testng;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import selenium.BaseTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;

public class TNG_002 extends BaseTest
{
  
  @BeforeMethod(groups = {"regression","sanity"})
  @Parameters("browser")
  public void startProcess(String btype) throws Exception 
  {
	  System.out.println("startProcess");
	    init();
		test = rep.createTest("TNG_002");
		test.log(Status.INFO, "Init the properties files....");
		
		launch(btype);
		test.log(Status.PASS, "Opening the Browser : " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(Status.INFO, "Navigating to Url : " + childProp.getProperty("amazonurl"));
  }
  
  @Test(groups = {"regression","sanity"})
  public void amazon() 
  {
	  System.out.println("amazon");
	    selectOption("amazonsearchdropbox_id","Books");
		test.log(Status.INFO, "Selecting the option Books By using the locator : " + orProp.getProperty("amazonsearchdropbox_id"));
				
		typeText("amazonsearchtextbox_id","Harry Potter");
		test.log(Status.FAIL,"Entering Text Harry Potter By using locator : " + orProp.getProperty("amazonsearchtextbox_id"));
		
		clickElement("amazonsearchbutton_xpath");
		test.log(Status.INFO, "Clicked on Element By using locator : " + orProp.getProperty("amazonsearchbutton_xpath"));
  }

  @AfterMethod(groups = {"regression","sanity"})
  public void endProcess()
  {
	  System.out.println("endProcess");
	  rep.flush();
	  driver.quit();
  }

}
