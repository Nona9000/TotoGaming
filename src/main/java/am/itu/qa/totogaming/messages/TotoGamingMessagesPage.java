package am.itu.qa.totogaming.messages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.totogaming.base.TotoGamingBasePage;

public class TotoGamingMessagesPage extends TotoGamingBasePage{

	public TotoGamingMessagesPage(WebDriver driver) {
		super(driver);
		
	}
	 public final String MESSAGES_BUTTON_XPATH = "//div[@id='header_fix']/div/div[4]/div/a[3]/i";
	 public final String MESSAGES_PAGE_XPATH = "//div[@class='deleteAll_icon']";
	 
	 @FindBy(xpath = MESSAGES_BUTTON_XPATH)
	 WebElement clickOnMessagesButton;
	 
	 @FindBy(xpath = MESSAGES_PAGE_XPATH)
	 WebElement messagesPage;

	 public void clickOnMessagesButton() {
		 clickOnMessagesButton.click();
		
	}

	public boolean isMessagesDisplayed() {
		
		return messagesPage.isDisplayed();
	}

}
