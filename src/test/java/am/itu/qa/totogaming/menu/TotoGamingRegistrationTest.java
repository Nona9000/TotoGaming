package am.itu.qa.totogaming.menu;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.totogaming.base.TotoGamingBaseTest;
import am.itu.qa.totogaming.home.TotoGamingHomePage;
import am.itu.qa.totogaming.register.TotoGamingRegisterPage;
import am.itu.qa.totogaming.registration.TotoGamingRegistrationPage;

public class TotoGamingRegistrationTest extends TotoGamingBaseTest {
	
	@Test
	public void registrationTest() throws InterruptedException {
		System.out.println("Test Started====================");

	TotoGamingHomePage home = new TotoGamingHomePage(this.driver);
	TotoGamingRegisterPage register = home.clickOnRegisterBtn();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Assert.assertTrue(register.isRegisterDisplayed());
	TotoGamingRegistrationPage registration = new TotoGamingRegistrationPage(this.driver);
	registration = (TotoGamingRegistrationPage)registration.doNext("Nona","Vrtanesyan","1999","15","11");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	registration.myFirstNameInput();
	registration.myLastNameInput();
	registration.myYearDateInput();
	registration.myMonthInput();
	registration.myDayInput();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    Assert.assertTrue(registration.isRegistrationDisplayed());
	}
}
