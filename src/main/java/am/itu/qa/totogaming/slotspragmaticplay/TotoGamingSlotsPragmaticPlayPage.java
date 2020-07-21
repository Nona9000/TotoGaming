package am.itu.qa.totogaming.slotspragmaticplay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.totogaming.base.TotoGamingBasePage;

public class TotoGamingSlotsPragmaticPlayPage extends TotoGamingBasePage{

	public TotoGamingSlotsPragmaticPlayPage(WebDriver driver) {
		super(driver);
	}
	 
	public final String SLOTS_PRAGMATIC_PLAY_XPATH = "//div[@id='2260']";
	public final String PRAGMATIC_PLAY_PAGE = "//div[@id='2290']";
	
	@FindBy(xpath = SLOTS_PRAGMATIC_PLAY_XPATH)
	WebElement clickOnPragmaticPlayButton;
	
	@FindBy(xpath = PRAGMATIC_PLAY_PAGE)
	WebElement pragmaticPlayPage;

	public void clickOnPragmaticPlayButton() {
		clickOnPragmaticPlayButton.click();	
	}

	public boolean isPragmaticPlayDisplayed() {
		return pragmaticPlayPage.isDisplayed();
	}

}
