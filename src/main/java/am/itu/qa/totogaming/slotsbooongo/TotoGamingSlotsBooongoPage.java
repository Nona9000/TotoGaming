package am.itu.qa.totogaming.slotsbooongo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.totogaming.base.TotoGamingBasePage;

public class TotoGamingSlotsBooongoPage extends TotoGamingBasePage{

	public TotoGamingSlotsBooongoPage(WebDriver driver) {
		super(driver);
	}
	
	public final String SLOTS_BOOONGO_XPATH = "//div[@id='2159']";
	public final String BOOONGO_PAGE = "//div[@id='2290']";
	
	@FindBy(xpath = SLOTS_BOOONGO_XPATH)
	WebElement clickOnBooongoButton;
	
	@FindBy(xpath = BOOONGO_PAGE)
	WebElement booongoPage;

	public void clickOnBooongoButton() {
		clickOnBooongoButton.click();
	}

	public boolean isBooongoDisplayed() {
	 return booongoPage.isDisplayed();
	}

}
