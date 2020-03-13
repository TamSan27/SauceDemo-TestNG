package com.sauce.testcases;

import org.testng.annotations.Test;

import com.sauce.base.BaseClass;
import com.sauce.base.MainClass;

public class TestCases extends BaseClass {

	
@Test
public void login() {
	MainClass mainclass;
	 mainclass = new MainClass();
	
     mainclass.Login();
}


}
