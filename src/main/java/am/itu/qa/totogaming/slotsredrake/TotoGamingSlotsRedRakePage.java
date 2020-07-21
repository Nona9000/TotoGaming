package am.itu.qa.totogaming.slotsredrake;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.totogaming.base.TotoGamingBasePage;

public class TotoGamingSlotsRedRakePage extends TotoGamingBasePage{

	public TotoGamingSlotsRedRakePage(WebDriver driver) {
		super(driver);
	}
	
	public final String SLOTS_RED_RAKE_XPATH = "//div[@id='2158']";
	public final String RED_RAKE_PAGE = "//div[@id='2290']";
	
	@FindBy(xpath = SLOTS_RED_RAKE_XPATH)
	WebElement clickOnRedRakeButton;
	
	@FindBy(xpath = RED_RAKE_PAGE)
	WebElement redRakePage;

	public void clickOnRedRakeButton() {
		clickOnRedRakeButton.click();
	}

	public boolean isRedRakeDisplayed() {
		return redRakePage.isDisplayed();
	}

}
