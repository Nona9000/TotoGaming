package am.itu.qa.totogaming.slotsmicrogaming;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.totogaming.base.TotoGamingBasePage;

public class TotoGamingSlotsMicrogamingPage extends TotoGamingBasePage{

	public TotoGamingSlotsMicrogamingPage(WebDriver driver) {
		super(driver);
	}
	
	public final String SLOTS_MICROGAMING_XPATH = "//div[@id='2085']";
	public final String MICROGAMING_PAGE = "//div[@id='2290']";
	
	@FindBy(xpath = SLOTS_MICROGAMING_XPATH)
	WebElement clickOnMicrogamingButton;
	
	@FindBy(xpath = MICROGAMING_PAGE)
	WebElement microgamingPage;

	public void clickOnMicrogamingButton() {
		clickOnMicrogamingButton.click();	
	}

	public boolean isMicrogamingDisplayed() {
		return microgamingPage.isDisplayed();
	}

}
