package com.sauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sauce.base.BaseClass;
	
	public class HomePage extends BaseClass{
		//@FindBy(xpath="//button[@class=\"btn_primary btn_inventory\"])
		//@FindBy(xpath = "//div//div[@class='inventory_list']//div[1]//div[3]//button[1]")
		//@FindBy(xpath="//div[@class='inventory_item'][1]//button")
		@FindBy(xpath="//div[text()='Sauce Labs Backpack']//parent::a//parent::div/following-sibling::div//button")
		private WebElement AddProduct_Sauce_Labs_Backpack ;
		
		@FindBy(xpath="//div[text()='Sauce Labs Bike Light']//parent::a//parent::div/following-sibling::div//button")
		private WebElement AddProduct_Sauce_Labs_Bike_Light ;

		@FindBy(xpath="//div[text()='Sauce Labs Bolt T-Shirt']//parent::a//parent::div/following-sibling::div//button")
		private WebElement AddProduct_Sauce_Labs_Bolt_TShirt ;
		
		@FindBy(xpath="//div[text()='Sauce Labs Fleece Jacket']//parent::a//parent::div/following-sibling::div//button")
		private WebElement AddProduct_Sauce_Labs_Fleece_Jacket ;
		
		@FindBy(xpath="//div[text()='Test.allTheThings() T-Shirt (Red)']//parent::a//parent::div/following-sibling::div//button")
		private WebElement AddProduct_Sauce_Labs_Red_Tshirt ;
		
		@FindBy(xpath="//div[text()='Sauce Labs Onesie']//parent::a//parent::div/following-sibling::div//button")
		private WebElement AddProduct_Sauce_Labs_Onesie ;
		
		
		public WebElement Sauce_Labs_Backpack_Add() {
			return AddProduct_Sauce_Labs_Backpack;
		}
	
		}
		
		
		

	