package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicLoadingExample2Page extends PageBase {

	public DynamicLoadingExample2Page(WebDriver driver) {
		super(driver);
	}
	@FindBy(tagName =  "button")
	public WebElement startbtn;
	@FindBy(id =  "finish")
	public WebElement finish;

}
