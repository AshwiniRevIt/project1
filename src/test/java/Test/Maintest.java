package Test;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Homepage;

public class Maintest {

	
	WebDriver driver;
	
	@BeforeTest
	public void SetDriver() {
	//String path=System.getProperty("user.dir");
	System.setProperty("webdriver.edge.driver","C:\\Users\\Lotus\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://in.pinterest.com/login/");
	}
	@Test
	public void verifyLogin() {
		Homepage home =new Homepage(driver);
		home.type("Name@gmail.com", "1234");
		
		//home.typeAge("21");
		home.click();
	}
	}
