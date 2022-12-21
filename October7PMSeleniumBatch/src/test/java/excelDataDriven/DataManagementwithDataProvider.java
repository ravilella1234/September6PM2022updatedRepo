package excelDataDriven;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataManagementwithDataProvider 
{
	
  @Test(dataProvider = "dp")
  public void f(String RunMode, String Browser, String UserName, String UserPassword) 
  {
	  
  }

  @DataProvider
  public Object[][] dp() throws Exception 
  {
	  ExcelAPI e = new ExcelAPI("C:\\Users\\ravi\\Desktop\\suitex.xlsx");
		String sheetName = "data";
		String testCaseName = "TestB";
		
		// To find matching Testcase RowNumber
		int testStartRowNum = 0;
		while(!e.getCellData(sheetName, 0, testStartRowNum).equals(testCaseName))
		{
			testStartRowNum++;
		}
		System.out.println("test start row number : " + testStartRowNum);
		
		
		int colStartRowNum = testStartRowNum+1;
		int dataStartRowNum = testStartRowNum+2;
		
		//calculate the rows of Data
		int rows = 0;
		while(!e.getCellData(sheetName, 0, dataStartRowNum+rows).equals("")) 
		{
			rows++;
		}
		System.out.println("Total rows are : " +  rows);
		
		//calculate the cols
		int cols = 0;
		while(!e.getCellData(sheetName, cols, colStartRowNum).equals(""))
		{
			cols++;
		}
		System.out.println("Total cols are : " + cols);
		
		//Read the test data
		int dataRow = 0;
		Object[][] data = new Object[rows][cols];
		for(int rNum=dataStartRowNum;rNum<dataStartRowNum+rows;rNum++)
		{
			for(int cNum=0;cNum<cols;cNum++)
			{
				//System.out.println(e.getCellData(sheetName, cNum, rNum));
				data[dataRow][cNum] = e.getCellData(sheetName, cNum, rNum);
			}
			dataRow++;
		}
		return data;
  }
}
