package am.itu.qa.totogaming.slotsnovomatic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.totogaming.base.TotoGamingBasePage;

public class TotoGamingSlotsNovomaticPage extends TotoGamingBasePage{

	public TotoGamingSlotsNovomaticPage(WebDriver driver) {
		super(driver);
		
	}
	 public final String SLOTS_NOVOMATIC_XPATH = "//div[@id='2184']";
	 public final String SLOTS_NOVOMATIC_PAGE = "//div[@id='2290']";
	 
	 @FindBy(xpath = SLOTS_NOVOMATIC_XPATH)
	 WebElement clickOnNovomaticButton;
	 
	 @FindBy(xpath = SLOTS_NOVOMATIC_PAGE)
	 WebElement novomaticPage;

	public void clickOnNovomaticButton() {
		clickOnNovomaticButton.click();
		
	}

	public boolean isNovomaticDisplayed() {
		
		return novomaticPage.isDisplayed();
	}

}
