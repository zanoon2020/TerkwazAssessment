package pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{

	public HomePage (WebDriver driver) {
		super(driver);

	}
	
	@FindBy(name="q")
	WebElement SearchBox;
	
	
	public void searchFor(String theTermYouSearchFor) {

		SearchBox.sendKeys(theTermYouSearchFor);
		SearchBox.sendKeys(Keys.ENTER);
		
	}
}

