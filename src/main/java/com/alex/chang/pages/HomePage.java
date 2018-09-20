package com.alex.chang.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePage extends BasePage {

    //STEPS :
//    1. Creaste /Store  WebEleemtns
//    2. Writer menthodds on these webElements
//    3. Create a constructor dfor the webDriver to be initialized
//    4. Define PAge Factory.initiElements


    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
        waitForWebElement(catalogTabs);
    }


//    Traditional way of storing webelements
//    WebElement element = driver.findElement(By.id("test"));

    // Parking the question why we moved away from the traditional way of storing locators


//    @FindBy(xpath = "TestAgain")
//    private WebElement dummyLocator;


    @FindBy(id = "home-page-tabs")
    private WebElement catalogTabs ;

    @FindBy(className = "blockbestsellers")
    private WebElement bestSellerCatalog ;

    @FindBy(className = "homefeatured")
    private WebElement popularCatalog ;

    //concept of list of weblements ...
    @FindBy(xpath="//ul[@id='homefeatured']/li//div[@class='right-block']//a[@class='product-name']")
    private List<WebElement> productNames ;

    //concept of list of weblements ...
    @FindBy(xpath="//ul[@id='homefeatured']/li//div[@class='right-block']//span[@itemprop='price']")
    private List<WebElement> productPrices ;

    @FindBy(xpath = "//ul[@id='homefeatured']/li[1]/div")
    private WebElement productContainer1 ;

    @FindBy(xpath = "//ul[@id='homefeatured']/li[2]/div")
    private WebElement productContainer2 ;

    @FindBy(xpath = "//ul[@id='homefeatured']/li[3]/div")
    private WebElement productContainer3 ;

    //concept of index
    @FindBy(xpath = "//ul[@id='homefeatured']/li[1]//div[@class='right-block']//a[@class='product-name']")
    private WebElement productName1 ;

    @FindBy(xpath = "//ul[@id='homefeatured']/li[1]//a[@title='Add to cart']")
    private WebElement addToCartButton1 ;

    @FindBy(xpath = "//ul[@id='homefeatured']/li[2]//a[@title='Add to cart']")
    private WebElement addToCartButton2 ;

    @FindBy(xpath = "//ul[@id='homefeatured']/li[3]//a[@title='Add to cart']")
    private WebElement addToCartButton3 ;

    @FindBy(xpath = "//ul[@id='homefeatured']/li[2]//div[@class='right-block']//a[@class='product-name']")
    private WebElement productName2 ;

    @FindBy(xpath = "//ul[@id='homefeatured']/li[3]//div[@class='right-block']//a[@class='product-name']")
    private WebElement productName3 ;

    //concept of custom attributes
    @FindBy(xpath = "//ul[@id='homefeatured']/li[1]//div[@class='right-block']//span[@itemprop='price']")
    private WebElement productPrice1 ;

    @FindBy(xpath = "//ul[@id='homefeatured']/li[2]//div[@class='right-block']//span[@itemprop='price']")
    private WebElement productPrice2 ;

    @FindBy(xpath = "//ul[@id='homefeatured']/li[3]//div[@class='right-block']//span[@itemprop='price']")
    private WebElement productPrice3 ;


    // if Non-Naigational method : we return the Object of same page.
    // if navigational method ,we return the object of the page user has nvigated to




    public HomePage getProductNames(){
        for (WebElement names: productNames) {
            System.out.println(names.getText());
        }
//        return new HomePage(driver);
        return this;
    }

    public HomePage getProductPrices(){
        for (WebElement prices: productPrices) {
            System.out.println(prices.getText());
        }
        return this ;
    }

    public AddToCartPopUp addToCart(){

        //mouse hover
        Actions actions = new Actions(driver);
        actions.moveToElement(productContainer3).build().perform();

        waitForWebElement(addToCartButton3);
        addToCartButton3.click();
        return new AddToCartPopUp(driver);
    }












}
