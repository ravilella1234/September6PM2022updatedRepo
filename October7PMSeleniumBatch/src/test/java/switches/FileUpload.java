package switches;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://transfer.pcloud.com/");
		driver.findElement(By.linkText("Click here to add files")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\ravi\\Desktop\\fp.exe");
	}

}
