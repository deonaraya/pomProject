package com.alex.chang.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AddToCartPopUp extends BasePage {

    public AddToCartPopUp(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
        waitForWebElement(addToCartSuccessMessage);
    }

//    1. Creaste /Store  WebEleemtns
//    2. Writer menthodds on these webElements
//    3. Create a constructor dfor the webDriver to be initialized
//    4. Define PAge Factory.initiElements
//    5. Extend the class to BasePAge Class .. ad super(driver) keywoird to cunstructor.



    @FindBy(xpath = "//i[@class='icon-ok']/parent::h2")
    private WebElement addToCartSuccessMessage ;


    @FindBy(xpath="//a[@title='Proceed to checkout']")
    private WebElement checkOutButton;


    @FindBy(xpath="//a[@title='Continue shopping']")
    private WebElement continueSHoppingButton;


    public AddToCartPopUp verifySuccessMessage(){
        Assert.assertEquals(addToCartSuccessMessage.getText(),"Product successfully added to your shopping cart");
        return this;
    }

    public CartSummaryPage proceedToCheckOut(){
        checkOutButton.click();
        return new CartSummaryPage(driver);
    }


}
