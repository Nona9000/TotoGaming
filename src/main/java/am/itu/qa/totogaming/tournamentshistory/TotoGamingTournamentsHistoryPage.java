package am.itu.qa.totogaming.tournamentshistory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.totogaming.base.TotoGamingBasePage;

public class TotoGamingTournamentsHistoryPage extends TotoGamingBasePage{

	public TotoGamingTournamentsHistoryPage(WebDriver driver) {
		super(driver);
		
	}
	public final String TOURNAMENTS_HISTORY_XPATH = "//a[@id='historyTournament_tab']";
	public final String TOURNAMENTS_HISTORY_PAGE = "//div[@class='tl_gh_result_heading flex wfull']";
	
	@FindBy(xpath = TOURNAMENTS_HISTORY_XPATH)
	WebElement clickOnTournamentsHistory;
	
	@FindBy(xpath = TOURNAMENTS_HISTORY_PAGE)
	WebElement TournamentsHistoryPage;

	public void clickOnTournamentsHistory() {
		clickOnTournamentsHistory.click();
		
	}

	public boolean isTournamentsHistoryDisplayed() {
		
		return TournamentsHistoryPage.isDisplayed();
	}
	

}
