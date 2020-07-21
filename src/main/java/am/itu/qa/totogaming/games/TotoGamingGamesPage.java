package am.itu.qa.totogaming.games;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.totogaming.base.TotoGamingBasePage;

public class TotoGamingGamesPage extends TotoGamingBasePage{

	public TotoGamingGamesPage(WebDriver driver) {
		super(driver);
		
	}
	
	  public final String GAMES_BUTTON_XPATH = "//div[@id='app']/div[2]/div/div/a[6]";
	  public final String BACKGAMMON_BUTTON_XPATH = "//i[@id='tournament_span']";
	  
	  @FindBy(xpath = GAMES_BUTTON_XPATH)
	  WebElement clickOnGamesInput;
	  
	  @FindBy(xpath = BACKGAMMON_BUTTON_XPATH)
	  WebElement gamesPage;

	public void clickOnGamesInput() {
		clickOnGamesInput.click();
		
	}

		public boolean isGamesDisplayed() {
		return gamesPage.isDisplayed();
	}

}
