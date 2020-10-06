package scripts;

import org.testng.annotations.Test;



import generics.BaseGenerics;
import pom.LoginPage;
import pom.LogoutPage;

public class TestLoginLogoutScipts extends BaseGenerics
{
	@Test
	public void login_logout_operation() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.loginApps();
		System.out.println("login gets done sucessfully");
		Thread.sleep(3000);
		LogoutPage lp1=new LogoutPage(driver);
		lp1.logoutApps(driver);
		System.out.println("logout gets done sucessfully");
		
		
	}

}
