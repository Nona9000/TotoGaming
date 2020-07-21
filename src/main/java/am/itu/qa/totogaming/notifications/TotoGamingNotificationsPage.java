package am.itu.qa.totogaming.notifications;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.totogaming.base.TotoGamingBasePage;

public class TotoGamingNotificationsPage extends TotoGamingBasePage{

	public TotoGamingNotificationsPage(WebDriver driver) {
		super(driver);
	
	}
	 
	public final String NOTIFICATIONS_XPATH = "//a[@id='notification_tab']";
	public final String NOTIFICATIONS_PAGE = "//div[@id='my_prof']";
	
	@FindBy(xpath = NOTIFICATIONS_XPATH)
	WebElement clickOnNotificationsButton;
	
	@FindBy(xpath = NOTIFICATIONS_PAGE)
	WebElement notificationsPage;

	public void clickOnNotificationsButton() {
		clickOnNotificationsButton.click();
		
	}

	public boolean isNotificationsPageDisplayed() {
	
		return notificationsPage.isDisplayed();
	}

}
