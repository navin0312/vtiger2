package generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseGenerics implements AutoconstGenerics
{
	public WebDriver driver;
	@BeforeMethod
	public void openVtigerapp()
	{
		System.setProperty(addressOfBrowser, addressOfDriver);
		driver=new ChromeDriver();
		driver.get(url);
		
	}
	@AfterMethod
	public void closeAlltab()
	{
		driver.quit();
	}

}
