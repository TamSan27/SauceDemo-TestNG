package com.sauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sauce.base.BaseClass;
	
	public class SwagLabs extends BaseClass{
		//@FindBy(xpath="//button[@class=\"btn_primary btn_inventory\"])
		//@FindBy(xpath = "//div//div[@class='inventory_list']//div[1]//div[3]//button[1]")
		@FindBy(xpath="//div[@class='inventory_item'][1]//button")
		private WebElement First_Product ;

		public WebElement getFirst_Product() {
			return First_Product;
		}
		
		
		
}
	