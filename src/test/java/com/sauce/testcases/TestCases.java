package com.sauce.testcases;

import org.testng.annotations.Test;

import com.sauce.base.BaseClass;
import com.sauce.base.MainClass;

public class TestCases extends BaseClass {

	MainClass  mainclass; 
	
	@Test (priority = 0)
public void login() throws Exception {
	mainclass	= new MainClass();

		mainclass.Login();
     mainclass.SwagLabs();
     mainclass.VerifyCartItems();
	}

	
	
	/*
	 * @Test (priority = 1) public void verifyCart() { mainclass.VerifyCartItems();
	 * }
	 */
	 
	 

}
