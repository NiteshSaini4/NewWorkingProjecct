package PageObjectFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutWebElement {
	WebDriver Currentdriver;
	public LogoutWebElement(WebDriver RmoteDriver) 
	{
		Currentdriver=RmoteDriver;
		PageFactory.initElements(RmoteDriver,this );
	}
	@FindBy(xpath="//a[text()='Log out']") WebElement Logout;
	public void user_log()
	{
		Logout.click();
	}

}


