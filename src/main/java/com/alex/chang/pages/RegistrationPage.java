package com.alex.chang.pages;

import com.sun.tools.javac.parser.DocCommentParser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage extends NavPage {

    public RegistrationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        waitForWebElement(subHeading);
    }

    @FindBy(xpath = "//h3[text()='Your personal information']")
    private WebElement subHeading;

    @FindBy(id="noSlide")
    private WebElement RegistrationFormPage ;

    @FindBy(xpath = "//label[@for='id_gender2']")
    private WebElement mrstext ;

    @FindBy(id="id_gender2")
    private WebElement mrsRadioButton ;

    @FindBy(id="id_gender1")
    private WebElement mrRadioButton ;

    @FindBy(xpath="//label[@for='customer_firstname']")
    private WebElement textabovefirstname;

    @FindBy(id="customer_firstname")
    private WebElement FirstNametextfield  ;

    @FindBy(id="customer_lastname")
    private WebElement LastNametextfield ;

    @FindBy(id="passwd")
    private WebElement password;

    @FindBy(id="days")
    private WebElement DOBdropdown ;

    @FindBy(id="months")
    private WebElement MOBDropDown ;

    @FindBy(id="years")
    private WebElement YOBDropDown ;

    @FindBy(id="company")
    private WebElement CompanyTextField ;

    @FindBy(id="address1")
    private WebElement Address1TextField ;

    @FindBy(id="address2")
    private WebElement Address2TextField ;

    @FindBy(id="city")
    private WebElement CityTextField ;

    @FindBy(id="id_state")
    private WebElement StateDropDown ;

    @FindBy(id="postcode")
    private WebElement ZipcodeTextField ;

    @FindBy(id="id_country")
    private WebElement CountryDropDown ;

    @FindBy(id="phone_mobile")
    private WebElement PhnoTextField ;

    @FindBy(id="alias")
    private WebElement AlternateAddressField ;

    @FindBy(id="submitAccount")
    private WebElement RegisterButton ;

    public void register(){

//        mrstext.click();
        mrsRadioButton.click();

        Select date = new Select(DOBdropdown);
        date.selectByValue("29");

        Select month = new Select(MOBDropDown);
        month.selectByIndex(10);

        Select year = new Select(YOBDropDown);
        year.selectByValue("1987");

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
