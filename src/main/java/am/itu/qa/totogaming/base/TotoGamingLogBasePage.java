package am.itu.qa.totogaming.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TotoGamingLogBasePage {

protected WebDriver driver;
	
	public TotoGamingLogBasePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
		
	}

}
