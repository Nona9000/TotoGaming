package am.itu.qa.totogaming.slotshabanero;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.totogaming.base.TotoGamingBasePage;

public class TotoGamingSlotsHabaneroPage extends TotoGamingBasePage{

	public TotoGamingSlotsHabaneroPage(WebDriver driver) {
		super(driver);
	}
	
	public final String SLOTS_HABANERO_XPATH = "//div[@id='2136']";
	public final String HABANERO_PAGE = "//div[@id='2290']";
	
	@FindBy(xpath = SLOTS_HABANERO_XPATH)
	WebElement clickOnHabaneroButton;
	
	@FindBy(xpath = HABANERO_PAGE)
	WebElement habaneroPage;

	public void clickOnHabaneroButton() {
		clickOnHabaneroButton.click();
	}

	public boolean isHabaneroDisplayed() {
		return habaneroPage.isDisplayed();
	}

}
