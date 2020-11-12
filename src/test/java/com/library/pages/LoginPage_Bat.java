package com.library.pages;

import com.library.utils.BrowserUtils;
import com.library.utils.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage_Bat {
    @FindBy(id = "inputEmail")
    public WebElement usernameInput;

    @FindBy(id = "inputPassword")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement signInButton;


    public void login(String role){
        String usernameValue = "";
        String passwordValue = "";

        if (role.equalsIgnoreCase("librarian")) {
            usernameValue = ConfigurationReader.getProperty("librarian");
            passwordValue = ConfigurationReader.getProperty("librarianPD");
        } else {
            usernameValue = ConfigurationReader.getProperty("student");
            passwordValue = ConfigurationReader.getProperty("student_pass");
        }

        BrowserUtils.visibilityOfElement(usernameInput);


        usernameInput.sendKeys(usernameValue);
        passwordInput.sendKeys(passwordValue);
        signInButton.click();

    }
}
