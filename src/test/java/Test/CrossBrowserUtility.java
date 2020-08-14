package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CrossBrowserUtility {


 
WebDriver driver;
String driverPath="C:\\Users\\Lotus\\eclipse-workspace\\demo\\src\\test\\resources\\drivers\\";
	public void method(String browserName) {
		switch(browserName)
			{
			case "Chrome":
				
				System.setProperty("webdriver.chrome.driver",driverPath+"chromedriver.exe");
				driver=new ChromeDriver();
				break;
			case "edge":
				
				System.setProperty("webdriver.edge.driver",driverPath+"msedgedriver.exe");
				driver=new EdgeDriver();
				break;
			default :
				
				System.setProperty("webdriver.edge.driver",driverPath+"msedgedriver.exe");
				driver=new EdgeDriver();
				break;
		}
}
	/*	if(browserName.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",driverPath+"chromedriver.exe");
			  driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			
			 driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("edge")){
			System.setProperty("webdriver.edge.driver",driverPath+"msedgedriver.exe");
			driver=new EdgeDriver();
		}
		else {
			System.setProperty("webdriver.chrome.driver",driverPath+"chromedriver.exe");
			 driver=new ChromeDriver();
		}
		}*/
	public static void main(String[] args) {
	CrossBrowserUtility set=new CrossBrowserUtility();
	set.method( "edge");
	
	}
	}