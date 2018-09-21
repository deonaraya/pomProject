package com.alex.chang.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationPage extends NavPage {

    //    1. Creaste /Store  WebEleemtns
//    2. Writer menthodds on these webElements
//    3. Create a constructor dfor the webDriver to be initialized
//    4. Define PAge Factory.initiElements
//    5. Extend the class to BasePAge Class .. ad super(driver) keywoird to cunstructor.


    public AuthenticationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
        waitForWebElement(registerContainer);
    }

    @FindBy(id = "create-account_form")
    private WebElement registerContainer;

    @FindBy(xpath = "//h3[text()='Already registered?']")
    private WebElement signInHeader ;

    @FindBy(id = "email_create")
    private WebElement createEmailTextField ;

    @FindBy(id = "SubmitCreate")
    private WebElement createAccountButoon ;

    @FindBy(id = "email")
    private WebElement emailTextField ;

    @FindBy(id = "passwd")
    private WebElement passwordTextField ;

    @FindBy(id = "SubmitLogin")
    private WebElement loginButton ;


    public RegistrationPage signUp(String username){
        createEmailTextField.sendKeys(username);
        createAccountButoon.click();
        return new RegistrationPage(driver);

    }

    public BillingAddressPage signIn(String user, String password){
        emailTextField.sendKeys(user);
        passwordTextField.sendKeys(password);
        loginButton.click();
        return new BillingAddressPage(driver);
    }




}
