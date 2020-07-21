package am.itu.qa.totogaming.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.totogaming.base.TotoGamingBasePage;
import am.itu.qa.totogaming.gamehistory.TotoGamingGameHistoryPage;
import am.itu.qa.totogaming.login.TotoGamingLoginPage;
import am.itu.qa.totogaming.register.TotoGamingRegisterPage;

public class TotoGamingHomePage extends TotoGamingBasePage {

	public TotoGamingHomePage(WebDriver driver) {
		super(driver);
	}

	public static final String MY_LOG_IN_XPATH = "//a[@class='loginDialog tl_login_button ternBtn transBg']";
	public static final String MY_PROFILE_XPAT = "//i[@class='tf_user_icon dropdownColor']";
    public static final String REGISTER_XPATH = "//a[@class='registerDialog tl_register_button primBtn transBg']";
    
	@FindBy(xpath = MY_LOG_IN_XPATH)
	WebElement myLogin;

	@FindBy(xpath = MY_PROFILE_XPAT)
	WebElement myProfile;
	
	@FindBy(xpath = REGISTER_XPATH)
	WebElement register;

	public TotoGamingLoginPage navigateToMyLogin() {
		myLogin.click();
		return new TotoGamingLoginPage(this.driver);

	}

	public TotoGamingLoginPage clickOnLogin() {
		myLogin.click();
		return new TotoGamingLoginPage(this.driver);
	}

	public TotoGamingGameHistoryPage navigateToProfile() {
		myProfile.click();
		return new TotoGamingGameHistoryPage(this.driver);

	}


	public TotoGamingRegisterPage clickOnRegisterBtn() {
		register.click();
		return new TotoGamingRegisterPage(this.driver);
	}

	

	



}
