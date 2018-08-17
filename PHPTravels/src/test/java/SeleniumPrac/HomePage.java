package SeleniumPrac;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.RegisterPage;


public class HomePage extends base {

	@Test
	public void basePageNavigation() throws IOException
	{
		driver = initializeDriver();
		driver.get("http://www.qaclickacademy.com/");
		

		LandingPage page = new LandingPage(driver);
		
//		//To click on Register button from Landing Page		
//		page.getRegister().click();
//		
//		//On entering to register page 
//		RegisterPage rpage = new RegisterPage(driver);
//		rpage.getName().sendKeys("Gayatri");
//		rpage.getEmail().sendKeys("gayatri.santhoshi01@gmail.com");
//		rpage.getPass().sendKeys("Kitkat@01");
//		rpage.getPassConfirm().sendKeys("Kitkat@01");
//		rpage.getAgree1().click();
//		rpage.getAgree2().click();
//		rpage.getSignUp().click();

		//To click on Login button from Landing Page		
		page.getLogin().click();		
		
		
		//On entering to Login Page
		LoginPage log = new LoginPage(driver);
		log.getEmail().sendKeys("gayatri.santhoshi01@gmail.com");
		log.getPass().sendKeys("Kitkat@01");
		log.getLogin().click();
		
	}
}
