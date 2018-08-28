package com.dummytest.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class BasePageObject {



//public WebDriver driver;
    @FindBy(id = "search-destinationAutocomplete")
    public WebElement Destination;

    @FindBy(id = "search-originAutocomplete")
    public WebElement Origin;

    @FindBy(id = "searchBtn")
    public WebElement SearchButton;

    @FindBy(xpath = "//label[@id='labelFor-RadioBtn-ProductCell-0-0']")
    public WebElement SelectTicket;

    @FindBy(id = "journeySummary-btn")
    public WebElement ContinueButton;

    @FindBy(id = "signInBtn")
    public WebElement SignInOnCheckOut;

    @FindBy(id = "TextBox-EmailTextBox")
    public WebElement EmailField;

    @FindBy(id = "TextBox-PasswordTextBox")
    public WebElement PasswordField;

    @FindBy(id = "ModelSignInBtn")
    public WebElement SignInButtonOnPupup;

    @FindBy(xpath = "//span[@class='radio-title' and text()='Yes']")
    public WebElement PhotoCardRadioButton;

    @FindBy(id = "CreditCardCVVNumber")
    public WebElement Cvv;

    @FindBy(id = "paymentBtn")
    public WebElement PaymentButton;

    @FindBy (xpath ="//p[@class='BookingConfirmation-orderReferenceInfo']/strong")
    public WebElement TransactionId;
}
