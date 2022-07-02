package jbkObjTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import jbkObjModel.LoginPage;
import jbkObjModel.UserPage;

public class UserTest {
WebDriver driver=null;
UserPage up;
LoginPage lp;
@BeforeClass
public void test01()
{
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("file:///C:/Users/HP/Desktop/java%20by%20kiran/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	lp=new LoginPage(driver);
	lp.loginToApplication("kiran@gmail.com", "123456");
	 up= new UserPage(driver);
	
}
@Test (priority=1)
public void test02()
{
	up.heading();
	Assert.assertEquals(up.usrheading.getText(),"Users");
}
@Test(priority=2)
public void test04()
{
	Assert.assertTrue(up.verifytable());
}
@Test (priority=3)
public void test03()
{
	up.addUsr();
	Assert.assertEquals(up.addusrheading.getText(), "Add User");
}
@AfterClass
public void closeDriver()
{
	driver.quit();
}
}
