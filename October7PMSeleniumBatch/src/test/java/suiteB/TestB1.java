package suiteB;

import org.testng.annotations.Test;

public class TestB1 
{
  @Test
  public void testB1() throws Exception 
  {
	  System.out.println("Starting TestB1");
	  Thread.sleep(2000);
	  System.out.println("Ending TestB1");
  }
}
