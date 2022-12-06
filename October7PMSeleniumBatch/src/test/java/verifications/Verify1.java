package verifications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify1 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		//String actualLink = driver.findElement(By.linkText("Customer Service")).getText();
		String actualLink = driver.findElement(By.linkText("Customer Service")).getAttribute("innerHTML");
		String expectLink = "Customer Serv";
		
		System.out.println("Actual Link : " +  actualLink);
		System.out.println("Expected Link : " +  expectLink);
		
		//if(actualLink.equals(expectLink))
		//if(actualLink.equalsIgnoreCase(expectLink))
		if(actualLink.contains(expectLink))
			System.out.println("Both Links are equal...");
		else
			System.out.println("Both Links are not equal...");
		
		
		
	}

}
