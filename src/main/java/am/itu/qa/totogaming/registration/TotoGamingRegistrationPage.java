package am.itu.qa.totogaming.registration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.totogaming.base.TotoGamingBasePage;

public class TotoGamingRegistrationPage extends TotoGamingBasePage {

	public TotoGamingRegistrationPage(WebDriver driver) {
		super(driver);

	}

	public final String FIRST_NAME_XPATH = "//input[@id='FirstName']";
	public final String FIRST_XPATH = "css=#FirstName";
	public final String LAST_NAME_XPATH = "//input[@id='LastName']";
	public final String LAST_XPATH = "css=#LastName";
	public final String YEAR_DATE_XPATH = "//div[@id='custom_DateOfBirthYear']";
	public final String CLICK_XPATH = "css=#mCSB_3_container > li:nth-child(2)";
	public final String MONTH_XPATH = "//div[@id='custom_DateOfBirthMonth']";
	public final String CLICK_BUTTON_XPATH = "css=#mCSB_4_container > li:nth-child(2)";
	public final String DAY_XPATH = "//div[@id='custom_DateOfBirthDay']";
	public final String CLICK_DAY_XPATH = "css=#mCSB_5_container > li:nth-child(2)";
	public final String NEXT_BUTTON_XPATH = "//button[@id='continue_btn']";
	public final String REGISTRATION_PAGE_XPATH = "//div[@class='tl_popup_content']";

	@FindBy(xpath = FIRST_NAME_XPATH)
	WebElement myFirstNameInput;

	@FindBy(xpath = LAST_NAME_XPATH)
	WebElement myLastNameInput;

	@FindBy(xpath = YEAR_DATE_XPATH)
	WebElement myYearDateInput;

	@FindBy(xpath = MONTH_XPATH)
	WebElement myMonthInput;

	@FindBy(xpath = DAY_XPATH)
	WebElement myDayInput;

	@FindBy(xpath = NEXT_BUTTON_XPATH)
	WebElement clickOnNextBtn;

	@FindBy(xpath = REGISTRATION_PAGE_XPATH)
	WebElement registrationPage;

	public TotoGamingRegistrationPage doNext(String firstName, String lastName,
			String yearDate, String month, String day) {
                 return clickOnNextBtn();
	}

	public void myFirstNameInput(String firstName) {
		myFirstNameInput.sendKeys(firstName);

	}

	public void myLastNameInput(String lastName) {
		myLastNameInput.sendKeys(lastName);

	}

	public void myYearDateInput(String yearDate) {
		myYearDateInput.sendKeys(yearDate);

	}

	public void myMonthInput(String month) {
		myMonthInput.sendKeys(month);

	}

	public void myDayInput(String day) {
		myDayInput.sendKeys(day);

	}

	public void myFirstNameInput() {
		myFirstNameInput.click();

	}

	public void myLastNameInput() {
		myLastNameInput.click();

	}

	public void myYearDateInput() {
		myYearDateInput.click();

	}

	public void myMonthInput() {
		myMonthInput.click();

	}

	public void myDayInput() {
		myDayInput.click();

	}

	public TotoGamingRegistrationPage clickOnNextBtn() {
		clickOnNextBtn.click();
		if (registrationPage.isDisplayed()) {
		}
		return new TotoGamingRegistrationPage(this.driver);
	}

	public boolean isRegistrationDisplayed() {

		return registrationPage.isDisplayed();
	}

}
