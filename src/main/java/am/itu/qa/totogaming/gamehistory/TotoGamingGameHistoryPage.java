package am.itu.qa.totogaming.gamehistory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.totogaming.base.TotoGamingBasePage;

public class TotoGamingGameHistoryPage extends TotoGamingBasePage {

	public TotoGamingGameHistoryPage(WebDriver driver) {
		super(driver);
	}
	
	public final String GAME_HISTORY_BUTTON = "//a[@id='history_tab']";
	public final String GAME_HISTORY_PAGE = "//div[@id='content_hostory']";
	
	@FindBy(xpath = GAME_HISTORY_BUTTON)
	WebElement clickOnGameHistoryButton;
	
	@FindBy(xpath = GAME_HISTORY_PAGE)
	WebElement gameHistoryPage;

	public void clickOnGameHistoryButton() {
		clickOnGameHistoryButton.click();
		
	}

	public boolean isGameHistoryDisplayed() {
		
		return gameHistoryPage.isDisplayed();
	}

	

}
