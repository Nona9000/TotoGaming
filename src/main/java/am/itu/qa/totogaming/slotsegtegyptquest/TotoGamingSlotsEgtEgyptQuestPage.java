package am.itu.qa.totogaming.slotsegtegyptquest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.totogaming.base.TotoGamingBasePage;

public class TotoGamingSlotsEgtEgyptQuestPage extends TotoGamingBasePage{

	public TotoGamingSlotsEgtEgyptQuestPage(WebDriver driver) {
		super(driver);
	}
	
	public final String SLOTS_EGT_EGYPT_QUEST_XPATH = "//div[@id='2219']";
	public final String EGT_EGYPT_QUEST_PAGE = "//div[@id='2290']";
	
	@FindBy(xpath = SLOTS_EGT_EGYPT_QUEST_XPATH)
	WebElement clickOnEgtEgyptQuesttButton;
	
	@FindBy(xpath = EGT_EGYPT_QUEST_PAGE)
	WebElement egtEgyptQuestPage;

	public void clickOnEgtEgyptQuesttButton() {
		clickOnEgtEgyptQuesttButton.click();	
	}

	public boolean isEgtEgyptQuesttDisplayed() {
		return egtEgyptQuestPage.isDisplayed();
	}

}
