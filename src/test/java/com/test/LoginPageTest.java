package com.test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.pages.LoginPage;

import Base.BaseTest;

public class LoginPageTest extends BaseTest {

	LoginPage Lp;
	WebDriver driver;

	@BeforeTest
	@Parameters({"BrowserName","Url"})
	public void launchApp(@Optional("Edge") String Browsername, String Url) {
		driver = BaseTest.SetUpDriver(Browsername,Url);
		Lp = new LoginPage(driver);
	}

	@Test
	public void ValidatePageheader() throws InterruptedException {
		assertTrue(Lp.headerValidate(), "Header Message was not successfully validated !!");

	}
    @Test
    @Parameters({"username","password"})
	public void LoginTest(String username, String Password) throws InterruptedException {
		Lp.setUsername(username);
		Lp.clickOnNext();
		Thread.sleep(6000);
		Lp.setPassword(Password);
		Lp.clickOnNext();

	}
    
    @AfterTest
    public void quitBrowser() {
    	driver.quit();
    }

}
