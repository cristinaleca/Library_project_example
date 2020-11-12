package com.library.pages;

import com.library.utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class UserPage_Omer extends BasePage {

    BasePage basePage =new BasePage();

    @FindBy(linkText = "Users")
    private WebElement usersPageLink;


    @FindBy(xpath = "//h3[.='User Management']")
    private WebElement userManagementTitle;

    public void clickUsers (){
        usersPageLink.click();
        System.out.println("User menu was clicked");
    }

    public void verifyUserManagementTitle (){
        Driver.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        String expected = "User Management";
        String actual = userManagementTitle.getText();

        Assert.assertEquals(expected,actual);
        System.out.println("System display successfully User Page ");
    }

}
