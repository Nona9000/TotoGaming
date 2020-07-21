package am.itu.qa.totogaming.menu;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.totogaming.base.TotoGamingBaseTest;
import am.itu.qa.totogaming.deposit.visa.TotoGamingDepositVisaPage;
import am.itu.qa.totogaming.home.TotoGamingHomePage;
import am.itu.qa.totogaming.login.TotoGamingLoginPage;

public class TotoGamingDepositVisaTest extends TotoGamingBaseTest {
	
	@Test
	public void depositVisaTest() throws InterruptedException {
		System.out.println("Test Started====================");

		TotoGamingHomePage home = new TotoGamingHomePage(this.driver);
		TotoGamingLoginPage login = home.clickOnLogin();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Assert.assertTrue(login.isUsernameDisplayed());
		login = (TotoGamingLoginPage) login.doLogin("nona_yan","Nonavrtanesyan9000");
		Assert.assertTrue(login.isDepositDisplayed());
		TotoGamingDepositVisaPage depositVisa = new TotoGamingDepositVisaPage(this.driver);
		depositVisa.clickOnCasinoInput();
		depositVisa.clickEgtButton();
		depositVisa.clickOnDepositButton();
	    depositVisa.clickOnVisaButton();
	    Assert.assertTrue(depositVisa.isVisaDisplayed());
}
}