package jbkObjModel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserPage {
	@FindBy(className="form-group") public List<WebElement> inputs;
    @FindBy(xpath="//h1") public WebElement adurheading;

public AddUserPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public boolean verifyUserPage()
{ boolean flag=false;
	for(WebElement input: inputs)
	{
		if(input.isDisplayed())
			flag=true;
	}
	return flag;
}
}