package am.itu.qa.totogaming.slotsworldmatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.totogaming.base.TotoGamingBasePage;

public class TotoGamingSlotsWorldMatchPage extends TotoGamingBasePage{

	public TotoGamingSlotsWorldMatchPage(WebDriver driver) {
		super(driver);
	}
	
	public final String SLOTS_WORLD_MATCH_XPATH = "//div[@id='2256']";
	public final String WORLD_MATCH_PAGE = "//div[@id='2290']";
	
	@FindBy(xpath = SLOTS_WORLD_MATCH_XPATH)
	WebElement clickOnWorldMatchButton;
	
	@FindBy(xpath = WORLD_MATCH_PAGE)
	WebElement worldMatchPage;

	public void clickOnWorldMatchButton() {
		clickOnWorldMatchButton.click();
	}

	public boolean isWorldMatchDisplayed() {
		return worldMatchPage.isDisplayed();
	}

}
