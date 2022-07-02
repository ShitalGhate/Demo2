package jbkObjModel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UseFulLinks {
	@FindBy(xpath="//span[text()='     Useful Links']") public WebElement ufl;
	@FindBy(xpath="//h1")  	public WebElement heading;
    @FindBy(xpath="//tr") 	public List<WebElement> rows;
    @FindBy(xpath="//td[3]") 	public  WebElement clickLabel;
  
	public void clickUsefulLinks()
	{
		ufl.click();
	}
	public UseFulLinks(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public boolean verifyUsefulLinksr()
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
