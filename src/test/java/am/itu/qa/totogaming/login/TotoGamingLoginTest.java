package am.itu.qa.totogaming.login;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.totogaming.base.TotoGamingBaseTest;
import am.itu.qa.totogaming.home.TotoGamingHomePage;
import am.itu.qa.totogaming.login.TotoGamingLoginPage;

public class TotoGamingLoginTest extends TotoGamingBaseTest {

	@Test
	public void loginTest() throws InterruptedException {
		System.out.println("Test Started====================");

		TotoGamingHomePage home = new TotoGamingHomePage(this.driver);
		TotoGamingLoginPage login = home.clickOnLogin();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        login = (TotoGamingLoginPage) login.doLogin("nona_yan","Nonavrtanesyan9000");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Assert.assertTrue(login.isDepositDisplayed());
	}

}
