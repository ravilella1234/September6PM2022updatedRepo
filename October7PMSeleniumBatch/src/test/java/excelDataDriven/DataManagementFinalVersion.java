package excelDataDriven;

import org.testng.annotations.Test;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.DataProvider;

public class DataManagementFinalVersion 
{
	
  @Test(dataProvider = "getData")
  public void f(Hashtable<String, String> obj) 
  {
	  if(obj.get("RunMode").equals("N"))
		  throw new SkipException("testcase is skipped due to Runmode N");
	  System.out.println(obj.get("UserName"));
	  System.out.println(obj.get("UserPassword"));
  }

  @DataProvider
  public Object[][] getData() throws Exception 
  {
	    ExcelAPI e = new ExcelAPI("C:\\Users\\ravi\\Desktop\\suitex.xlsx");
		String sheetName = "data";
		String testCaseName = "LoginTest";
		
		return DataUtils.getTestData(e, sheetName, testCaseName);
  }
}
