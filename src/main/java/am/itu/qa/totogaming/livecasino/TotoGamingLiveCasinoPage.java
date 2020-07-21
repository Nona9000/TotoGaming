package am.itu.qa.totogaming.livecasino;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.totogaming.base.TotoGamingBasePage;

public class TotoGamingLiveCasinoPage extends TotoGamingBasePage{

	public TotoGamingLiveCasinoPage(WebDriver driver) {
		super(driver);
		
	}
   public final String LIVE_CASINO_BUTTON = "//div[@id='app']/div[2]/div/div/div[2]/button";
   public final String EVOLUTION_LIVE_CASINO_INPUT = "//div[@id='app']/div[2]/div/div/div[2]/div/a";
   public final String LIVE_CASINO_PAGE = "//a[@id='tournaments']";
   
   @FindBy(xpath = LIVE_CASINO_BUTTON)
   WebElement clickOnLiveCasino;
   
   @FindBy(xpath = EVOLUTION_LIVE_CASINO_INPUT)
   WebElement clickOnEvolutionLiveCasinoInput;
   
   @FindBy(xpath = LIVE_CASINO_PAGE)
   WebElement liveCasinoPage;
   
	public void clickOnLiveCasino() {
		clickOnLiveCasino.click();
		
	}

	public void clickOnEvolutionLiveCasinoInput() {
		clickOnEvolutionLiveCasinoInput.click();
		
	}

	public boolean isLiveCasinoDisplayed() {
	
		return liveCasinoPage.isDisplayed();
	}

}
