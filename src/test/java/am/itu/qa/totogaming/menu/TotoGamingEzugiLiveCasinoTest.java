package am.itu.qa.totogaming.menu;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.totogaming.base.TotoGamingBaseTest;
import am.itu.qa.totogaming.ezugilivecasino.TotoGamingEzugiLiveCasinoPage;
import am.itu.qa.totogaming.home.TotoGamingHomePage;
import am.itu.qa.totogaming.livecasino.TotoGamingLiveCasinoPage;
import am.itu.qa.totogaming.login.TotoGamingLoginPage;

public class TotoGamingEzugiLiveCasinoTest extends TotoGamingBaseTest{
	
	
	@Test
	public void ezugiLiveCasinoTest() throws InterruptedException {
		System.out.println("Test Started====================");

		TotoGamingHomePage home = new TotoGamingHomePage(this.driver);
		TotoGamingLoginPage login = home.clickOnLogin();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Assert.assertTrue(login.isUsernameDisplayed());
		login = (TotoGamingLoginPage) login.doLogin("nona_yan","Nonavrtanesyan9000");
		Assert.assertTrue(login.isDepositDisplayed());
		TotoGamingLiveCasinoPage liveCasino = new TotoGamingLiveCasinoPage(this.driver);
        liveCasino.clickOnLiveCasino();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        TotoGamingEzugiLiveCasinoPage ezugiPage = new TotoGamingEzugiLiveCasinoPage(this.driver);
        ezugiPage.clickOnEzugiLiveCasino();
        Assert.assertTrue(ezugiPage.isEzugiLiveCasinoDisplayed());
}
}
