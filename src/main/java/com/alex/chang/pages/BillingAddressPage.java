package com.alex.chang.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingAddressPage extends BasePage {

    public BillingAddressPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
        waitForWebElement(addressSelect);
    }



    @FindBy(id = "uniform-id_address_delivery")
    private WebElement addressSelect ;

    @FindBy(name = "processAddress")
    private WebElement checkoutStep3 ;

    public ShippingAddressPage navToShipping(){
        checkoutStep3.click();
        return new ShippingAddressPage(driver);
    }
}
