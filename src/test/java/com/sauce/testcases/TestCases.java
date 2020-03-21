package com.sauce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sauce.base.BaseClass;
import com.sauce.base.MainClass;
import com.sauce.pages.HomePage;

public class TestCases extends BaseClass {

	MainClass  mainclass;
	HomePage homepage;
 
	
	public void login() throws Exception {
	mainclass	= new MainClass();

		mainclass.Login();
     mainclass.AddToCart__Sauce_Labs_Backpack();
     mainclass.VerifyCartItems();
	}
	
	 @Test
	public void addingoneElement() throws Exception {
		mainclass	= new MainClass();
		mainclass.Login();
	//	mainclass.addSingleItemToCart();
		mainclass.addMultipleItemCart();
//		Thread.sleep(1000);
	}

}
