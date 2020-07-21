package am.itu.qa.totogaming.slotsbelatra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.totogaming.base.TotoGamingBasePage;

public class TotoGamingSlotsBelatraPage extends TotoGamingBasePage{

	public TotoGamingSlotsBelatraPage(WebDriver driver) {
		super(driver);
	}
	
	public final String SLOTS_BELATRA_XPATH = "//div[@id='2155']";
	public final String BELATRA_PAGE = "//div[@id='2290']";
	
	@FindBy(xpath = SLOTS_BELATRA_XPATH)
	WebElement clickOnBelatraButton;
	
	@FindBy(xpath = BELATRA_PAGE)
	WebElement belatraPage;

	public void clickOnBelatraButton() {
		clickOnBelatraButton.click();	
	}

	public boolean isBelatraDisplayed() {
		return belatraPage.isDisplayed();
	}

}
