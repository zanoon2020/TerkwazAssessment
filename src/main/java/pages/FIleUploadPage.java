package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FIleUploadPage extends PageBase{



	public FIleUploadPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id = "file-upload")
	public WebElement fileUploader;
	@FindBy(id = "file-submit")
	public 	WebElement submit;




}
