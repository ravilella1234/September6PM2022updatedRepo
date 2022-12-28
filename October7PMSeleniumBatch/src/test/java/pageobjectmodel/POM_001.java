package pageobjectmodel;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import selenium.BaseTest;

public class POM_001 extends BaseTest
{
  @BeforeMethod
  public void startProcess() throws Exception
  {
	    init();
		test = rep.createTest("POM_001");
		test.log(Status.INFO, "Init the properties files....");
		
		launch("chromebrowser");
		test.log(Status.PASS, "Opening the Browser : " + p.getProperty("chromebrowser"));
		
		navigateUrl("pomurl");
		test.log(Status.INFO, "Navigating to Url : " + childProp.getProperty("pomurl"));
	  
  }
	
  @Test
  public void f() 
  {
	  CustomerLogin obj = new CustomerLogin(driver);
	  obj.customerLogin();
  }
  
  @AfterMethod
  public void endProcess()
  {
	  rep.flush();
	  driver.quit();
  }
}
