package com.sauce.testcases;

import org.testng.annotations.Test;

import com.sauce.base.BaseClass;
import com.sauce.base.MainClass;

public class TestCases extends BaseClass {

	MainClass  mainclass; 
	
	public void login() throws Exception {
	mainclass	= new MainClass();

		mainclass.Login();
     mainclass.AddToCart__Sauce_Labs_Backpack();;
     mainclass.VerifyCartItems();
	}

	
	
	/*
	 * @Test (priority = 1) public void verifyCart() { mainclass.VerifyCartItems();
	 * }
	 */
	 @Test
	public void addingoneElement() throws Exception {
		mainclass	= new MainClass();
		mainclass.Login();
		mainclass.addSingleItemToCart();
//		Thread.sleep(1000);
	}

}
