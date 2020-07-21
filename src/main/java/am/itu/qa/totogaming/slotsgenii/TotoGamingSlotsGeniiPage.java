package am.itu.qa.totogaming.slotsgenii;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.totogaming.base.TotoGamingBasePage;

public class TotoGamingSlotsGeniiPage extends TotoGamingBasePage{

	public TotoGamingSlotsGeniiPage(WebDriver driver) {
		super(driver);
	}
	
	public final String SLOTS_GENII_XPATH = "//div[@id='2153']";
	public final String GENII_PAGE = "//div[@id='2290']";
	
	@FindBy(xpath = SLOTS_GENII_XPATH)
	WebElement clickOnGeniiButton;
	
	@FindBy(xpath = GENII_PAGE )
	WebElement geniiPage;

	public void clickOnGeniiButton() {
		clickOnGeniiButton.click();
	}

	public boolean isGeniiDisplayed() {
		return geniiPage.isDisplayed();
	}

}
