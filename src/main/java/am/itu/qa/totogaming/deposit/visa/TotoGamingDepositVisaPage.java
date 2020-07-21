package am.itu.qa.totogaming.deposit.visa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.totogaming.base.TotoGamingBasePage;

public class TotoGamingDepositVisaPage extends TotoGamingBasePage{

	public TotoGamingDepositVisaPage(WebDriver driver) {
		super(driver);
		
	}
   public final String CASINO_BUTTON_XPATH = "//div[@class='tl_main_nav flex alCen tl_bot_header_cont']/a[3]";
   public final String EGT_BUTTON_CLICK = "//div[@id='2140']";
   public final String DEPOSIT_BUTTON_CLICK = "//a[@class='depositDialog tl_deposit_button primBtn']";
   public final String VISA_BUTTON_CLICK = "//p[@class='tl_payment_desc deposit_payment']";
   public final String VISA_PAGE_XPATH = "//a[@class='tl_transfer_button sportTransfer_btn']"; 
   @FindBy(xpath = CASINO_BUTTON_XPATH)
	WebElement clickOnCasinoInput;
   
   @FindBy(xpath = EGT_BUTTON_CLICK)
   WebElement clickEgtButton;
   
   @FindBy(xpath = DEPOSIT_BUTTON_CLICK)
   WebElement clickOnDepositButton;
   
   @FindBy(xpath = VISA_BUTTON_CLICK)
   WebElement clickOnVisaButton;
   
   @FindBy(xpath = VISA_PAGE_XPATH)
   WebElement visaPage;
   
   public void clickOnCasinoInput() {
		clickOnCasinoInput.click();
		
	}
   public void clickEgtButton() {
		clickEgtButton.click();
		
	}

   
	public void clickOnDepositButton() {
		clickOnDepositButton.click();
		
	}

	public void clickOnVisaButton() {
		clickOnVisaButton.click();
		
	}
	public boolean isVisaDisplayed() {
	
		return visaPage.isDisplayed();
	}

	
}
