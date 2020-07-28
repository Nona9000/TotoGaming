package am.itu.qa.totogaming.slotsboominggames;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.totogaming.base.TotoGamingBasePage;

public class TotoGamingSlotsBoomingGamesPage extends TotoGamingBasePage{

	public TotoGamingSlotsBoomingGamesPage(WebDriver driver) {
		super(driver);
	}
	
	public final String SLOTS_BOOMING_GAMES_XPATH = "//div[@id='2251']";
	public final String BOOMING_GAMES_PAGE = "//div[@id='2290']";
	
	
	@FindBy(xpath = SLOTS_BOOMING_GAMES_XPATH)
	WebElement clickOnBoomingGamesButton;
	
	@FindBy(xpath = BOOMING_GAMES_PAGE)
	WebElement boomingGamesPage;
	
	public void clickOnBoomingGamesButton() {
		clickOnBoomingGamesButton.click();
	}
	public boolean isBoomingGamesDisplayed() {
		return boomingGamesPage.isDisplayed();
	}

}
