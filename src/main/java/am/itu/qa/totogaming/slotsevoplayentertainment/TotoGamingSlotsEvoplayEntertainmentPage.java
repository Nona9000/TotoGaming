package am.itu.qa.totogaming.slotsevoplayentertainment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.totogaming.base.TotoGamingBasePage;

public class TotoGamingSlotsEvoplayEntertainmentPage extends TotoGamingBasePage{

	public TotoGamingSlotsEvoplayEntertainmentPage(WebDriver driver) {
		super(driver);
	}
	
	public final String SLOTS_EVOPLAY_ENTERTAINT_XPATH = "//div[@id='2138']";
	public final String EVOPLAY_ENTERTAINT_PAGE = "//div[@id='2290']";
	
	@FindBy(xpath = SLOTS_EVOPLAY_ENTERTAINT_XPATH)
	WebElement clickOnEvoplayEntertainmentButton;
	
	@FindBy(xpath = EVOPLAY_ENTERTAINT_PAGE)
	WebElement evoplayEntertainmentPage;

	public void clickOnEvoplayEntertainmentButton() {
		clickOnEvoplayEntertainmentButton.click();
	}

	public boolean isEvoplayEntertainmentDisplayed() {
		return evoplayEntertainmentPage.isDisplayed();
	}

}
