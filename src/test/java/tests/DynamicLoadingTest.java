package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pages.DynamicLoadingExample2Page;
import pages.DynamicLoadingPage;
import pages.HeroKuappHomePage;

public class DynamicLoadingTest extends TestBase{


	@Test

	public void DynamicLoading()
	{
		HeroKuappHomePage homePage = new HeroKuappHomePage(driver);
		DynamicLoadingPage dlp = new DynamicLoadingPage(driver);
		DynamicLoadingExample2Page  dle2p= new DynamicLoadingExample2Page (driver);
		String linktxt="Dynamic Loading";
		driver.get("https://the-internet.herokuapp.com/");
		try {
			for (WebElement webElement : homePage.links)
			{
				if ( webElement.getText().equalsIgnoreCase(linktxt)) 
				{

					webElement.click();

					dlp.example2Link.click();
					dle2p.startbtn.click();
					WebDriverWait wait = new WebDriverWait(driver,30);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
					System.out.println("hello world is displayed ");

				}
			}
		}
		catch(Exception e1) {
		}



	}
	{


	}
}
