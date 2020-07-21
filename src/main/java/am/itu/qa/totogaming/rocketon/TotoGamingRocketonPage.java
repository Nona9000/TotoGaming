package am.itu.qa.totogaming.rocketon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.totogaming.base.TotoGamingBasePage;

public class TotoGamingRocketonPage extends TotoGamingBasePage{

	public TotoGamingRocketonPage(WebDriver driver) {
		super(driver);
		
	}
     public final String ROCKETON_BUTTON = "//div[@id='app']/div[2]/div/div/div[5]/a";
     public final String ROCKETON_PAGE = "//i[@id='tournament_span']";
     
     @FindBy(xpath = ROCKETON_BUTTON)
     WebElement clickRocketonButton;
     
     @FindBy(xpath = ROCKETON_PAGE)
     WebElement rocketonPage;
     

	public void clickRocketonButton() {
		clickRocketonButton.click();
		
	}


	public boolean isRocketonDisplayed() {
		
		return rocketonPage.isDisplayed();
	}

}
