package pages;


import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HeroKuappHomePage extends PageBase{

	public HeroKuappHomePage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(tagName  ="a")
	public List<WebElement> links;
}