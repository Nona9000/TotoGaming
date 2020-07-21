package am.itu.qa.totogaming.casino;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.totogaming.base.TotoGamingBasePage;

public class TotoGamingCasinoPage extends TotoGamingBasePage {

	public TotoGamingCasinoPage(WebDriver driver) {
		super(driver);
		
	}
	
	public final String CASINO_BUTTON_XPATH = "//div[@class='tl_main_nav flex alCen tl_bot_header_cont']/a[3]";
	public final String EGT_BUTTON_XPATH = "//div[@id='2140']";
	public final String  PAGE_XPATH = "//i[@id='tournament_span']";
	
	@FindBy(xpath = CASINO_BUTTON_XPATH)
	WebElement clickOnCasinoInput;
	
	@FindBy(xpath = EGT_BUTTON_XPATH)
	WebElement clickOnEgtBtn;
	
	@FindBy(xpath = PAGE_XPATH)
	WebElement casinoPage;

	public void clickOnCasinoInput() {
		 clickOnCasinoInput.click();
		
	}

	public void clickOnEgtBtn() {
		clickOnEgtBtn.click();
		
	}

	public boolean isCasinoDisplayed() {
		
		return casinoPage.isDisplayed();
	}
	

}
