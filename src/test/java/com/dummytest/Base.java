package com.dummytest;

import com.dummytest.Utils.UrlGetter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class Base {

    UrlGetter url;
    public Base()
    {
        url = new UrlGetter();

    }

    public ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();


        public void setDriver(WebDriver driver) {
        this.driver.set(driver);
    }

    public WebDriver getDriver() {
        return driver.get();
    }

    public void LoadUrl()
    {

        String A = url.abc();
        System.out.println("This is the URL:" + A);
        getDriver().get(A);
    }

    @BeforeMethod
    public void intialiseDriver()
    {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\vijayk\\IdeaProjects\\MyTest\\Drivers\\chromedriver.exe");
        setDriver(new ChromeDriver());
        LoadUrl();
    }

    @AfterMethod
    public void disposeDrvier()
    {
        driver.get().quit();
    }

    }

