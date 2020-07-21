package am.itu.qa.totogaming.documents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.totogaming.base.TotoGamingBasePage;

public class TotoGamingDocumentsPage extends TotoGamingBasePage{

	public TotoGamingDocumentsPage(WebDriver driver) {
		super(driver);
		
	}
	
	public final String DOCUMENTS_XPATH = "//div[@id='accountDialog']/div/a[2]";
	public final String DUCUMENTS_PAGE_XPATH = "//div[@id='custom_DocumentType']";
	
	@FindBy(xpath = DOCUMENTS_XPATH)
	WebElement clickOnDocumentsButton;
	
	@FindBy(xpath = DUCUMENTS_PAGE_XPATH)
	WebElement documentsPage;

	public void clickOnDocumentsButton() {
		clickOnDocumentsButton.click();
		
	}

	public boolean isDocumentsDisplayed() {
		
		return documentsPage.isDisplayed();
	}

}
