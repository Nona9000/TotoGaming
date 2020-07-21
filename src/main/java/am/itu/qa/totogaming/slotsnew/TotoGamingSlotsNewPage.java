package am.itu.qa.totogaming.slotsnew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.totogaming.base.TotoGamingBasePage;

public class TotoGamingSlotsNewPage extends TotoGamingBasePage{

	public TotoGamingSlotsNewPage(WebDriver driver) {
		super(driver);
	}
    
	public final String CASINO_NEW_XPATH = "//div[@id='2117']";
	public final String NEW_PAGE = "//i[@id='tournament_span']";
	

	@FindBy(xpath = CASINO_NEW_XPATH)
	WebElement clickOnNewButton;
	
	@FindBy(xpath = NEW_PAGE)
	WebElement newPage;
	
	public void clickOnNewButton() {
		clickOnNewButton.click();	
	}
	public boolean isNewDisplayed() {
		
		return newPage.isDisplayed();
	}
}
