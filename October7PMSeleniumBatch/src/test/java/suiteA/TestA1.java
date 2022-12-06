package suiteA;

import org.testng.annotations.Test;

public class TestA1 
{
  @Test
  public void testA1() throws Exception 
  {
	  System.out.println("Starting TestA1");
	  Thread.sleep(2000);
	  System.out.println("Ending TestA1");
  }
  
}
