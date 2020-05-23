package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class FileSuccessfullyUploadedPage extends PageBase {

	public FileSuccessfullyUploadedPage(WebDriver driver) {
		super(driver);
	
	}

	
	@FindBy(id="uploaded-files")
	public WebElement fileUploaded;
	
}
