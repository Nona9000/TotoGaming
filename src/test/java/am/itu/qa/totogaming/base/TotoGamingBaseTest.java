package am.itu.qa.totogaming.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TotoGamingBaseTest {

	protected WebDriver driver;
	public static final String TOTO_URL = "https://www.totogaming.am/en";


	@BeforeTest
	public void prepareEnv() {		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nona0\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(TOTO_URL);

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
