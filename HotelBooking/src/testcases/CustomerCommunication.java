package testcases;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class CustomerCommunication 
{
	
  @Test
  public void checkEmailVerification(ITestContext context) 
  {
	  String bookID = (String)context.getAttribute("BID");
	  System.out.println("--------------- checkEmailVerification -------------- : "+  bookID );
  }
  
  @Test
  public void checkMobileVerification(ITestContext context) 
  {
	  String bookID = (String)context.getAttribute("BID");
	  System.out.println("--------------- checkMobileVerification -------------- : " +  bookID);
  }
  
}
