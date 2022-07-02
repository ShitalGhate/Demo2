package jbkObjTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import jbkObjModel.LoginPage;
import jbkObjModel.OperatorPage;

public class OperatorTest {
LoginPage lp;

OperatorPage op;
WebDriver driver;
@BeforeSuite
public void test1()
{

	 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("file:///C:/Users/HP/Desktop/java%20by%20kiran/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	lp=new LoginPage(driver);
	lp.loginToApplication("kiran@gmail.com","123456");
	op=new OperatorPage(driver);
}
@Test(priority=1)
public void veryHeading()
{ 
	op.clickOperators();
	Assert.assertEquals(op.heading.getText(), "Operators");
}
@Test(priority=2)
public void testOperator()
{
	boolean b=op.verifyOperator();
	Assert.assertTrue(b);
	
}
@AfterSuite
public void driverClose()
{
	driver.close();
}
}
