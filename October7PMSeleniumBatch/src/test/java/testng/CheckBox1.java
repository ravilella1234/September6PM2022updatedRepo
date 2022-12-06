package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import selenium.BaseTest;

public class CheckBox1  extends BaseTest
{
  
	@BeforeMethod(groups = {"regression","smoke"})
	@Parameters("browser")
	public void beforeMethod(String btype) throws Exception 
	{
		System.out.println("startProcess");
	    init();
		test = rep.createTest("CheckBox1");
		test.log(Status.PASS, "Initiating the Property Files...");
				
		launch(btype);
		test.log(Status.INFO, "Opened the Browser :- " + p.getProperty("chromebrowser"));
						
		navigateUrl("chekboxurl");
		test.log(Status.PASS, "Navigated to app :-" + childProp.getProperty("chekboxurl"));
	}
	  
	  
	@Test(groups = {"regression","smoke"})
	public void checkboxTest()
	{
		List<WebElement> check=driver.findElements(By.xpath("//td[@class='table5']/input[@type='checkbox']"));
		for(int i=0;i<check.size();i++)
		{
			System.out.println(check.get(i).getAttribute("value")+"--"+check.get(i).getAttribute("checked"));
			//System.out.println(check.get(i).isSelected());
		}
	}
 

  @AfterMethod(groups = {"regression","smoke"})
  public void afterMethod() 
  {
	  System.out.println("endProcess");
	  	rep.flush();
		driver.quit();
  }

}
