package am.itu.qa.totogaming.slotsbetsoft;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.totogaming.base.TotoGamingBasePage;

public class TotoGamingSlotsBetsoftPage extends TotoGamingBasePage{

	public TotoGamingSlotsBetsoftPage(WebDriver driver) {
		super(driver);
	}
	
	public final String SLOTS_BETSOFT_XPATH = "//div[@id='2086']";
	public final String BETSOFT_PAGE = "//div[@id='2290']";
	
	@FindBy(xpath = SLOTS_BETSOFT_XPATH)
	WebElement clickOnBetsoftButton;
	
	@FindBy(xpath = BETSOFT_PAGE)
	WebElement betsoftPage;

	public void clickOnBetsoftButton() {
		clickOnBetsoftButton.click();	
	}

	public boolean isBetsoftDisplayed() {
		return betsoftPage.isDisplayed();
	}

}
