package am.itu.qa.totogaming.slotsplayson;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.totogaming.base.TotoGamingBasePage;

public class TotoGamingSlotsPlaysonPage extends TotoGamingBasePage{

	public TotoGamingSlotsPlaysonPage(WebDriver driver) {
		super(driver);	
	}
 
	public final String SLOTS_PLAYSON_XPATH = "//div[@id='2166']";
	public final String PLAYSON_PAGE = "//div[@id='2290']";
	
	@FindBy(xpath = SLOTS_PLAYSON_XPATH)
	WebElement clickOnPlaysonButton;
	
	@FindBy(xpath = PLAYSON_PAGE)
	WebElement playsonPage;
	
	public void clickOnPlaysonButton() {
		clickOnPlaysonButton.click();	
	}

	public boolean isPlaysonDisplayed() {
	
		return playsonPage.isDisplayed();
	}

}
