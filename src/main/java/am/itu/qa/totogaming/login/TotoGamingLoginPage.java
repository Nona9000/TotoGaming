package am.itu.qa.totogaming.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.totogaming.base.TotoGamingBasePage;
import am.itu.qa.totogaming.gamehistory.TotoGamingGameHistoryPage;

public class TotoGamingLoginPage extends TotoGamingBasePage {

	public TotoGamingLoginPage(WebDriver driver) {
		super(driver);
	}

	public final String USERNAME_XPATH = "//input[@id='email']";
	public final String PASSWORD_XPATH = "//input[@id='password']";
	public final String LOGIN_BUTTON_XPATH = "//button[@class='tl_btn_popup login_btn btnSec transBg']";
	public final String DEPOSIT_BUTTON_XPATH = "//div[@class='dropdown_fixed landing_header_deposit_button flex']";
	public final String ERROR_XPATH = "//div[@class='validation-summary-errors']";

	@FindBy(xpath = USERNAME_XPATH)
	WebElement myUsernameInput;

	@FindBy(xpath = PASSWORD_XPATH)
	WebElement myPasswordInput;

	@FindBy(xpath = LOGIN_BUTTON_XPATH)
	WebElement loginButtonInput;

	@FindBy(xpath = DEPOSIT_BUTTON_XPATH)
	WebElement depositButton;

	@FindBy(xpath = ERROR_XPATH)
	WebElement errorMsg;

	public TotoGamingBasePage doLogin(String username, String password) {
		typeLogin(username);
		typePassword(password);
		return clickOnLoginBtn();
	}

	public void typePassword(String password) {
		myPasswordInput.sendKeys(password);
	}

	public TotoGamingBasePage clickOnLoginBtn() {
		loginButtonInput.click();
		if (myUsernameInput.isDisplayed()) {
			return new TotoGamingLoginPage(this.driver);
		} else {
			return new TotoGamingGameHistoryPage(this.driver);
		}
	}

	public boolean isUsernameDisplayed() {
		return myUsernameInput.isDisplayed();

	}

	public boolean isDepositDisplayed() {
		return depositButton.isDisplayed();

	}

	public void typeLogin(String login) {
		myUsernameInput.sendKeys(login);

	}

	public boolean isErrorDisplayed() {

		return errorMsg.isDisplayed();
	}

}
