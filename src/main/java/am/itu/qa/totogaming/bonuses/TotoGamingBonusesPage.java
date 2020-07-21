package am.itu.qa.totogaming.bonuses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.totogaming.base.TotoGamingBasePage;

public class TotoGamingBonusesPage extends TotoGamingBasePage{

	public TotoGamingBonusesPage(WebDriver driver) {
		super(driver);
		
	}
	
	public final String BONUSES_XPATH = "//a[@id='bonuses_tab']";
	public final String BONUSES_PAGE = "//div[@id='custom_bonusHistoryItem']";
	
	@FindBy(xpath = BONUSES_XPATH)
	WebElement clickOnBonusesButton;
	
	@FindBy(xpath = BONUSES_PAGE)
	WebElement bonusesPage;
	
	
	public void clickOnBonusesButton() {
		clickOnBonusesButton.click();
		
	}

	public boolean isBonusesPageDisplayed() {
		
		return bonusesPage.isDisplayed();
	}

}
