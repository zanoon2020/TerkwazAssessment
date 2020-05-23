package tests;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FIleUploadPage;
import pages.FileSuccessfullyUploadedPage;
import pages.HeroKuappHomePage;


public class UploadImage extends TestBase {

	@Test

	public void FileUpload()
	{
	
		String linktxt="File Upload";
		String imageName="test image.jpg";
		String imagePath=System.getProperty("user.dir")+"/uploads/"+imageName;
		HeroKuappHomePage hero = new HeroKuappHomePage(driver);
		FIleUploadPage fup = new FIleUploadPage(driver);
		FileSuccessfullyUploadedPage fsup = new FileSuccessfullyUploadedPage(driver);
		
		driver.get("https://the-internet.herokuapp.com/");
		/* Try and catch used here because 
 stale element reference: element is not attached to the page document error */
		try { 
			for (WebElement webElement : hero.links)

			{
				if ( webElement.getText().equalsIgnoreCase(linktxt)) 
				{

					webElement.click();	
					fup.fileUploader.sendKeys(imagePath);
					fup.submit.click();
				}

			}
		} 


		catch(Exception e1) 

		{		
			try 
			{
				Assert.assertTrue(fsup.fileUploaded.getText().equalsIgnoreCase(imageName));
			}
			catch (AssertionError e)
			{
				throw e;
			}
			System.out.println("test passed  ");
		}

	}
}