package am.itu.qa.totogaming.netentlivecasino;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.totogaming.base.TotoGamingBasePage;

public class TotoGamingNetentLiveCasinoPage extends TotoGamingBasePage{

	public TotoGamingNetentLiveCasinoPage(WebDriver driver) {
		super(driver);
		
	}
     public final String NETENT_LIVE_CASINO = "//div[@id='app']/div[2]/div/div/div[2]/div/a[2]";
     public final String NETENT_LIVE_CASINO_PAGE = "//a[@id='tournaments']";
     
     @FindBy(xpath = NETENT_LIVE_CASINO_PAGE)
     WebElement netentLiveCasinoPage;
     
     @FindBy(xpath = NETENT_LIVE_CASINO)
     WebElement clickOnNetentLiveCasino;
	
	public void clickOnNetentLiveCasino() {
		clickOnNetentLiveCasino.click();
		
	}

	public boolean isNetentLiveCasinoDisplayed() {
		
		return netentLiveCasinoPage.isDisplayed();
	}

}
