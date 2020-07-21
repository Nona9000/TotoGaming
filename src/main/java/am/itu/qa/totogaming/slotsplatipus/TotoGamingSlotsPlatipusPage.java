package am.itu.qa.totogaming.slotsplatipus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.totogaming.base.TotoGamingBasePage;

public class TotoGamingSlotsPlatipusPage extends TotoGamingBasePage{

	public TotoGamingSlotsPlatipusPage(WebDriver driver) {
		super(driver);
	}
	 
	public final String SLOTS_PLATIPUS_XPATH = "//div[@id='2205']";
	public final String PLATIPUS_PAGE = "//div[@id='2290']";
	
	@FindBy(xpath = SLOTS_PLATIPUS_XPATH)
	WebElement clickOnPlatipusButton;
	
	@FindBy(xpath = PLATIPUS_PAGE)
	WebElement platipusPage;

	public void clickOnPlatipusButton() {
		clickOnPlatipusButton.click();	
	}

	public boolean isPlatipusDisplayed() {
		return platipusPage.isDisplayed();
	}

}
