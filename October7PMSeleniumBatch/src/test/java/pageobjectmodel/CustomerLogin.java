package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerLogin 
{
	@FindBy(id="username") public WebElement userName;
	@FindBy(name="password")public WebElement password;
	@FindBy(xpath="//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")public WebElement loginButton;
	
	public CustomerLogin(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public void customerLogin()
	{
		userName.sendKeys("qatest98984@gmail.com");
		password.sendKeys("password");
		loginButton.click();
	}
}
