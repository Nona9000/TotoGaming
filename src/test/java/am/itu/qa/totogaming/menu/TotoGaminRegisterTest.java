package am.itu.qa.totogaming.menu;

import java.util.concurrent.TimeUnit;



import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.totogaming.base.TotoGamingBaseTest;
import am.itu.qa.totogaming.home.TotoGamingHomePage;
import am.itu.qa.totogaming.register.TotoGamingRegisterPage;

public class TotoGaminRegisterTest extends TotoGamingBaseTest{
	
	@Test
	public void registerTest() throws InterruptedException {
		System.out.println("Test Started====================");

	TotoGamingHomePage home = new TotoGamingHomePage(this.driver);
	TotoGamingRegisterPage register = home.clickOnRegisterBtn();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Assert.assertTrue(register.isRegisterDisplayed());
	

}
}