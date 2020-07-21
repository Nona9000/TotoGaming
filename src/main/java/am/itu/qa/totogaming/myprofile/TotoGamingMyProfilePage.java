package am.itu.qa.totogaming.myprofile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.totogaming.base.TotoGamingBasePage;

public class TotoGamingMyProfilePage extends TotoGamingBasePage{

	public TotoGamingMyProfilePage(WebDriver driver) {
		super(driver);
		
	}
    public final String MY_PROFILE = "//a[@id='profile_tab']";
    public final String MY_PROFILE_PAGE = "//div[@class='flex wfull jcSpaceBetween']";
    
    @FindBy(xpath = MY_PROFILE)
    WebElement clickOnMyProfile;
    
    @FindBy(xpath = MY_PROFILE_PAGE)
    WebElement MyProfielPage;
    
	public void clickOnMyProfile() {
	 clickOnMyProfile.click();
		
	}

	public boolean isMyProfileDisplayed() {
	
		return MyProfielPage.isDisplayed();
	}
}
