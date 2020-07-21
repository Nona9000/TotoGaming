package am.itu.qa.totogaming.openbelote;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.totogaming.base.TotoGamingBasePage;

public class TotoGamingOpenBelotePage extends TotoGamingBasePage{

	public TotoGamingOpenBelotePage(WebDriver driver) {
		super(driver);
		
	}
	public final String OPEN_BELOTE_XPATH = "//a[@id='classic-blote-tab']";
	public final String OPEN_BELOTE_PAGE_XPATH = "//i[@id='tournament_span']";
	
	@FindBy(xpath = OPEN_BELOTE_XPATH)
	WebElement clickOnOpenBeloteInput;
	
	@FindBy(xpath = OPEN_BELOTE_PAGE_XPATH)
	WebElement openBelotePage;
	
	public void clickOnOpenBeloteInput() {
		clickOnOpenBeloteInput.click();
		
	}

	public boolean isOpenBeloteDisplayed() {
		
		return  openBelotePage.isDisplayed();
	}

}
