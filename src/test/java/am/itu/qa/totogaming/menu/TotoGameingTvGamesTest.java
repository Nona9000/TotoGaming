package am.itu.qa.totogaming.menu;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.totogaming.base.TotoGamingBaseTest;
import am.itu.qa.totogaming.home.TotoGamingHomePage;
import am.itu.qa.totogaming.login.TotoGamingLoginPage;
import am.itu.qa.totogaming.tvgames.TotoGamingTvGamesPage;

public class TotoGameingTvGamesTest extends TotoGamingBaseTest{
	

	@Test
	public void tvGamesTest() throws InterruptedException {
		System.out.println("Test Started====================");

		TotoGamingHomePage home = new TotoGamingHomePage(this.driver);
		TotoGamingLoginPage login = home.clickOnLogin();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Assert.assertTrue(login.isUsernameDisplayed());
		login = (TotoGamingLoginPage) login.doLogin("nona_yan","Nonavrtanesyan9000");
		Assert.assertTrue(login.isDepositDisplayed());
		TotoGamingTvGamesPage tvGames = new TotoGamingTvGamesPage(this.driver);
		tvGames.clickOnTvGames();
		tvGames.clickOnBetGames();
		Assert.assertTrue(tvGames.isTvGamesDisplayed());

}
}