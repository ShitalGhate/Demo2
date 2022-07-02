package jbkObjModel;


import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
	
	@FindBy(xpath="//h3") 
	public List<WebElement> courses;
	WebDriver driver =null;
	public DashBoardPage(WebDriver driver)
	{ 
		//this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyCourses() {
		boolean flag=false;
		for(WebElement course: courses)
		 {
         flag=course.isDisplayed();
         System.out.println(course.getText());
		 }
		
		return flag;
	}
}
