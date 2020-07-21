package am.itu.qa.totogaming.slotselk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.totogaming.base.TotoGamingBasePage;

public class TotoGamingSlotsElkPage extends TotoGamingBasePage{

	public TotoGamingSlotsElkPage(WebDriver driver) {
		super(driver);
	}
	
	public final String SLOTS_ELK_XPATH = "//div[@id='2170']";
	public final String ELK_PAGE = "//div[@id='2290']";
	
	@FindBy(xpath = SLOTS_ELK_XPATH)
	WebElement clickOnElkButton;
	
	@FindBy(xpath = ELK_PAGE)
	WebElement elkPage;

	public void clickOnElkButton() {
		clickOnElkButton.click();
	}

	public boolean isElkDisplayed() {
		return elkPage.isDisplayed();
	}

}
