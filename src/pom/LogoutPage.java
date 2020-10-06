package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogoutPage
{
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement admin;
	@FindBy(xpath="//a[.='Sign Out']")
	private WebElement logoutButton;
	public LogoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void logoutApps(WebDriver driver)
	{
		Actions act=new Actions(driver);
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='themes/softed/images/user.PNG']")));
		System.out.println("hii");
		act.moveToElement(admin).perform();
		logoutButton.click();
	}

}
