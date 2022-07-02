package jbkObjTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import jbkObjModel.LoginPage;

public class TestPage {
	LoginPage lp;
	WebDriver driver;
 public void getDriver()
 {
	 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/java%20by%20kiran/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
 }
	@BeforeSuite
	public void test01() {
		getDriver();
		lp = new LoginPage(driver);
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(),"JavaByKiran | Log in");

	}

	@Test(priority = 1)
	public void test02() {
		lp.loginToApplication("","");
	}

	@Test(priority = 3)
	public void test04() {
        
		lp.loginToApplication("kiran@gmail.com", "123456");
		String actmsg=driver.findElement(By.xpath("//small")).getText();
		Assert.assertEquals(actmsg, "Courses Offered");

	}

	@Test(priority = 2)
	public void test03() {

		lp.loginToApplication("@#$%", "#$%");
		String actmsg1=driver.findElement(By.xpath("//div[text()='Please enter email as kiran@gmail.com']")).getText();
		String actmsg2=driver.findElement(By.xpath("//div[text()='Please enter password 123456']")).getText();
		Assert.assertEquals(actmsg1, "Please enter email as kiran@gmail.com");
		Assert.assertEquals(actmsg2, "Please enter password 123456");

	}
/*	@Test(priority = 4)
	public void test05() {

		Assert.assertEquals(lp.dashboard.getText(), "Dashboard");

	}
	
	@Test(priority = 5)
	public void test06() {

		Assert.assertEquals(lp.users.getText(), "Users");

	}
	
	@Test(priority = 6)
	public void test07() {

		Assert.assertEquals(lp.operators.getText(), "Operators");

	}
	@Test(priority = 7)
	public void test08() {

		Assert.assertEquals(lp.usefulLinks.getText(), "Useful Links");

	}
	
	@Test(priority = 8)
	public void test09() {

		Assert.assertEquals(lp.downloads.getText(), "Downloads");

	}
	@Test(priority = 9)
	public void test10() {
        lp.logOut.click();
		Assert.assertEquals(lp.logoutMsg.getText(), "Logout successfully");

	}*/
	@AfterSuite
	public void driverClose()
	{
		driver.close();
	}
	
}
