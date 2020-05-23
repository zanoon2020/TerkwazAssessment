package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicLoadingPage extends PageBase {

	public DynamicLoadingPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(  linkText =  "Example 2: Element rendered after the fact")
	public WebElement example2Link;

}
