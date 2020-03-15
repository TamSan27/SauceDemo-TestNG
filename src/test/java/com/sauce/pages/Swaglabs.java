package com.sauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sauce.base.BaseClass;
	
	public class Swaglabs extends BaseClass{
		@FindBy(xpath="//button[@class=\"btn_primary btn_inventory\"]")
		private WebElement First_Product ;

		public WebElement getFirst_Product() {
			return First_Product;
		}
		
		
		
}