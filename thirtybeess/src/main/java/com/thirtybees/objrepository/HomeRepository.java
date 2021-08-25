package com.thirtybees.objrepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeRepository {
	
	//slider page objects
	@FindBy(xpath = "//div[@class='homeslider-wrapper hidden-xs']//h3[@style='float:left;clear:both;font-size:30px;']")
	protected List<WebElement> sliderHeading;
	
	@FindBy(className = "bx-prev")
	protected WebElement previousBtn;
	
	@FindBy(className = "bx-next")
	protected WebElement nextBtn;
	
	//products page objects
	
	//main[@id='center_column']//div[@class='tm-home col-xs-12'][1]
	//main[@id='center_column']//ul[@id='homefeatured'][1]
	
	@FindBy(xpath = "//main[@id='center_column']//ul[@id='homefeatured'][1]//li[1]")
	protected WebElement candleImg;
	
	@FindBy(xpath = "//main[@id='center_column']//ul[@id='homefeatured'][1]//li[1]//div[@class='product-description-container']")
	protected WebElement candle;
	
	@FindBy(xpath = "//a[contains(text(),'Soap')]")
	protected WebElement soap;
	
	@FindBy(xpath = "//img[@title='Soap']")
	protected WebElement soapImg;
	
	@FindBy(xpath = "//main[@id='center_column']//ul[@id='homefeatured'][1]//li[3]")
	protected WebElement coffeeImg;
	
	@FindBy(xpath = "//main[@id='center_column']//ul[@id='homefeatured'][1]//li[3]//h3[@class='h4 product-name']")
	protected WebElement coffee;
	
	@FindBy(xpath = "//main[@id='center_column']//ul[@id='homefeatured'][1]//li[4]//h3[@class='h4 product-name']")
	protected WebElement tinCup;
	
	@FindBy(xpath = "//main[@id='center_column']//ul[@id='homefeatured'][1]//li[4]")
	protected WebElement tinCupImg;
	
	@FindBy(xpath = "//main[@id='center_column']//ul[@id='homefeatured'][1]//li[1]//span[text()='Add to cart']")
	protected WebElement addToCartCandle;
	
	@FindBy(xpath = "//main[@id='center_column']//ul[@id='homefeatured'][1]//li[2]//span[text()='Add to cart']")
	protected WebElement addToCartSoap;
	
	@FindBy(xpath = "//main[@id='center_column']//ul[@id='homefeatured'][1]//li[3]//span[text()='Add to cart']")
	protected WebElement addToCartCoffee;
	
	@FindBy(xpath = "//main[@id='center_column']//ul[@id='homefeatured'][1]//li[4]//span[text()='Add to cart']")
	protected WebElement addToCartTinCup;
	
	@FindBy(xpath = "//div[@class='tm-home col-xs-12'][2]//li[1]")
	protected WebElement mugImg;
	
	@FindBy(xpath = "//a[contains(text(), 'Mug')]")
	protected WebElement mug;
	
	//main[@id='center_column']//div[@class='tm-home col-xs-12'][2]//li[2]//div[@class='product-image-container']
	@FindBy(xpath = "//div[@class='tm-home col-xs-12'][2]//li[2]//div[@class='product-image-container']")
	protected WebElement candleImg2;
	
	@FindBy(xpath = "//div[@class='tm-home col-xs-12'][2]//li[2]//h3[@class='h4 product-name']")
	protected WebElement candleText;
	
	
	//blog page objects
	
	@FindBy(xpath = "//div[@class='col-xs-12 col-md-4']//h5")
	protected List<WebElement> blogHeaders;
	
	@FindBy(xpath = "//a[@title='Organic Gifts' and text()='Read More']")
	protected WebElement readMoreOrganicGiftsBlog;
	
	@FindBy(xpath = "//a[@title='Hand Picked Teas' and text()='Read More']")
	protected WebElement readMoreHandPickedTeasBlog;
	
	@FindBy(xpath = "//a[@title='Organic Roasted Coffee' and text()='Read More']")
	protected WebElement readMoreOrganicRoastedCoffeeBlog;
	
	//Header object repo
	
	@FindBy(xpath = "//a[@class='login']")
	protected WebElement signInLink;
	
	
	@FindBy(xpath="//div/h2/span")
	 protected WebElement header;
	
	@FindBy(xpath="//button[text()='Shop now !']")
	 protected List<WebElement> shopnowbtn;
	
	
	@FindBy(xpath="//*[text()='Marketplace']")
	 protected WebElement marketplacelink;
	
	@FindBy(xpath="//p[text()='The best selection for top prices.']")
	protected WebElement subHeader;
	
	@FindBy(xpath="//img[@title='Candle']")
	protected WebElement productImg;
	
	@FindBy(xpath="//section/div/h2/a")
	 protected WebElement blogSectnHeader;	
	
	@FindBy(xpath="//section/div/p")
	protected WebElement blogSubHeader;
  	
	
	@FindBy(xpath="//a[@class='beesblogrecentpostshome-title']")
	   protected List<WebElement> blogtitles;
  
	@FindBy(xpath="//a[@class='btn btn-primary']")
   protected WebElement  readmorebtn;
   

   
 
}
