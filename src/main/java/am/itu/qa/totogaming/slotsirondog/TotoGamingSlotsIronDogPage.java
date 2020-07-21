package am.itu.qa.totogaming.slotsirondog;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.totogaming.base.TotoGamingBasePage;

public class TotoGamingSlotsIronDogPage extends TotoGamingBasePage{

	public TotoGamingSlotsIronDogPage(WebDriver driver) {
		super(driver);
	}
	
	public final String SLOTS_IRON_DOG_XPATH = "//div[@id='2142']";
	public final String IRON_DOG_PAGE = "//div[@id='2290']";
	
	@FindBy(xpath = SLOTS_IRON_DOG_XPATH)
	WebElement clickOnIronDogButton;
	
	@FindBy(xpath = IRON_DOG_PAGE)
	WebElement ironDogPage;

	public void clickOnIronDogButton() {
		clickOnIronDogButton.click();
	}

	public boolean isIronDogDisplayed() {
		return ironDogPage.isDisplayed();
	}

}
