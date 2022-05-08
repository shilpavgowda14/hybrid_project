package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public interface Framework_Constant 
{
	//public WebDriver driver;
	//public WebDriverWait wait;
	
	String GECKO_KEY = "webdriver.gecko.driver";
	String GECKO_VALUE = "./softwares/geckodriver.exe";
	
	String CHROME_KEY = "webdriver.chrome.driver";
	String CHROME_VALEUE = "./softwares/chromedriver.exe";
	
	String URL = "https://demoqa.com/automation-practice-form";

}
