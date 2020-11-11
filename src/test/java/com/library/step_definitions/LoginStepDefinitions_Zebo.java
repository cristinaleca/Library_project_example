package com.library.step_definitions;

import com.library.pages.LoginPage;
import com.library.utils.ConfigurationReader;
import com.library.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginStepDefinitions_Zebo {
LoginPage loginPage= new LoginPage();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
      String url = ConfigurationReader.getProperty("qa2_url");
       Driver.getDriver().get(url);
    }

    @When("User logs in as librarian")
    public void user_logs_in_as_librarian() {
        String username = ConfigurationReader.getProperty("lib22_user");
        String password = ConfigurationReader.getProperty("lib22_pass");
        loginPage.usernameInput.sendKeys(username);
        loginPage.passwordInput.sendKeys(password);
        loginPage.signInButton.click();
    }

    @Then("User should see dashboard")
    public void user_should_see_dashboard() {
     String expected = "dashboard";
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.urlContains(expected));

      String actual = Driver.getDriver().getCurrentUrl();
      Assert.assertTrue(actual.contains(expected));
    }


}