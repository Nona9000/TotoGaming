package am.itu.qa.totogaming.transactions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.totogaming.base.TotoGamingBasePage;

public class TotoGamingTransactionsPage extends TotoGamingBasePage{

	public TotoGamingTransactionsPage(WebDriver driver) {
		super(driver);
		
	}
 
	public final String TRANSACTIONS_XPATH = "//a[@id='transactions_tab']";
	public final String TRANSACTIONS_PAGE = "//a[@class='tl_search_button histsearch_btn btnSec transBg']";
	
	@FindBy(xpath = TRANSACTIONS_XPATH)
	WebElement clickOnTransactionsButton;
	
	@FindBy(xpath = TRANSACTIONS_PAGE)
	WebElement transactionsPage;
	
	public void clickOnTransactionsButton() {
		clickOnTransactionsButton.click();
		
	}

	public boolean isTransactionsPageDisplayed() {
		
		return transactionsPage.isDisplayed();
	}

}
