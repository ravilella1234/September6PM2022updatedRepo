package testng;

import java.util.Arrays;

import org.testng.TestNG;

public class RunSuitesParallel 
{

	public static void main(String[] args) 
	{
		
	/*	String[] s1 = new String[2]; 
		String[] s2 = {"s1","s2"};
		String[] s3 = new String[] {"s1","s2"};*/
		
		TestNG obj = new TestNG();
		obj.setTestSuites(Arrays.asList(new String[] {System.getProperty("user.dir")+"//megasuite.xml"}));
		obj.setSuiteThreadPoolSize(2);
		obj.run();
	}

}
