package jbkObjTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import jbkObjModel.DashBoardPage;
import jbkObjModel.LoginPage;

public class DashboardTest {
	WebDriver driver=null;
	DashBoardPage dp;
		@BeforeSuite
	public void test01()
		{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/java%20by%20kiran/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	    LoginPage lp=new LoginPage(driver);
		dp=lp.getdashboard();
		//lp.loginToApplication("kiran@gmail.com","123456");
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
		}
	@Test(priority=1)
	public void test02()
		{
		//DashBoardPage dp=new DashBoardPage(driver);
		Assert.assertTrue(dp.verifyCourses());	
	    }
	
	@AfterSuite
	public void driverClose()
	{
		driver.close();
	}
	
}
