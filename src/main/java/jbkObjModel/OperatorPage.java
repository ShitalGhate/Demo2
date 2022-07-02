package jbkObjModel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OperatorPage {
	 @FindBy(xpath="//span[text()='Operators']")  	
	 public WebElement optrs;
	 @FindBy(xpath="//h1")  	public WebElement heading;
    // @FindBy(xpath="//h3") 	public WebElement head3;
	 @FindBy(xpath="//tr") 	public List<WebElement> rows;
	
	public void clickOperators()
	{
		optrs.click();
	}
	public OperatorPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public boolean verifyOperator()
	{
		boolean flag=false;
		for(WebElement row: rows)
		{
			if(row.isDisplayed())
				flag=true;
		}
			return flag;
	}
	

}
