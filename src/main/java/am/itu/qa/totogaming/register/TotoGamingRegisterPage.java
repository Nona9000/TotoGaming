package am.itu.qa.totogaming.register;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.totogaming.base.TotoGamingBasePage;

public class TotoGamingRegisterPage extends TotoGamingBasePage {

	public TotoGamingRegisterPage(WebDriver driver) {
		super(driver);

	}

	public final String REGISTER_BUTTON_XPATH = "//a[@class='registerDialog tl_register_button primBtn transBg']";
	public final String REGISTER_PAGE_XPATH = "//div[@class='tl_popup_header flex";

	@FindBy(xpath = REGISTER_BUTTON_XPATH)
	WebElement clickOnRegisterBtn;

	@FindBy(xpath = REGISTER_PAGE_XPATH)
	WebElement registerPage;

	public void clickOnRegisterBtn() {
		clickOnRegisterBtn.click();

	}

	public void register() {
	 registerPage.click();

	}

	public boolean isRegisterDisplayed() {

		return clickOnRegisterBtn.isDisplayed();
	}


}
