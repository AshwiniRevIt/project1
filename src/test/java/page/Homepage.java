package page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Homepage {
WebDriver driver;

By Email=By.xpath("//input[contains(@name,'id')]");

By Password=By.xpath("//input[contains(@id,'password')]");
//By Age=By.xpath("//input[contains(@id,'age')]");
By ContinueButton=By.xpath("//button[contains(@type,'submit')]");

public void type(String emailid,String password) {

	driver.findElement(Email).sendKeys(emailid);

	driver.findElement(Password).sendKeys(password);	
}
/*public void typeAge(String age) {
driver.findElement(Age).sendKeys(age);
}*/
public void click() {

	driver.findElement(ContinueButton).click();
}
public Homepage(WebDriver driverFromPreviousClass) {

	this.driver=driverFromPreviousClass;
}
}
