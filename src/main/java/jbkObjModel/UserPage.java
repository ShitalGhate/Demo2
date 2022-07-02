package jbkObjModel;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {
	@FindBy(xpath="//a[@href='users.html']") public WebElement users;
	@FindBy(xpath="/html/body/div[1]/div[1]/section[1]/h1") public WebElement usrheading;
	@FindBy(xpath="/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button") public WebElement addUserbtn;
	@FindBy(xpath="/html/body/div/div[1]/section[1]/h1") public WebElement addusrheading;
	//@FindBy(xpath="/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table") WebElement table;

	@FindBy(xpath="//tr")  public List<WebElement> tbRows;
	WebDriver driver;
	public String head;
	public UserPage( WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		public void heading()
	{
		users.click();
	 }
		public boolean verifytable()
		{  
			boolean flag=false;
			for(WebElement tbrow: tbRows)
			{
				if(tbrow.isDisplayed())
				flag=true;
			}
			return flag;
				
		}
		public void addUsr()
		{
			addUserbtn.click();
		}
}
