package jbkObjModel;



import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class RegistrationPage {
		@FindBy(xpath="/html/body/div/div[2]/a") public WebElement click1;
		@FindBy(id="name")  WebElement name;
		@FindBy(id="mobile")  WebElement mob;
		@FindBy(id="email")  WebElement email;
		@FindBy(id="password")  WebElement pass;
		@FindBy(xpath="//button")  public WebElement btn;
		String alert=null;
		WebDriver driver =null;
		public RegistrationPage (WebDriver driver)
		{ 
			PageFactory.initElements(driver, this);
		}
		public void getRegistrationPage()
		{
			click1.click();
		}
		
			public boolean verifyRegistration() 
		{    				 
	   if (name.isDisplayed()==true && mob.isDisplayed()==true && email.isDisplayed()==true &&  pass.isDisplayed()==true && btn.isDisplayed()==true)
			   return true;
		else
			   return false;
		
		}
			public void registerUser()
			{
				name.sendKeys("shital");
				mob.sendKeys("9960205974");
				email.sendKeys("shitu_rt123@rediffmail.com");
				pass.sendKeys("shyamal");
				btn.click();
				//alert=driver.switchTo().alert().getText();
				
			}
	}
			 


