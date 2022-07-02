package jbkObjTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import jbkObjModel.LoginPage;
import jbkObjModel.OperatorPage;
import jbkObjModel.UseFulLinks;

public class UsefulLinksTest {
	LoginPage lp;

	UseFulLinks ul;
	WebDriver driver;
	@BeforeSuite
	public void test1()
	{

		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/java%20by%20kiran/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		 lp=new LoginPage(driver);
		lp.loginToApplication("kiran@gmail.com","123456");
		ul=new UseFulLinks(driver);
	}
	@Test(priority=1)
	public void veryHeading()
	{ 
		ul.clickUsefulLinks();;
		Assert.assertEquals(ul.heading.getText(), "Useful Links");
	}
	@Test(priority=2)
	public void testUsefulLinks()
	{
		boolean b=ul.verifyUsefulLinksr();
		Assert.assertTrue(b);
		
	}
	
	
	@AfterSuite
	public void driverClose()
	{
		driver.close();
	}
	}


