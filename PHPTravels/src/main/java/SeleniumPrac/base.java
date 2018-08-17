package SeleniumPrac;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
	//globally set the driver variable
	public WebDriver driver;
	
	public WebDriver initializeDriver() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\gayatri.mediboyina\\Desktop\\PHPTravels\\src\\main\\java\\SeleniumPrac\\data.properties");
		prop.load(fis);
		
		String browserName = prop.getProperty("browser");
		
		//initializing chrome driver
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\gayatri.mediboyina\\Desktop\\work\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		//Set Implicit Wait set to 10 seconds to driver
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//now send the driver object back
		return driver;
	}
}
