package switches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		//driver.switchTo().frame(driver.findElement(By.name("packageListFrame")));
		driver.switchTo().frame(0);
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		driver.switchTo().defaultContent();
		
		//driver.switchTo().frame(driver.findElement(By.name("packageFrame")));
		driver.switchTo().frame(1);
		driver.findElement(By.linkText("Alert")).click();
		driver.switchTo().defaultContent();
		
		//driver.switchTo().frame(driver.findElement(By.name("classFrame")));
		driver.switchTo().frame(2);
		driver.findElement(By.linkText("accept")).click();
	}

}
