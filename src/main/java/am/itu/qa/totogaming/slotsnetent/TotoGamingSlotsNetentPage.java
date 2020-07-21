package am.itu.qa.totogaming.slotsnetent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.totogaming.base.TotoGamingBasePage;

public class TotoGamingSlotsNetentPage extends TotoGamingBasePage{

	public TotoGamingSlotsNetentPage(WebDriver driver) {
		super(driver);
	}
 
	public final String SLOTS_NETENT_XPATH = "//div[@id='2228']";
	public final String NETENT_PAGE = "//div[@id='2290']";
	
	@FindBy(xpath = SLOTS_NETENT_XPATH)
	WebElement clickOnNetentButton;
	
	@FindBy(xpath = NETENT_PAGE)
	WebElement netentPage;
	
	
	public void clickOnNetentButton() {
		clickOnNetentButton.click();	
	}

	public boolean isNetentDisplayed() {
		return netentPage.isDisplayed();
	}

}
