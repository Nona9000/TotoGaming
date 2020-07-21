package am.itu.qa.totogaming.luckystreak;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.totogaming.base.TotoGamingBasePage;

public class TotoGamingLuckyStreakLiveCasinoPage extends TotoGamingBasePage{

	public TotoGamingLuckyStreakLiveCasinoPage(WebDriver driver) {
		super(driver);
		
	}
     public final String LUCKY_STREAK_LIVE_CASINO = "//div[@id='app']/div[2]/div/div/div[2]/div/a[4]";
     public final String LUCKY_STREAK_LIVE_CASINO_PAGE = "//a[@id='tournaments']";
     
     @FindBy(xpath = LUCKY_STREAK_LIVE_CASINO)
     WebElement clickOnLuckyStreakLiveCasino;
     
     @FindBy(xpath = LUCKY_STREAK_LIVE_CASINO_PAGE)
     WebElement luckyStreakLoveCasinoPage;
     
     public void clickOnLuckyStreakLiveCasino() {
    	 clickOnLuckyStreakLiveCasino.click();
 		
 	}
     
	public boolean isLuckyStreakLiveCasinoDisplayed() {
		
		return luckyStreakLoveCasinoPage.isDisplayed();
	}

}
