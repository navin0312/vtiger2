package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	@FindBy(xpath="//input[@name='user_name']")
	private WebElement userTextfield;
	@FindBy(xpath="//input[@name='user_password']")
	private WebElement passwordTextfield;
	@FindBy(id="submitButton")
	private WebElement loginButton;
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void loginApps()
	{
		userTextfield.sendKeys("admin");
		passwordTextfield.sendKeys("manager");
		loginButton.click();
	}

}
