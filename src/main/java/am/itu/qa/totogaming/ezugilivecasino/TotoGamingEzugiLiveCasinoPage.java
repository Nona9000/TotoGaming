package am.itu.qa.totogaming.ezugilivecasino;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.totogaming.base.TotoGamingBasePage;

public class TotoGamingEzugiLiveCasinoPage extends TotoGamingBasePage{

	public TotoGamingEzugiLiveCasinoPage(WebDriver driver) {
		super(driver);
		
	}
    public final String EZUGI_LIVE_CASINO = "//div[@id='app']/div[2]/div/div/div[2]/div/a[3]";
    public final String EZUGI_LIVE_CASINO_PAGE = "//a[@id='tournaments']";
    
    @FindBy(xpath = EZUGI_LIVE_CASINO)
    WebElement clickOnEzugiLiveCasino;
    
    @FindBy(xpath = EZUGI_LIVE_CASINO_PAGE)
    WebElement ezugiLiveCasinoPage;
    
	public void clickOnEzugiLiveCasino() {
		clickOnEzugiLiveCasino.click();
		
	}

	public boolean isEzugiLiveCasinoDisplayed() {
		
		return ezugiLiveCasinoPage.isDisplayed();
	}

}
