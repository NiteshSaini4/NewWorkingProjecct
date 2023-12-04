package PageObjectFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginWebElement {
	WebDriver Currentdriver;
	public LoginWebElement(WebDriver RmoteDriver) 
	{
		Currentdriver=RmoteDriver;
		PageFactory.initElements(RmoteDriver,this );
	}
	@FindBy(id="username") WebElement Username;
	@FindBy(id="password") WebElement Password;
	@FindBy(id="submit") WebElement Submit;
	@FindBy(xpath="//a[text()='Log out']") WebElement Logout;
	public void user_name(String user)
	{
		Username.sendKeys(user);
	}
	public void user_pass(String pass)
	{
		Password.sendKeys(pass);
	}
	public void user_sub()
	{
		Submit.click();
	}
	public void user_log1()
	{
		Logout.click();
	} 

}
