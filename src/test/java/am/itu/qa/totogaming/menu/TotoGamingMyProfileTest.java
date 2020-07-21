package am.itu.qa.totogaming.menu;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.totogaming.base.TotoGamingBaseTest;
import am.itu.qa.totogaming.deposit.TotoGamingDepositPage;
import am.itu.qa.totogaming.home.TotoGamingHomePage;
import am.itu.qa.totogaming.login.TotoGamingLoginPage;
import am.itu.qa.totogaming.myprofile.TotoGamingMyProfilePage;

public class TotoGamingMyProfileTest extends TotoGamingBaseTest{
	
	@Test
	public void myProfileTest() throws InterruptedException {
		System.out.println("Test Started====================");

		TotoGamingHomePage home = new TotoGamingHomePage(this.driver);
		TotoGamingLoginPage login = home.clickOnLogin();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		login = (TotoGamingLoginPage) login.doLogin("nona_yan","Nonavrtanesyan9000");
		TotoGamingDepositPage depositPage = new TotoGamingDepositPage(this.driver);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		depositPage.deposit();
		depositPage.clickOnCasinoBtn();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Assert.assertTrue(depositPage.isDepositDisplayed());
		TotoGamingMyProfilePage myProfile = new TotoGamingMyProfilePage(this.driver);
		myProfile.clickOnMyProfile();
		Assert.assertTrue(myProfile.isMyProfileDisplayed());
	}
}
