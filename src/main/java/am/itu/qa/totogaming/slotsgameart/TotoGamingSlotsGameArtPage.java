package am.itu.qa.totogaming.slotsgameart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.totogaming.base.TotoGamingBasePage;

public class TotoGamingSlotsGameArtPage extends TotoGamingBasePage{

	public TotoGamingSlotsGameArtPage(WebDriver driver) {
		super(driver);
	}
	  public final String GAME_ART_XPATH = "//div[@id='2164']";
	  public final String GAME_ART_PAGE = "//div[@id='2290']";
	  
	  @FindBy(xpath = GAME_ART_XPATH)
	  WebElement clickOnGameArtButton;
	  
	  @FindBy(xpath = GAME_ART_PAGE)
	  WebElement gameArtPage;

	public void clickOnGameArtButton() {
		clickOnGameArtButton.click();
		
	}

	public boolean isGameArtDisplayed() {
		
		return gameArtPage.isDisplayed();
	}

}
