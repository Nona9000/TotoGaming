 package am.itu.qa.totogaming.belote;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.totogaming.base.TotoGamingBasePage;

public class TotoGamingBelotePage extends TotoGamingBasePage {

	public TotoGamingBelotePage(WebDriver driver) {
		super(driver);
	}

	public final String BELOTE_BUTTON_XPATH = "//div[@class='tl_main_nav flex alCen tl_bot_header_cont']/a[5]";
	public final String BELOTE_PAGE_XPATH = "//i[@id='tournament_span']";

	@FindBy(xpath = BELOTE_BUTTON_XPATH)
	WebElement clickOnBeloteInput;
	
	@FindBy(xpath = BELOTE_PAGE_XPATH)
	WebElement belotePage;
	

  	public void clickOnBeloteInput() {
	 clickOnBeloteInput.click();
		
	}


	public boolean isBeloteDisplayed() {
		return  belotePage.isDisplayed();

	}

}
