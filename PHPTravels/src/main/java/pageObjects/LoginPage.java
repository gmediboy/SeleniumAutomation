package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	By email = By.id("user_email");
	By pass = By.id("user_password");
	By login = By.name("commit");
	
	public LoginPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}

	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	
	public WebElement getPass()
	{
		return driver.findElement(pass);
	}
	
	public WebElement getLogin()
	{
		return driver.findElement(login);
	}

}
