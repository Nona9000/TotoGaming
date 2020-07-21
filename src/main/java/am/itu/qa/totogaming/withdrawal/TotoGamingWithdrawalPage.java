package am.itu.qa.totogaming.withdrawal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.totogaming.base.TotoGamingBasePage;

public class TotoGamingWithdrawalPage extends TotoGamingBasePage{

	public TotoGamingWithdrawalPage(WebDriver driver) {
		super(driver);
	}
	
	public final String WITHDRAWAL_XPATH = "//a[@id='withdraw_tab']";
	public final String WITHDRAWAL_PAGE = "//div[@class='tl_my_acc_cont_content tl_popup_clr']";
	
	@FindBy(xpath = WITHDRAWAL_XPATH)
	WebElement clickOnWithdrawalButton;
	
	@FindBy(xpath = WITHDRAWAL_PAGE)
	WebElement withdrawalPage;

	public void clickOnWithdrawalButton() {
		clickOnWithdrawalButton.click();
		
	}

	public boolean isWithdrawalPageDisplayed() {
		
		return withdrawalPage.isDisplayed();
	}

}
