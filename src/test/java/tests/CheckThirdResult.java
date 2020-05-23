package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchForSeleniumWebdriver;

public class CheckThirdResult extends TestBase 

{
	HomePage homeObject;
	SearchForSeleniumWebdriver searchobject;

	@Test
	public void CheckThirdresult()
	{
		driver.get("http://google.com/ncr");
		homeObject = new HomePage(driver);
		homeObject.searchFor("Selenium Webdriver");
		searchobject = new SearchForSeleniumWebdriver(driver);

		try 
		{
			Assert.assertFalse(searchobject.results.get(2).getText().contains("What is Selenium WebDriver"));
		}
		catch (AssertionError e)
		{
			System.out.println("the third result contains -What is Selenium WebDriver");
			throw e;
		}
		System.out.println("the third result doesn't contain -What is Selenium WebDriver-");
	}

}

