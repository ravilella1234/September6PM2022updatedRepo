package testcases;

import org.testng.ITestContext;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PaymentManager 
{
	
  @Test
  public void applyDiscount() 
  {
	  System.out.println("--------------- applyDiscount --------------");
  }
  
  @Test
  @Parameters({"action"})
  public void makePayment(String parameterType,ITestContext context) 
  {
	  if(parameterType.equals("pay@hotel"))
		  System.out.println("--------------- makePayment @hotel--------------");
	  else
		  System.out.println("--------------- makePayment @online--------------");
	  
	  //Booking ID
	  String bookingID = "RRR1234";
	  System.out.println( "BID : " +  bookingID);
	  context.setAttribute("BID", bookingID);
  }
  
}
