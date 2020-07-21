package am.itu.qa.totogaming.slotsigrosoft;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.totogaming.base.TotoGamingBasePage;

public class TotoGamingSlotsIgrosoftPage extends TotoGamingBasePage{

	public TotoGamingSlotsIgrosoftPage(WebDriver driver) {
		super(driver);
	}
	
	public final String SLOTS_IGROSOFT_XPATH = "//div[@id='2196']";
	public final String IGROSOFT_PAGE = "//div[@id='2290']";
	
	@FindBy(xpath = SLOTS_IGROSOFT_XPATH)
	WebElement clickOnIgrosoftButton;
	
	@FindBy(xpath = IGROSOFT_PAGE)
	WebElement igrosoftPage;

	public void clickOnIgrosoftButton() {
		clickOnIgrosoftButton.click();	
	}

	public boolean isIgrosoftDisplayed() {
		return igrosoftPage.isDisplayed();
	}

}
