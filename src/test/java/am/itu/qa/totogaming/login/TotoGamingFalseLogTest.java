package am.itu.qa.totogaming.login;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.totogaming.base.TotoGamingBaseTest;
import am.itu.qa.totogaming.home.TotoGamingHomePage;
import am.itu.qa.totogaming.login.TotoGamingLoginPage;


public class TotoGamingFalseLogTest extends TotoGamingBaseTest {

	@Test
	public void falseLogTest() throws InterruptedException {

		System.out.println("Test Started====================");

		TotoGamingHomePage home = new TotoGamingHomePage(this.driver);
		TotoGamingLoginPage login = home.clickOnLogin();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
        login = (TotoGamingLoginPage) login.doLogin("nona032684@gmail.com", "123456");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Assert.assertTrue(login.isErrorDisplayed());
        		
        		
	}
}
