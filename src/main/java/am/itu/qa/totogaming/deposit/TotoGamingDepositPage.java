package am.itu.qa.totogaming.deposit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.totogaming.base.TotoGamingBasePage;

public class TotoGamingDepositPage extends TotoGamingBasePage {

	public TotoGamingDepositPage(WebDriver driver) {
		super(driver);
	}

	public final String DEPOSIT_BUTTON_XPATH = "//div[@class='dropdown_fixed landing_header_deposit_button flex']";
	public final String CASINO_BUTTON_XPATH = "//a[@class='flex alCen depositDialog']";

	@FindBy(xpath = DEPOSIT_BUTTON_XPATH)
	WebElement depositButtonInput;

	@FindBy(xpath = CASINO_BUTTON_XPATH)
	WebElement clickOnCasinoBtn;

	public void deposit() {
		depositButtonInput.click();
	}
	public void clickOnCasinoBtn() {
		 clickOnCasinoBtn.click();
		
	}

	public boolean isDepositDisplayed() {
		return depositButtonInput.isDisplayed();
	}

}
