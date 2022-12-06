package testng;

import org.testng.annotations.Test;

public class TestMethodsParallel 
{
	
  @Test
  public void test1() 
  {
	  System.out.println("Iam test1 : " +Thread.currentThread().getId());
  }
  
  @Test
  public void test2() 
  {
	  System.out.println("Iam test2: " +Thread.currentThread().getId());
  }
  
  @Test
  public void test3() 
  {
	  System.out.println("Iam test3 : " +Thread.currentThread().getId());
  }
  
  @Test
  public void test4() 
  {
	  System.out.println("Iam test4 : " +Thread.currentThread().getId());
  }
  
  @Test
  public void test5() 
  {
	  System.out.println("Iam test5 : " +Thread.currentThread().getId());
  }
  
  @Test
  public void test6() 
  {
	  System.out.println("Iam test6 : " +Thread.currentThread().getId());
  }
  
  @Test
  public void test7() 
  {
	  System.out.println("Iam test7 : " +Thread.currentThread().getId());
  }
  
}
