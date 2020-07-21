package am.itu.qa.totogaming.penalty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.totogaming.base.TotoGamingBasePage;

public class TotoGamingPenaltyPage extends TotoGamingBasePage{

	public TotoGamingPenaltyPage(WebDriver driver) {
		super(driver);
		
	}
	
	  public final String PENALTY_BUTTON_XPATH = "//div[@id='app']/div[2]/div/div/div[8]/a";
      public final String PENALTY_PAGE_XPATH = "//i[@id='tournament_span']";
     
      
      @FindBy(xpath = PENALTY_BUTTON_XPATH)
      WebElement clickOnPenaltyInput;
      
      @FindBy(xpath = PENALTY_PAGE_XPATH)
      WebElement penaltyPage;
      
	public void clickOnPenaltyInput() {
		clickOnPenaltyInput.click();
		
	}

	public void clickOnStartButton() {
		penaltyPage.click();
		
	}

	public boolean isPenalyDisplayed() {
		
		return penaltyPage.isDisplayed();
	}

}
