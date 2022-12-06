package actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggetionBox 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("hadoop tutorial");
		String val = driver.findElement(By.name("q")).getAttribute("value");

		List<WebElement> list = driver.findElements(By.xpath("(//div[@class='OBMEnb'])[1]/ul[@jsname='bw4e9b']/li/div/div[2]/div/span"));
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getText().equalsIgnoreCase(val))
			{
				list.get(i).click();
				return;
			}
		}
	}

}
