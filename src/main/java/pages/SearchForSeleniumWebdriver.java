package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SearchForSeleniumWebdriver extends PageBase{

	public SearchForSeleniumWebdriver(WebDriver driver) {
		super(driver);

	}
	@FindBy(css="h3.LC20lb.DKV0Md")
	public List<WebElement> results ;
}
	
