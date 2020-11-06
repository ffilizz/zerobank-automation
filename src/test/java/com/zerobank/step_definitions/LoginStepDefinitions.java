package com.zerobank.step_definitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtilities;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginStepDefinitions {
    LoginPage loginPage=new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("Open login page");
        String URL = ConfigurationReader.getProperty("qa1");
        Driver.getDriver().get(URL);
        loginPage.clickOnSignInButton();
    }

    @When("User logs in with valid credentials")
    public void user_logs_in_with_valid_credentials() {
        loginPage.login();

    }

    @Then("Account summary page should be displayed")
    public void account_summary_page_should_be_displayed() {
        BrowserUtilities.waitForPageToLoad(5);
        BrowserUtilities.wait(2);
        Assert.assertTrue("Account Summary",Driver.getDriver().getTitle().contains("Account Summary"));

    }

    @When("Users with wrong username or wrong password should not be able to login")
    public void users_with_wrong_username_or_wrong_password_should_not_be_able_to_login() {
            loginPage.login("username","pasword");

        }


    @When("Users with blank username or password should also not be able to login")
    public void users_with_blank_username_or_password_should_also_not_be_able_to_login() {
        loginPage.login("","password");


    }

    @Then("Error message {string} should be displayed")
    public void error_message_should_be_displayed(String string) {
        Assert.assertEquals(string,loginPage.login_WarningMessage());

    }

}
