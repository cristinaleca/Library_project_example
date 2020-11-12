package com.library.step_definitions;

import com.library.pages.BasePage;
import com.library.pages.HomePage;
import com.library.pages.LoginPage;
import com.library.pages.UserPage_Omer;
import com.library.utils.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LibrarianStepDefinitions_Omer {
    BasePage basePage = new BasePage();
    LoginPage login = new LoginPage();
    HomePage homePage = new HomePage();
    UserPage_Omer userPageOmer = new UserPage_Omer();

    @Given("User navigates to the login page")
    public void userNavigatesToTheLoginPage() {
       basePage.navigateToWebPage();
    }

    @And("User logs in as an authorized user")
    public void userLogsInAsAnAuthorizedUser() {
        String usernameValue = ConfigurationReader.getProperty("librarian");
        String passwordValue = ConfigurationReader.getProperty("librarianPD");

        login.login(usernameValue,passwordValue);
    }


    @When("librarian click User page module")
    public void librarian_click_user_page_module() {
        userPageOmer.clickUsers();
    }


    @Then("System should display User Page")
    public void system_should_display_user_page() {
        userPageOmer.verifyUserManagementTitle();

    }

    @Given("The librarian verifies on the Home page")
    public void theLibrarianVerifiesOnTheHomePage() {
        homePage.verifyUserIsOnTheHomePage();
    }
}
