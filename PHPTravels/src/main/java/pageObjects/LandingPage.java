package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LandingPage {
	
	public WebDriver driver;
	
	By login = By.cssSelector("a[href*='sign_in']");
	By register = By.cssSelector("a[href*='sign_up']");

	public LandingPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;
	}

	public WebElement getLogin()
	{
		WebElement buttonChoice=driver.findElement(By.xpath("//*[contains(text(),'NO THANKS')]"));
		buttonChoice.click();
		return driver.findElement(login);
	}
	
	public WebElement getRegister()
	{
		WebElement buttonChoice=driver.findElement(By.xpath("//*[contains(text(),'NO THANKS')]"));
		buttonChoice.click();
		return driver.findElement(register);
	}

}
