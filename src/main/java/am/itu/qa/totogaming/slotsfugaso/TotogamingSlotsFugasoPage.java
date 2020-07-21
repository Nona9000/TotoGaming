package am.itu.qa.totogaming.slotsfugaso;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.totogaming.base.TotoGamingBasePage;

public class TotogamingSlotsFugasoPage extends TotoGamingBasePage{

	public TotogamingSlotsFugasoPage(WebDriver driver) {
		super(driver);
	}
	
	public final String SLOTS_FUGASO_XPATH = "//div[@id='2129']";
	public final String FUGASO_PAGE = "//div[@id='2290']";
	
	@FindBy(xpath = SLOTS_FUGASO_XPATH)
	WebElement clickOnFugasoButton;
	
	@FindBy(xpath = FUGASO_PAGE)
	WebElement fugasoPage;

	public void clickOnFugasoButton() {
		clickOnFugasoButton.click();
	}

	public boolean isFugasoDisplayed() {
		return fugasoPage.isDisplayed();
	}

}
