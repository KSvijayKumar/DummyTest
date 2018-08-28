package com.dummytest.PageActions;

import com.dummytest.PageObject.BasePageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.PublicKey;
import java.util.concurrent.TimeUnit;

public class BasePageAction {

    public WebDriver driver;
    BasePageObject abc = new BasePageObject();

    public BasePageAction(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, abc);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    };

    public void enterSearchCriteria(String origin,String destination,String email,String password,String cvv) {

        abc.Origin.sendKeys(origin,Keys.RETURN);
        abc.Destination.sendKeys(destination,Keys.RETURN);
        abc.SearchButton.click();
        abc.SelectTicket.click();
        abc.ContinueButton.click();
        abc.SignInOnCheckOut.click();
        abc.EmailField.sendKeys(email);
        abc.PasswordField.sendKeys(password);
        abc.SignInButtonOnPupup.click();
        abc.PhotoCardRadioButton.click();
        abc.Cvv.sendKeys(cvv);
        abc.PaymentButton.click();
        WebDriverWait wait=new WebDriverWait(driver, 10);

        }

        public String getTransactionId(){

        return abc.TransactionId.getText();

        }

}
