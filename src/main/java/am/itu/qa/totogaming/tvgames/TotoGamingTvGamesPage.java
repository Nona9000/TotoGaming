package am.itu.qa.totogaming.tvgames;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.totogaming.base.TotoGamingBasePage;

public class TotoGamingTvGamesPage extends TotoGamingBasePage{

	public TotoGamingTvGamesPage(WebDriver driver) {
		super(driver);
		
	}
 
	public final String TV_GAMES = "//div[@id='app']/div[2]/div/div/div[3]/div/button";
	public final String BET_GAMES = "//div[@id='app']/div[2]/div/div/div[3]/div[2]/a";
	public final String TV_GAMES_PAGE = "//i[@id='tournament_span']";
	
	@FindBy(xpath = TV_GAMES)
	WebElement clickOnTvGames;
	
	@FindBy(xpath = BET_GAMES)
	WebElement clickOnBetGames;
	
	@FindBy(xpath = TV_GAMES_PAGE)
	WebElement tvGamesPage;
	
	public void clickOnTvGames() {
		clickOnTvGames.click();
		
	}

	public void clickOnBetGames() {
		clickOnBetGames.click();
		
	}

	public boolean isTvGamesDisplayed() {
		
		return tvGamesPage.isDisplayed();
	}

}
