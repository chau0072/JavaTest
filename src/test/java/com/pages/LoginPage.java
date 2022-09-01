package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseTest;

public class LoginPage extends BaseTest {

	WebDriver driver;

	@FindBy(className = "header-title")
	WebElement headerTitle;
	@FindBy(id = "name")
	WebElement username;
	@FindBy(xpath = ".//button[text()='Next']")
	WebElement next;
	@FindBy(id = "userPassword")
	WebElement password;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public boolean headerValidate() throws InterruptedException {
		Thread.sleep(6000);
		boolean flag = headerTitle.isDisplayed();
		return flag;

	}
	
	public void setUsername(String uname) {
		username.sendKeys(uname);
	}
	public void setPassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void clickOnNext() {
		next.click();
		}
	


}
