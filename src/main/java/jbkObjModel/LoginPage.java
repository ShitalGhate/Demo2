package jbkObjModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver=null;
public @FindBy(id="email") WebElement userName;
public @FindBy(id="password") WebElement password;
public @FindBy(xpath="//button") WebElement loginBtn;


public LoginPage(WebDriver driver)
{
	this.driver=driver;
PageFactory.initElements(driver, this);
}
public void loginToApplication(String uname, String pass)
{   
	//driver.manage().deleteAllCookies();
	clearContents();
	userName.sendKeys(uname);
	password.sendKeys(pass);
	loginBtn.click();
}

 public void clearContents()
 {
	 userName.clear();
	 password.clear();
 }
public DashBoardPage getdashboard()
{
	userName.sendKeys("kiran@gmail.com");
	password.sendKeys("123456");
	loginBtn.click();
	return new DashBoardPage(driver);
}

}

