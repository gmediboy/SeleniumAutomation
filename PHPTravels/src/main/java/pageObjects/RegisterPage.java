package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
	
	public WebDriver driver;
	
	By name=By.id("user_name");
	By email=By.id("user_email");
	By pass=By.id("user_password");
	By pass_confim=By.id("user_password_confirmation");
	By agree1=By.id("user_unsubscribe_from_marketing_emails");
	By agree2=By.id("user_agreed_to_terms");
	By signup=By.name("commit");
	
	public RegisterPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}
	public WebElement getName()
	{
		return driver.findElement(name);
	}
	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	public WebElement getPass()
	{
		return driver.findElement(pass);
	}
	
	
	public WebElement getPassConfirm()
	{
		return driver.findElement(pass_confim);
	}

	public WebElement getAgree1()
	{
		return driver.findElement(agree1);
	}
	
	public WebElement getAgree2()
	{
		return driver.findElement(agree2);
	}
	
	public WebElement getSignUp()
	{
		return driver.findElement(signup);
	}
}
