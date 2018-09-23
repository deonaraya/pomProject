package com.alex.chang.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavPage extends BasePage {

    public NavPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
        waitForWebElement(footerSection);
    }

    @FindBy(id = "footer")
    private WebElement footerSection;

    @FindBy(xpath = "//footer[@id='footer']//a[@title='My orders']")
    private WebElement myOrdersLink;

    @FindBy(xpath = "//footer[@id='footer']//a[@title='My credit slips']")
    private WebElement myCreditslipsLink;

    @FindBy(xpath = "//footer[@id='footer']//a[@title='My addresses']")
    private WebElement myAddressesLink;

    @FindBy(xpath = "//footer[@id='footer']//a[@title='Manage my personal information']")
    private WebElement myPersonalInfoLink;

    @FindBy(xpath = "//footer[@id='footer']//a[@title='Sign out']")
    private WebElement signOutLink;

    public OrderHistoryPage navToMyOrders(){
        myOrdersLink.click();
        return new OrderHistoryPage(driver);
    }

    public AuthenticationPage signOut(){
        signOutLink.click();
        return new AuthenticationPage(driver);
    }






}
