package com.library.pages;

import com.library.utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class HomePage extends BasePage {

    @FindBy(xpath = "//span[.='Test Librarian 55']")
    private WebElement userName;

    public void verifyUserIsOnTheHomePage (){
        Driver.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        String expected = "Test Librarian 55";
        String actual = userName.getText();
        Assert.assertEquals(expected,actual);
        System.out.println("User name verified successfully ");
    }
}
