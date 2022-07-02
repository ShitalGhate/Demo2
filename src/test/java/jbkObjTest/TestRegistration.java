package jbkObjTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import jbkObjModel.DashBoardPage;
import jbkObjModel.LoginPage;
import jbkObjModel.RegistrationPage;

public class TestRegistration {
	WebDriver driver=null;
	RegistrationPage rp;
		@BeforeClass
	public void test01()
		{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/java%20by%20kiran/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		 rp=new RegistrationPage(driver);
		 rp.getRegistrationPage();
		 System.out.println(driver.getTitle());
		
		}
@Test(priority=1)
	public void test02()
		{
	 Assert.assertEquals(driver.getTitle(),"JavaByKiran | Registration Page");
		//Assert.assertTrue(rp.verifyRegistration());	
	    }
@Test(priority=2)
public void test03()
	{
 	Assert.assertTrue(rp.verifyRegistration());	
    }
@Test(priority=3)
public void test04()
	{
	rp.registerUser();
	String alert=driver.switchTo().alert().getText();
 	Assert.assertEquals(alert, "User registered successfully.");
    }
	@AfterClass
	public void driverClose()
	{
		driver.quit();
	}

}
