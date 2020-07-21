package am.itu.qa.totogaming.slotsendorphina;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.totogaming.base.TotoGamingBasePage;

public class TotoGamingSlotsEndorphinaPage extends TotoGamingBasePage{

	public TotoGamingSlotsEndorphinaPage(WebDriver driver) {
		super(driver);
	}
	
	public final String SLOTS_ENDORPHINA_XPATH = "//div[@id='2121']";
	public final String ENDORPHINA_PAGE = "//div[@id='2290']";
	
	@FindBy(xpath = SLOTS_ENDORPHINA_XPATH)
	WebElement clickOnEndorphinaButton;
	
	@FindBy(xpath = ENDORPHINA_PAGE)
	WebElement endorphinaPage;

	public void clickOnEndorphinaButton() {
		clickOnEndorphinaButton.click();	
	}

	public boolean isEndorphinaDisplayed() {
		
		return endorphinaPage.isDisplayed();
	}

}
