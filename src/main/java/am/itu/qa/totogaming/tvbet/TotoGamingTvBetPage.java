package am.itu.qa.totogaming.tvbet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.totogaming.base.TotoGamingBasePage;

public class TotoGamingTvBetPage extends TotoGamingBasePage{

	public TotoGamingTvBetPage(WebDriver driver) {
		super(driver);
		
	}

	public final String TV_BET = "//div[@id='app']/div[2]/div/div/div[3]/div[2]/a[2]/span";
	public final String TV_BET_PAGE = "//i[@id='tournament_span']";
	
	@FindBy(xpath = TV_BET)
	WebElement clichOnTvBet;
	
	@FindBy(xpath = TV_BET_PAGE)
	WebElement tvBetPage;
	
	public void clickOnTvBet() {
		clichOnTvBet.click();
		
	}

	public boolean isTvBetDisplayed() {
		
		return tvBetPage.isDisplayed();
	}

	 
}
