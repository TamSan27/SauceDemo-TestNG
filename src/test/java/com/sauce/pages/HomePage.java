package com.sauce.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sauce.base.BaseClass;
	
	public class HomePage extends BaseClass{
		
		

		//@FindBy(xpath="//button[@class=\"btn_primary btn_inventory\"])
		//@FindBy(xpath = "//div//div[@class='inventory_list']//div[1]//div[3]//button[1]")
		//@FindBy(xpath="//div[@class='inventory_item'][1]//button")
		@FindBy(xpath="//div[text()='Sauce Labs Backpack']//parent::a//parent::div/following-sibling::div//button")
		private WebElement AddToCartProduct_Sauce_Labs_Backpack ;
		
		@FindBy(xpath="//*[text()='Sauce Labs Backpack']")
		private WebElement Product_Sauce_Labs_Backpack;
		
		@FindBy(xpath="//div[text()='Sauce Labs Backpack']//parent::a//parent::div/following-sibling::div/div")
		private WebElement Price_Sauce_Labs_Backpack;
		
		@FindBy(xpath="//div[text()='Sauce Labs Backpack']//parent::a//following-sibling::div")
		private WebElement Text_Sauce_Labs_Backpack;
		
		@FindBy(xpath="//div[text()='Sauce Labs Bike Light']//parent::a//parent::div/following-sibling::div//button")
		private WebElement AddToCartProduct_Sauce_Labs_Bike_Light ;
		
		@FindBy(xpath="//*[text()='Sauce Labs Bike Light']")
		private WebElement Product_Sauce_Labs_Bike_Light;
		
		@FindBy(xpath="//div[text()='Sauce Labs Bike Light']//parent::a//parent::div/following-sibling::div/div")
		private WebElement Price_Sauce_Labs_Bike_Light;
		
		@FindBy(xpath="//div[text()='Sauce Labs Backpack']//parent::a//following-sibling::div")
		private WebElement Text_Sauce_Labs_Bike_Light;

		@FindBy(xpath="//div[text()='Sauce Labs Bolt T-Shirt']//parent::a//parent::div/following-sibling::div//button")
		private WebElement AddToCartProduct_Sauce_Labs_Bolt_TShirt ;
		
		@FindBy(xpath="//*[text()='Sauce Labs Bolt T-Shirt']")
		private WebElement Product_Sauce_Labs_Bolt_TShirt;
		
		@FindBy(xpath="//div[text()='Sauce Labs Bolt T-Shirt']//parent::a//parent::div/following-sibling::div/div")
		private WebElement Price__Sauce_Labs_Bolt_TShirt;
		
		@FindBy(xpath="//div[text()='Sauce Labs Backpack']//parent::a//following-sibling::div")
		private WebElement Text_Sauce_Labs_Bolt_TShirt;
		
		@FindBy(xpath="//div[text()='Sauce Labs Fleece Jacket']//parent::a//parent::div/following-sibling::div//button")
		private WebElement AddToCartProduct_Sauce_Labs_Fleece_Jacket ;
		
		@FindBy(xpath="//*[text()='Sauce Labs Fleece Jacket']")
		private WebElement Product_Sauce_Labs_Fleece_Jacket ;
		
		@FindBy(xpath="//div[text()='Sauce Labs Fleece Jacket']//parent::a//parent::div/following-sibling::div/div")
		private WebElement Price_Sauce_Labs_Fleece_Jacket ;
		
		@FindBy(xpath="//div[text()='Sauce Labs Backpack']//parent::a//following-sibling::div")
		private WebElement  Text_Sauce_Labs_Fleece_Jacket ;
		
		@FindBy(xpath="//div[text()='Test.allTheThings() T-Shirt (Red)']//parent::a//parent::div/following-sibling::div//button")
		private WebElement AddToCartProduct_Sauce_Labs_Red_Tshirt ;
		
		@FindBy(xpath="//*[text()='Test.allTheThings() T-Shirt (Red)']")
		private WebElement Product_Sauce_Labs_Red_Tshirt;
		
		@FindBy(xpath="//div[text()='Test.allTheThings() T-Shirt (Red)']//parent::a//parent::div/following-sibling::div/div")
		private WebElement Price_Sauce_Labs_Red_Tshirt;
		
		@FindBy(xpath="//div[text()='Sauce Labs Backpack']//parent::a//following-sibling::div")
		private WebElement Text_Sauce_Labs_Red_Tshirt;
		
		@FindBy(xpath="//div[text()='Sauce Labs Onesie']//parent::a//parent::div/following-sibling::div//button")
		private WebElement AddToCartProduct_Sauce_Labs_Onesie ;
		
		@FindBy(xpath="//*[text()='Sauce Labs Onesie']")
		private WebElement Product_Sauce_Labs_Onesie ;
		
		@FindBy(xpath="//div[text()='Test.allTheThings() T-Shirt (Red)']//parent::a//parent::div/following-sibling::div/div")
		private WebElement Price_Sauce_Labs_Onesie ;
		
		@FindBy(xpath="//div[text()='Sauce Labs Backpack']//parent::a//following-sibling::div")
		private WebElement  Text_Sauce_Labs_Onesie ;
		
		@FindBy(xpath="//button[text()='ADD TO CART']")
		private List<WebElement> allItems;

		public WebElement getAddToCartProduct_Sauce_Labs_Backpack() {
			return AddToCartProduct_Sauce_Labs_Backpack;
		}

		public WebElement getProduct_Sauce_Labs_Backpack() {
			return Product_Sauce_Labs_Backpack;
		}

		public WebElement getPrice_Sauce_Labs_Backpack() {
			return Price_Sauce_Labs_Backpack;
		}

		public WebElement getText_Sauce_Labs_Backpack() {
			return Text_Sauce_Labs_Backpack;
		}

		public WebElement getAddToCartProduct_Sauce_Labs_Bike_Light() {
			return AddToCartProduct_Sauce_Labs_Bike_Light;
		}

		public WebElement getProduct_Sauce_Labs_Bike_Light() {
			return Product_Sauce_Labs_Bike_Light;
		}

		public WebElement getPrice_Sauce_Labs_Bike_Light() {
			return Price_Sauce_Labs_Bike_Light;
		}

		public WebElement getText_Sauce_Labs_Bike_Light() {
			return Text_Sauce_Labs_Bike_Light;
		}

		public WebElement getAddToCartProduct_Sauce_Labs_Bolt_TShirt() {
			return AddToCartProduct_Sauce_Labs_Bolt_TShirt;
		}

		public WebElement getProduct_Sauce_Labs_Bolt_TShirt() {
			return Product_Sauce_Labs_Bolt_TShirt;
		}

		public WebElement getPrice__Sauce_Labs_Bolt_TShirt() {
			return Price__Sauce_Labs_Bolt_TShirt;
		}

		public WebElement getText_Sauce_Labs_Bolt_TShirt() {
			return Text_Sauce_Labs_Bolt_TShirt;
		}

		public WebElement getAddToCartProduct_Sauce_Labs_Fleece_Jacket() {
			return AddToCartProduct_Sauce_Labs_Fleece_Jacket;
		}

		public WebElement getProduct_Sauce_Labs_Fleece_Jacket() {
			return Product_Sauce_Labs_Fleece_Jacket;
		}

		public WebElement getPrice_Sauce_Labs_Fleece_Jacket() {
			return Price_Sauce_Labs_Fleece_Jacket;
		}

		public WebElement getText_Sauce_Labs_Fleece_Jacket() {
			return Text_Sauce_Labs_Fleece_Jacket;
		}

		public WebElement getAddToCartProduct_Sauce_Labs_Red_Tshirt() {
			return AddToCartProduct_Sauce_Labs_Red_Tshirt;
		}

		public WebElement getProduct_Sauce_Labs_Red_Tshirt() {
			return Product_Sauce_Labs_Red_Tshirt;
		}

		public WebElement getPrice_Sauce_Labs_Red_Tshirt() {
			return Price_Sauce_Labs_Red_Tshirt;
		}

		public WebElement getText_Sauce_Labs_Red_Tshirt() {
			return Text_Sauce_Labs_Red_Tshirt;
		}

		public WebElement getAddToCartProduct_Sauce_Labs_Onesie() {
			return AddToCartProduct_Sauce_Labs_Onesie;
		}

		public WebElement getProduct_Sauce_Labs_Onesie() {
			return Product_Sauce_Labs_Onesie;
		}

		public WebElement getPrice_Sauce_Labs_Onesie() {
			return Price_Sauce_Labs_Onesie;
		}

		public WebElement getText_Sauce_Labs_Onesie() {
			return Text_Sauce_Labs_Onesie;
		}

		public List<WebElement> getAllItems() {
			return allItems;
		}


	}

	