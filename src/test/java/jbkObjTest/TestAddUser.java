package jbkObjTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import jbkObjModel.AddUserPage;
import jbkObjModel.LoginPage;
import jbkObjModel.UserPage;

public class TestAddUser {
	WebDriver driver=null;
	LoginPage lp;
	AddUserPage ap;
	UserPage up;
	@BeforeClass
		public void test01()
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/java%20by%20kiran/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		lp=new LoginPage(driver);
		lp.loginToApplication("kiran@gmail.com","123456");
		up=new UserPage(driver);
		up.heading();
		up.addUsr();
		ap=new AddUserPage(driver);
		Assert.assertEquals(ap.adurheading.getText(), "Add User");
		
	}
	@Test (priority=1)
	public void test02()
	{
		Assert.assertTrue(ap.verifyUserPage());
	}
@AfterClass
public void closedriver()
{
	driver.quit();
}

}
