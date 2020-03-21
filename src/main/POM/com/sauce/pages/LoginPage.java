package com.sauce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sauce.base.BaseClass;

public class LoginPage extends BaseClass{
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	@FindBy(xpath="//*[@id='user-name']")
	private WebElement userName ;
	
	@FindBy(xpath="//*[@id='password']")
	private WebElement password ;
	
	@FindBy(xpath="//*[@value='LOGIN']")
	private WebElement loginBtn ;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}



}
