package pageObjects_temnplate;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePageObject_registration {
	
	WebDriver driver;
	public BasePageObject_registration(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}

// ***** Base Page Object Setup finished   ********